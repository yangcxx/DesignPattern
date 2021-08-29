package cn.cxy.designpattern.dynamic_proxy_1;

import java.util.concurrent.TimeUnit;

/**
 * @author yWX929313
 * @date 2021/8/27 14:25
 */
public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("tank move....");
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
