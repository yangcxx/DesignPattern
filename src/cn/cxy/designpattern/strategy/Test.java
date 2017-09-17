package cn.cxy.designpattern.strategy;

public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person(1,"Jack",45);
		Person p2 = new Person(2,"Bush",60);
		p1.setComparator(new IdComparator());
		System.out.println(p1.compareTo(p2));
	}

}
