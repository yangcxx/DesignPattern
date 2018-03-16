package cn.cxy.designpattern.strategy;

/**
 * 比较器接口 - 实现此接口的类只能存在一种比较逻辑 - //TODO 扩展性较差
 * 
 * @author charl
 *
 * @param <T>
 */
public interface Comparable<T> {

	int compareTo(T t);

}
