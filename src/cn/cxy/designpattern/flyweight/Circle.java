package cn.cxy.designpattern.flyweight;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 19:12 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Circle extends Shape {

    private String colour;

    public Circle(String colour) {
        this.colour = colour;
    }

    @Override
    void draw() {
        System.out.println("画了一个" + colour +"的圆形");
    }
}
