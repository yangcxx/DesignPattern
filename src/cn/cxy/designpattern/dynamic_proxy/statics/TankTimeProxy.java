package cn.cxy.designpattern.dynamic_proxy.statics;

/**
 * Function: 静态代理
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 21:59 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class TankTimeProxy implements Movable {

    Movable t;

    public TankTimeProxy(Movable t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("start time: "+System.currentTimeMillis());
        t.move();
        System.out.println("end time: "+System.currentTimeMillis());
    }
}
