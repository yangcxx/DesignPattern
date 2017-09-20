package cn.cxy.designpattern.dynamic_proxy.dynamic;

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
    @Override
    public void invoke(Object o, Method method) throws Exception {
        System.out.println("Log start...");
        method.invoke(o,new Object[]{});
        System.out.println("Log end...");
    }
}
