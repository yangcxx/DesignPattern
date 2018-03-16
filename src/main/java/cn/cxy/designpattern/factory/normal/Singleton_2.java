package cn.cxy.designpattern.factory.normal;

/**
 * Function: 单例模式使用内部类来维护单例的实现
 * Reason: TODO JVM 内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
 * Date: 2017/9/26 16:00 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Singleton_2 {

    private Singleton_2() {
    }

    private static class SingletonFactory {
        private static Singleton_2 singleton_2 = new Singleton_2();
    }

    public static Singleton_2 getInstance() {
        return SingletonFactory.singleton_2;
    }
}
