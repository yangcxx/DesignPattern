package cn.cxy.designpattern.responsibilityChain.filter;

import cn.cxy.designpattern.responsibilityChain.processor.FilterChain;
import cn.cxy.designpattern.responsibilityChain.web.Request;
import cn.cxy.designpattern.responsibilityChain.web.Response;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 13:55 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface Filter {

    String doFilter(String msg);

    /**
     * 模拟JavaWeb中分别对Request & Response 的处理
     *
     * @param request
     * @param response
     */
    void doFilter(Request request, Response response, FilterChain chain);

}
