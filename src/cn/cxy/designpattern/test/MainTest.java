package cn.cxy.designpattern.test;

import cn.cxy.designpattern.responsibilityChain.filter.FaceFilter;
import cn.cxy.designpattern.responsibilityChain.filter.HTMLFilter;
import cn.cxy.designpattern.responsibilityChain.filter.SensitiveFilter;
import cn.cxy.designpattern.responsibilityChain.processor.FilterChain;
import cn.cxy.designpattern.responsibilityChain.processor.MsgProcessor;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 13:42 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class MainTest {

    public static void main(String[] args){
        String msg = "设计模式:)（Design pattern）代表了最佳<script>的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的";
        MsgProcessor processor = new MsgProcessor();
        //processor.setMsg(msg);
        //String result = processor.process();
        FilterChain fc = new FilterChain();
        fc.addFilter(new FaceFilter())
                .addFilter(new HTMLFilter());
        //TODO FilterChain 同时实现 Filter 可实现 FilterChain 之间的组合
        FilterChain fc2 = new FilterChain();
        fc2.addFilter(new SensitiveFilter());
        fc.addFilter(fc2);
        processor.setFilterChain(fc);
        processor.setMsg(msg);
        String result = processor.process();
        System.out.println(result);
    }

}
