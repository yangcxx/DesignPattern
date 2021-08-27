/**
 * Function: 动态代理模式
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/19 22:56 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
package cn.cxy.designpattern.dynamic_proxy.dynamic;

/**
 * 每一种需求都要增加一个代理,TankLogProxy TankTimeProxy...   ===>  todo 动态生成这些类
 *
 *
 * 现在动态代理，动态生成的代理类是写死了的，是用字符串写死在类里面的，而且，只能动态生成实现了 Moveable 接口的代理，如果要实现任意接口的代理应该怎么办？
 * 那就不将动态生成代理类的字符串写死，动态拼接生成代理类
 *
 *
 * fixme 生成的这些类都是固定的,只是实现当前接口,无法处理实现其他接口的情况  ==>  动态拼接生成代理类
 */
