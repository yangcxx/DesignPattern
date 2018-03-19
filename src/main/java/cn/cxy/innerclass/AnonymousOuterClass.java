package cn.cxy.innerclass;

/**
 * Function: 匿名内部类
 * Reason: TODO 可以理解为抽象类或接口的方法临时实现
 * Date: 2018/3/19 22:05 </br>
 *
 * @author: cx.yang
 * @since: yangcx.xin
 */
public class AnonymousOuterClass {

    public AnonymousInnerClass getInnerClass(final int num, String str) {
        return new AnonymousInnerClass() {
            int number = num + 3;

            @Override
            public int getNum() {
                return number;
            }
        };
    }

}

interface AnonymousInnerClass {
    int getNum();
}
