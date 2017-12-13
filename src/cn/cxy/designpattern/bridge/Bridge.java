package cn.cxy.designpattern.bridge;

/**
 * Function: 桥接类
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 18:16 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public abstract class Bridge {

    private Sourceable sourceable;

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void setSourceable(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    abstract void method();
}
