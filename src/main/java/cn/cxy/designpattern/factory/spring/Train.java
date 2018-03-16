package cn.cxy.designpattern.factory.spring;

public class Train implements Vehicle {

	@Override
	public void run() {
		System.err.println("A big train's passing...");
	}

}
