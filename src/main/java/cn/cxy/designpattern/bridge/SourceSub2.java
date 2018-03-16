package cn.cxy.designpattern.bridge;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 18:16 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.err.println("this is the second sub!");
    }
}
