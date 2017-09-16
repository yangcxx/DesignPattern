package cn.cxy.designpattern.responsibilityChain.processor;

import cn.cxy.designpattern.responsibilityChain.filter.Filter;
import cn.cxy.designpattern.responsibilityChain.filter.HTMLFilter;
import cn.cxy.designpattern.responsibilityChain.filter.SensitiveFilter;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 13:40 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class MsgProcessor {

    /**
     * 过滤规则
     */
    Filter[] filters = {new HTMLFilter(), new SensitiveFilter()};
    private String msg;



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String process() {
        //process the msg
        //String result = msg.replace(">", "]").replace("<", "[")
        //        .replace("开发人员","Developer");
        String result = null;
        for (Filter filter : filters) {
            result = filter.doFilter(msg);
        }
        return result;
    }
}
