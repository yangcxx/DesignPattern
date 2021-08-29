package cn.cxy.designpattern.dynamic_proxy_1;

/**
 * @author yWX929313
 * @date 2021/8/27 14:46
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // Tank tank = new Tank();
        // TankTimeProxyOriginal timeProxy = new TankTimeProxyOriginal(tank);
        // timeProxy.move();


        Moveable moveable = (Moveable) Proxy.newProxyInstance();
        moveable.move();
    }

}

