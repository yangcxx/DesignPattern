package cn.cxy.designpattern.builder;

/**
 * Function: 定义如何构建各个部分及具体实现
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 11:55 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public abstract class Builder {

    public abstract void buildHead();

    public abstract void buildFace();

    public abstract void buildBody();

    public abstract void buildHp();

    public abstract void buildSp();

    public abstract void buildMp();

    public abstract Role getRole();

}
