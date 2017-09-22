package cn.cxy.designpattern.observer;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/22 19:07 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Main {

    public static void main(String[] args){
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        //定义四个观察者对象
        Observer player1,player2,player3,player4;

        player1 = new Player("杨过");
        acc.join(player1);
        player2 = new Player("令狐冲");
        acc.join(player2);
        player3 = new Player("张无忌");
        acc.join(player3);
        player4 = new Player("段誉");
        acc.join(player4);

        //某成员遭受攻击
        player1.beAttacked(acc);
    }

}
