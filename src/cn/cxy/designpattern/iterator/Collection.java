package cn.cxy.designpattern.iterator;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/17 12:37 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public interface Collection {

    void add(Object o);

    int size();
    
    Iterator iterator();

}
