/**
 * Function: 建造者模式：与工厂模式非常相似
 *      cxy 不同之处：工厂模式直接通过建造工厂获得实体对象
 *      cxy         建造者模式主要针对于复杂的实体创建（比如一个产品由多个部分组成），建造工厂分别创建实体的各个部分，然后由一个导演类Director对工厂创建得到的各部分进行组装并返回
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 18:13 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
package cn.cxy.designpattern.builder;