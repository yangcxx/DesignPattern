package cn.cxy.designpattern.dynamic_proxy.dynamic;

import java.lang.reflect.Method;

/**
 * Function: 具体需要代理执行的操作
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 19:11 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface InvocationHandler {

    /**
     * 通过反射执行目标方法
     * @param o 需要被执行方法的对象
     * @param method 需要被执行的方法
     * @throws Exception
     */
    void invoke(Object o, Method method) throws Exception;

}
