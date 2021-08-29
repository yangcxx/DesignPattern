package cn.cxy.designpattern.dynamic_proxy_3;

import java.lang.reflect.Method;

/**
 * @author yWX929313
 * @date 2021/8/27 16:37
 */
public interface InvocationHandler {

    void invoke(Object o, Method method);

}
