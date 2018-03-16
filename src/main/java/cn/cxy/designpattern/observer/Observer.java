package cn.cxy.designpattern.observer;

/**
 * Function: 观察者 - 一般定义为接口
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/22 18:37 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface Observer {

    String getName();
    void setName(String name);
    void help(); //声明支援盟友方法

    /**
     * 遭受攻击方法
     * @param acc 目标（主题）
     */
    void beAttacked(AllyControlCenter acc);
}
