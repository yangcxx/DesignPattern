package cn.cxy.designpattern.dynamic_proxy_2;

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
 * @author yWX929313
 * @date 2021/8/27 15:18
 */
public class Proxy {

    public static Object newProxyInstance(Class<?> aInterface) throws Exception {
        String rt = "\r\n";
        StringBuilder methodStr = new StringBuilder();
        for (Method method : aInterface.getMethods()) {
            String name = method.getName();
            methodStr.append("\n")
                    .append("@Override\n" + "    public void ")
                    .append(name)
                    .append("() {\n")
                    .append("        long start = System.currentTimeMillis();\n")
                    .append("        System.out.println(\"Task starts at \" + start);\n")
                    .append("        t.").append(name)
                    .append("();\n")
                    .append("        long end = System.currentTimeMillis();\n")
                    .append("        System.out.println(\"Task cost \" + (end - start) + \" ms\");\n")
                    .append("    }")
                    .append("\n");

        }
        String aInterfaceName = aInterface.getName();
        String javaFile = "package cn.cxy.designpattern.dynamic_proxy_2;\n" +
                "\n" +
                "public class TankTimeProxy implements " + aInterfaceName + " {\n" +
                "\n" +
                "    private final " + aInterfaceName + " t;\n" +
                "\n" +
                "    public TankTimeProxy(" + aInterfaceName + " t) {\n" +
                "        this.t = t;\n" +
                "    }\n" +
                methodStr +
                "}";
        // 将源码写到Java文件中
        File file = new File("D:\\myIDEAProjects\\dp\\src\\main\\java\\cn\\cxy\\designpattern\\dynamic_proxy_2\\TankTimeProxy.java");
        FileWriter writer = new FileWriter(file);
        writer.write(javaFile);
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
        Class<?> aClass = classLoader.loadClass("cn.cxy.designpattern.dynamic_proxy_2.TankTimeProxy");
        System.out.println("Proxy name: " + aClass.getName());
        Constructor<?> constructor = aClass.getConstructor(aInterface);
        return constructor.newInstance(new Tank());
    }

}
