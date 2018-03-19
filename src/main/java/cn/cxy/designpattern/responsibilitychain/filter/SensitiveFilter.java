package cn.cxy.designpattern.responsibilitychain.filter;

import cn.cxy.designpattern.responsibilitychain.processor.FilterChain;
import cn.cxy.designpattern.responsibilitychain.web.Request;
import cn.cxy.designpattern.responsibilitychain.web.Response;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 13:58 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class SensitiveFilter implements Filter {
    public String doFilter(String msg) {
        return msg.replace("开发人员", " Developer ");
    }

    public void doFilter(Request request, Response response,FilterChain chain) {
        String requestString = request.getRequestString();
        request.setRequestString(requestString.replace("开发人员", " Developer "));

        chain.doFilter(request,response,chain);

        String responseString = response.getResponseString();
        response.setResponseString(responseString += "--SensitiveFilter");
    }
}
