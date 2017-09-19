package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 18:39 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Main {

    public static void main(String[] args){
        Director director = new Director();
        Product aProduct = director.getAProduct();
        System.out.println(aProduct);

        Product bProduct = director.getBProduct();
        System.out.println(bProduct);
    }

}
