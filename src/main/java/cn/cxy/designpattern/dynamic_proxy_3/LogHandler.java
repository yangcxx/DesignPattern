package cn.cxy.designpattern.dynamic_proxy_3;

import java.lang.reflect.Method;

/**
 * @author yWX929313
 * @date 2021/8/27 16:38
 */
public class LogHandler implements InvocationHandler {

    private Object target;

    public LogHandler(Object target) {
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method method) {
        long start = System.currentTimeMillis();
        System.out.println("Log start... @ " + start);
        try {
            method.invoke(target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Log end... count " + (end - start) + " ms");
    }
}
