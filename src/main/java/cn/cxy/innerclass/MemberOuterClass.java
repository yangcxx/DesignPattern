package cn.cxy.innerclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Function: 成员内部类
 * Reason: 1、成员内部类中不能存在任何static的变量和方法；2、成员内部类是依附于外围类的，只有只有先创建了外围类才能创建内部类
 * Date: 2018/3/19 16:55 </br>
 *
 * @author: cx.yang
 * @since: yangcx.xin
 */

@Setter
@Getter
@ToString
public class MemberOuterClass {

    private String str;

    public void outerDisplay(){
        System.out.println("outerClass...");
    }

    private class MemberInnerClass {
        public void innerDisplay(){
            //使用外围类的属性
            str = "innerClass charles...";
            System.out.println(str);
            //使用外围类的方法
            outerDisplay();
        }
    }

    /**
     * 推荐使用 getXXX() 来获取成员内部类，尤其是该内部类的构造函数无参数时
     * @return
     */
    public MemberInnerClass getInnerClass(){
        return new MemberInnerClass();
    }

    public static void main(String[] args){
        MemberOuterClass moc = new MemberOuterClass();
        //TODO 外部类可以直接新建内部类
//        MemberInnerClass innerClass = moc.new MemberInnerClass();
        MemberInnerClass innerClass = moc.getInnerClass();
        innerClass.innerDisplay();
    }
}
