package cn.cxy.designpattern.strategy.java;

import java.util.Comparator;

import cn.cxy.designpattern.strategy.Comparable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car implements Comparable<Car>{
	
	private Integer id;
	private String name;
	private double miles;
	
	private Comparator<Car> comparator;
	
	@Override
	public int compareTo(Car t) {
		return comparator.compare(this, t);
	}

}
