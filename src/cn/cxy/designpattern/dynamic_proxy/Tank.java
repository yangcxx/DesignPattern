package cn.cxy.designpattern.dynamic_proxy;

import java.util.Random;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 21:48 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank is moving...");
        try {
            //随机 sleep
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
