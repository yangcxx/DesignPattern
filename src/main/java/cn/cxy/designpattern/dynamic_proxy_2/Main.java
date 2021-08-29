package cn.cxy.designpattern.dynamic_proxy_2;

/**
 * @author yWX929313
 * @date 2021/8/27 16:16
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Tank tank = new Tank();
        // TankTimeProxyOriginal tankTimeProxy = new TankTimeProxyOriginal(tank);
        // tankTimeProxy.move();
        // tankTimeProxy.stop();

        Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
        m.move();
        m.stop();

        // Tank tank = new Tank();
        // TankTimeProxy timeProxy = new TankTimeProxy(tank);
        // timeProxy.move();
    }

}
