package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 18:37 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Director {

    private AbstractBuilder builder = new ConcreteBuilder();

    public Product getAProduct(){
        builder.setPart("BMW","X7");
        return builder.getProduct();
    }

    public Product getBProduct(){
        builder.setPart("Audi","Q7");
        return builder.getProduct();
    }

}
