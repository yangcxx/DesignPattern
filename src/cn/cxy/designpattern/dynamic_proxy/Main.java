package cn.cxy.designpattern.dynamic_proxy;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 21:54 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Main {

    public static void main(String[] args){
        Tank t = new Tank();
        Movable tlp = new TankLogProxy(t);
        Movable ttp = new TankTimeProxy(tlp);
        ttp.move();
    }

}
