package cn.cxy.designpattern.factory;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

	private static Car car = new Car();

	private Car() {
	};

	/**
	 * 传统方式：单例工厂 || 静态工厂方法
	 * 
	 * @return
	 */
	public static Car getInstance() {
		return car;
	}

	public void run() {
		System.out.println("Car's running...");
	}

}
