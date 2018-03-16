package cn.cxy.designpattern.factory.spring.containerMock;

public class Car implements Vehicle {

	@Override
	public void run() {
		System.out.println("A new car's running...");
	}

}
