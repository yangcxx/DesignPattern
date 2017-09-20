package cn.cxy.designpattern.dynamic_proxy.dynamic;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * Function: 动态编译方法类
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 18:11 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Proxy {

    /**
     * @param aInterface 目标类需要实现的接口
     * @param handler    需要对方法执行的操作
     * @return
     * @throws Exception
     */
    public static Object newInstance(Class aInterface, InvocationHandler handler) throws Exception {
        String enter = "\r\n";

        String methodStr = "";
        //cxy 根据接口动态拼装已有方法实现  --  暂时忽略返回值及参数列表
        Method[] methods = aInterface.getMethods();
        for (Method m : methods) {
            methodStr += "@Override " + enter +
                    "public void " + m.getName() + " (){" + enter +
                    //TODO 将具体的方法实现进行剥离 - InvocationHandler
                    /*"    System.out.println(\"Log start...\");\n" + enter +
                    "    movable." + m.getName() + "();\n" + enter +
                    "    System.out.println(\"Log end...\");" + enter +*/
                    "    handler.invoke(this," + m + ")" + enter +
                    "}" + enter;
        }

        //1、需要编译的文件 - 转换为字符串
        String str = "package cn.cxy.designpattern.dynamic_proxy.dynamic;\n" + enter +
                "\n" + enter +
                "public class TimeLogProxy implements " + aInterface.getName() + " {\n" + enter +
                "\n" + enter +
                "    Movable movable;\n" + enter +
                "\n" + enter +
                "    public TimeLogProxy(Movable movable) {\n" + enter +
                "        this.movable = movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                "    public Movable getMovable() {\n" + enter +
                "        return movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                "    public void setMovable(Movable movable) {\n" + enter +
                "        this.movable = movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                methodStr + enter +
                "}";

        //2、根据字符串内容写入到本地磁盘目标文件中
        String dir = System.getProperty("user.dir") + "//src//cn//cxy//designpattern//dynamic_proxy//dynamic//TimeLogProxy.java";
        System.out.println(dir);
        File file = new File(dir);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        fw.write(str);
        fw.flush();
        fw.close();
        //3、获取Java内置编译器并进行编译得到class文件
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        System.out.println(javaCompiler.getClass().getName());
        StandardJavaFileManager fileMgr = javaCompiler.getStandardFileManager(null, Locale.CHINA, Charset.defaultCharset());
        Iterable<? extends JavaFileObject> fileObjects = fileMgr.getJavaFileObjects(dir);
        JavaCompiler.CompilationTask compilerTask = javaCompiler.getTask(null, fileMgr, null, null, null, fileObjects);
        compilerTask.call();
        fileMgr.close();
        //4、加载到内存并通过反射创建对象
        //cxy 普通 ClassLoader 只能 load classpath 路径下的 class 文件
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "\\src\\")};//TODO 路径需要/
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class<?> aClass = classLoader.loadClass("cn.cxy.designpattern.dynamic_proxy.dynamic.TimeLogProxy");
        System.out.println(aClass.getName());

        Constructor<?> constructor = aClass.getConstructor(Movable.class);
        Movable t = (Movable) constructor.newInstance(new Tank());
        return t;
    }

}
