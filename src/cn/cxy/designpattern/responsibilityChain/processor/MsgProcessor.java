package cn.cxy.designpattern.responsibilityChain.processor;

import lombok.Getter;
import lombok.Setter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 13:40 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
@Setter
@Getter
public class MsgProcessor {

    /**
     * 过滤规则
     */
    //Filter[] filters = {new HTMLFilter(), new SensitiveFilter()};
    /**
     * 专门定义一个FilterChain用于管理管理所有Filter
     */
    private FilterChain filterChain;
    private String msg;

    public String process() {
        //process the msg
        //String result = msg.replace(">", "]").replace("<", "[")
        //        .replace("开发人员","Developer");

        //String result = null;
        //for (Filter filter : filters) {
        //    result = filter.doFilter(msg);
        //}
        return filterChain.doFilter(msg);
    }
}
