package cn.cxy.designpattern.strategy;

/**
 * 自定义比较器 - 由子类实现具体比较策略
 * 
 * @author charl
 *
 */
public interface Comparator<T> {

	int compare(T t1, T t2);

}
