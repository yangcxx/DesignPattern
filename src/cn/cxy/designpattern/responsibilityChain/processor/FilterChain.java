package cn.cxy.designpattern.responsibilityChain.processor;

import cn.cxy.designpattern.responsibilityChain.filter.Filter;
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

    private ArrayList<Filter> filters = new ArrayList<>();

    /**
     * 返回当前调用对象即可实现链式编程
     * @param filter
     * @return
     */
    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }

    /**
     * 调用包含Filter的doFilter方法
     * @param msg
     * @return
     */
    public String doFilter(String msg){
        String result = msg;
        for (Filter filter : filters) {
            result = filter.doFilter(result);
        }
        return result;
    }

}
