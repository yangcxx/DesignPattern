package cn.cxy.designpattern.factory.spring;

import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(Test.class.getClassLoader().getResourceAsStream("cn/cxy/designpattern/factory/spring/spring.properties"));
		String property = properties.getProperty("VehicleType");
		System.err.println(property);
		Object instance = Class.forName(property).newInstance();
		Vehicle vehicle = (Vehicle)instance;
		vehicle.run();
	}

}
