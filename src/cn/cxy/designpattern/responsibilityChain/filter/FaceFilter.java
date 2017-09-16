package cn.cxy.designpattern.responsibilityChain.filter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 14:18 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class FaceFilter implements Filter {
    @Override
    public String doFilter(String msg) {
        return msg.replace(":)","^~v~^");
    }
}
