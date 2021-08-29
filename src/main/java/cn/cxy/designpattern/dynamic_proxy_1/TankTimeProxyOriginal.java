package cn.cxy.designpattern.dynamic_proxy_1;

/**
 * @author yWX929313
 */
public class TankTimeProxyOriginal implements Moveable{

    private final Moveable moveable;

    public TankTimeProxyOriginal(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Task starts at " + start);
        moveable.move();
        long end = System.currentTimeMillis();
        System.out.println("Task cost " + (end - start) + " ms");
    }
}