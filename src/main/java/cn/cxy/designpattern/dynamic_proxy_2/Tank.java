package cn.cxy.designpattern.dynamic_proxy_2;

import java.util.Random;

/**
 * @author yWX929313
 * @date 2021/8/27 15:15
 */
public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("tank move........");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Tank stopping...");
    }
}
