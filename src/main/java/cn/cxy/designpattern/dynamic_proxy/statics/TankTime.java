package cn.cxy.designpattern.dynamic_proxy.statics;

/**
 * Function: 使用继承方式实现代理-1
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 21:50 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class TankTime extends Tank {

    public void move() {
        System.out.println("start time: " + System.currentTimeMillis());
        super.move();
        System.out.println("end time: " + System.currentTimeMillis());
    }
}
