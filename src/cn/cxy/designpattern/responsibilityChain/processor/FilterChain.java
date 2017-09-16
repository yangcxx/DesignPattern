package cn.cxy.designpattern.responsibilityChain.processor;

import cn.cxy.designpattern.responsibilityChain.filter.Filter;
import cn.cxy.designpattern.responsibilityChain.web.Request;
import cn.cxy.designpattern.responsibilityChain.web.Response;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Function: 自定义 FilterChain 同时 implements Filter 即可实现 FilterChain 之间的组合
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 14:21 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Setter
@Getter
public class FilterChain implements Filter {

    int index = 0;
    private ArrayList<Filter> filters = new ArrayList<>();

    /**
     * 返回当前调用对象即可实现链式编程
     *
     * @param filter
     * @return
     */
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    /**
     * 调用包含Filter的doFilter方法
     *
     * @param msg
     * @return
     */
    public String doFilter(String msg) {
        String result = msg;
        for (Filter filter : filters) {
            result = filter.doFilter(result);
        }
        return result;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) return;

        Filter filter = filters.get(index);

        index++;

        filter.doFilter(request, response, chain);


        //for (Filter filter : filters) {
        //    filter.doFilter(request,response,chain);
        //}
    }

}
