package cn.cxy.designpattern.strategy.java;

import java.util.Comparator;

/**
 * 比较逻辑实现
 * @author charl
 *
 */
public class IdComparator implements Comparator<Car> {

	@Override
	public int compare(Car t1, Car t2) {
		Integer id1 = t1.getId();
		Integer id2 = t2.getId();
		if (id1 > id2) {
			return 1;
		} else if (id1 < id2) {
			return -1;
		}
		return 0;
	}

}
