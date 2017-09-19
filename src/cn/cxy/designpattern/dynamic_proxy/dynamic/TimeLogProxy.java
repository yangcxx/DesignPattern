package cn.cxy.designpattern.dynamic_proxy.dynamic;



public class TimeLogProxy implements Movable {



    Movable movable;



    public TimeLogProxy(Movable movable) {

        this.movable = movable;

    }



    public Movable getMovable() {

        return movable;

    }



    public void setMovable(Movable movable) {

        this.movable = movable;

    }



    @Override

    public void move() {

        System.out.println("Log start...");

        movable.move();

        System.out.println("Log end...");

    }

}