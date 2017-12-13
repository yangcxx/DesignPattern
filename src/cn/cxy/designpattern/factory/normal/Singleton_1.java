package cn.cxy.designpattern.factory.normal;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 16:00 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Singleton_1 {

    private static Singleton_1 singleton = null;

    private Singleton_1() {
    }

    /**
     * 多线程下保证单例  --  TODO 还是可以能会发生错误
     * cxy synchronized 锁住的是整个对象
     * @return
     */
    public static Singleton_1 getInstance() {
        if (null == singleton){
            synchronized (singleton){
                singleton = new Singleton_1();
            }
        }
        return singleton;
    }
}
