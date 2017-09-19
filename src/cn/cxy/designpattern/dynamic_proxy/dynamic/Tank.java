package cn.cxy.designpattern.dynamic_proxy.dynamic;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 23:00 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("Tank is moving...");
    }
}
