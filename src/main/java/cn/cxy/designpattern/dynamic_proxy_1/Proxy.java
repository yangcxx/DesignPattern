package cn.cxy.designpattern.dynamic_proxy_1;

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
 * @author yWX929313
 * @date 2021/8/27 14:29
 */
public class Proxy {

    public static Object newProxyInstance() throws Exception {
        // 动态代理文件的源码
        String methodStr = "package cn.cxy.designpattern.dynamic_proxy_1;\n" +
                "\n" +
                "public class TankTimeProxy implements Moveable{\n" +
                "\n" +
                "    private final Moveable moveable;\n" +
                "\n" +
                "    public TankTimeProxy(Moveable moveable) {\n" +
                "        this.moveable = moveable;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void move() {\n" +
                "        long start = System.currentTimeMillis();\n" +
                "        System.out.println(\"Task starts at \" + start);\n" +
                "        moveable.move();\n" +
                "        long end = System.currentTimeMillis();\n" +
                "        System.out.println(\"Task cost \" + (end - start) + \" ms\");\n" +
                "    }\n" +
                "}";
        // 将源码写到Java文件中
        File file = new File("D:\\myIDEAProjects\\dp\\src\\main\\java\\cn\\cxy\\designpattern\\dynamic_proxy_1\\TankTimeProxy.java");
        FileWriter writer = new FileWriter(file);
        writer.write(methodStr);
        writer.flush();
        writer.close();
        // 编译源码,生成 class 文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        System.out.println("JavaCompiler==> " + compiler.getClass().getName());
        // 文件管理器
        StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, Locale.CHINA, Charset.defaultCharset());
        // 编译单元
        Iterable<? extends JavaFileObject> fileObjects = fileMgr.getJavaFileObjects(file);
        // 编译任务
        JavaCompiler.CompilationTask compilerTask = compiler.getTask(null, fileMgr, null, null, null, fileObjects);
        // 编译生成 class 文件
        compilerTask.call();
        fileMgr.close();
        // 加载类
        URL[] urls = {new URL("file:/" + System.getProperty("user.dir") + "\\src\\main\\java\\")};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class<?> aClass = classLoader.loadClass("cn.cxy.designpattern.dynamic_proxy_1.TankTimeProxy");
        System.out.println("Proxy name: " + aClass.getName());
        Constructor<?> constructor = aClass.getConstructor(Moveable.class);
        return constructor.newInstance(new Tank());
    }

}
