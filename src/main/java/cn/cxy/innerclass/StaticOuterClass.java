package cn.cxy.innerclass;

import lombok.Getter;
import lombok.Setter;

/**
 * Function: 静态内部类
 * Reason: TODO 嵌套内部类；1、不依赖于外围类进行创建；2、不能使用任何外围类的非 static 成员变量和方法
 * Date: 2018/3/19 22:17 </br>
 *
 * @author: cx.yang
 * @since: yangcx.xin
 */
@Setter
@Getter
public class StaticOuterClass {

    private String sex = "boy";
    private static String name = "charles";

    @Setter
    @Getter
    static class StaticInnerClass {
        private static String _name = "charles_static";

        public void innerDisplay() {
            System.out.println("OuterClass name: " + name);
        }

    }

    public static void main(String[] args){
        StaticInnerClass sic = new StaticInnerClass();
        sic.innerDisplay();
    }

}
