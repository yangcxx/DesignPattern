package cn.cxy.designpattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {

	private Integer id;
	private String name;
	private Integer age;
	
	private Comparator<Person> comparator = new IdComparator();
	
	@Override
	public int compareTo(Person t) {
		return comparator.compare(this, t);
		/*Integer age1 = this.getAge();
		Integer age2 = t.getAge();
		if (age1 == age2) {
			return 0;
		} else if (age1 > age2) {
			return 1;
		} else {
			return -1;
		}*/
	}



	public Person(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
