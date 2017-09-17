package cn.cxy.designpattern.strategy;

/**
 * 比较逻辑实现
 * @author charl
 *
 */
public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person t1, Person t2) {
		Integer age1 = t1.getAge();
		Integer age2 = t2.getAge();
		if (age1 > age2) {
			return -1;
		} else if (age1 < age2) {
			return 1;
		}
		return 0;
	}

}
