package cn.cxy.designpattern.dynamic_proxy.dynamic.test;

import cn.cxy.designpattern.dynamic_proxy.dynamic.Vehicle;
import cn.cxy.designpattern.dynamic_proxy.dynamic.Tank;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * Function: 模拟javac编译并通过反射创建对象
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 23:03 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class CompileTest {

    public static void main(String[] args) throws Exception {
        String enter = "\r\n";
        //1、需要编译的文件 - 转换为字符串
        String str = "package cn.cxy.designpattern.dynamic_proxy.dynamic;\n" + enter +
                "\n" + enter +
                "public class TimeLogProxy implements Vehicle {\n" + enter +
                "\n" + enter +
                "    Vehicle movable;\n" + enter +
                "\n" + enter +
                "    public TimeLogProxy(Vehicle movable) {\n" + enter +
                "        this.movable = movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                "    public Vehicle getMovable() {\n" + enter +
                "        return movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                "    public void setMovable(Vehicle movable) {\n" + enter +
                "        this.movable = movable;\n" + enter +
                "    }\n" + enter +
                "\n" + enter +
                "    @Override\n" + enter +
                "    public void move() {\n" + enter +
                "        System.out.println(\"Log start...\");\n" + enter +
                "        movable.move();\n" + enter +
                "        System.out.println(\"Log end...\");\n" + enter +
                "    }\n" + enter +
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
        URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "\\src")};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class<?> aClass = classLoader.loadClass("cn.cxy.designpattern.dynamic_proxy.dynamic.TimeLogProxy");
        System.out.println(aClass.getName());

        Constructor<?> constructor = aClass.getConstructor(Vehicle.class);
        Vehicle t = (Vehicle) constructor.newInstance(new Tank());
        t.move();
    }

}
