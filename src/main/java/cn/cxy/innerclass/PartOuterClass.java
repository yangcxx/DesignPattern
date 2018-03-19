package cn.cxy.innerclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Function: 局部内部类
 * Reason: TODO 嵌套在方法、作用于类的，对于这个类的使用主要是解决比较复杂的问题，想创建一个辅助类，但又不想此类被公用  --  此类只能在该方法和属性中被使用
 * Date: 2018/3/19 21:44 </br>
 *
 * @author: cx.yang
 * @since: yangcx.xin
 */
@Setter
@Getter
public class PartOuterClass {

    private String name;
    private int num1 = 10;
    private static int num2 = 20;

    public void showPartOuter(){
        final int num4 = 40;
        //不能有任何修饰符
        class PartInnerClass{
            private int num3 = 300;
            private int num1 = 100;
            public void showPartInner(){
                System.out.println("local-"+num3);
                System.out.println("local-"+num1);
                System.out.println("Global-"+PartInnerClass.this.num1);
                System.out.println("Static-"+num2);
                System.out.println("final-"+num4);
            }
        }
        //局部内部类对于外界是隐藏的，需要在内部类里面完成对象的创建及引用
        PartInnerClass pic = new PartInnerClass();
        pic.showPartInner();
    }

    public static void main(String[] args){
        PartOuterClass poc = new PartOuterClass();
        poc.showPartOuter();
    }

}
