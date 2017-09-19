package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 18:35 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public abstract class AbstractBuilder {

    public abstract void setPart(String name,String type);
    public abstract Product getProduct();

}
