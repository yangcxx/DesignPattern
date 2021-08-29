package cn.cxy.designpattern.dynamic_proxy_3;

public class TankTimeProxyOriginal implements Moveable {

    private final Moveable t;

    public TankTimeProxyOriginal(Moveable t) {
        this.t = t;
    }

    @Override
    public void stop() {
        long start = System.currentTimeMillis();
        System.out.println("Task starts at " + start);
        t.stop();
        long end = System.currentTimeMillis();
        System.out.println("Task cost " + (end - start) + " ms");
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Task starts at " + start);
        t.move();
        long end = System.currentTimeMillis();
        System.out.println("Task cost " + (end - start) + " ms");
    }
}