package cn.cxy.designpattern.dynamic_proxy_3;

/**
 * @author yWX929313
 * @date 2021/8/27 17:10
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Tank tank = new Tank();
        InvocationHandler handler = new LogHandler(tank);
        Moveable moveable = (Moveable) Proxy.newInstance(Moveable.class, handler);
        moveable.move();
        moveable.stop();
    }

}
