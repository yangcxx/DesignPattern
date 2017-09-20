package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 11:58 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Role construct() {
        builder.buildBody();
        builder.buildFace();
        builder.buildHead();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
        return builder.getRole();//从 builder 中获取产品
    }

    public void assembly() {
        builder.buildBody();
        builder.buildFace();
        builder.buildHead();
        builder.buildHp();
        builder.buildMp();
        builder.buildSp();
    }
}
