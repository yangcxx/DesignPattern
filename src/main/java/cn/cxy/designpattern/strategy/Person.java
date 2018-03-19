package cn.cxy.designpattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return Objects.equals(id, person.id) &&
				Objects.equals(name, person.name) &&
				Objects.equals(age, person.age) &&
				Objects.equals(comparator, person.comparator);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, name, age, comparator);
	}
}
