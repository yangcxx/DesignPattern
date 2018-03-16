package cn.cxy.designpattern.dynamic_proxy.dynamic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 19:13 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
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
            method.invoke(target, new Object[]{});
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Log end... count " + (end - start) + " ms");
    }
}
