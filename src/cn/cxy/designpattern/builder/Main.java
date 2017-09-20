package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 12:00 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Main {

    public static void main(String[] args) {
        Director director = new Director(new CommonRoleBuilder());
        Role role = director.construct();
        System.out.println(role);
    }

}
