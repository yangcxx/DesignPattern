package cn.cxy.designpattern.strategy;

/**
 * 比较逻辑实现
 * @author charl
 *
 */
public class IdComparator implements Comparator<Person> {

	@Override
	public int compare(Person t1, Person t2) {
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
