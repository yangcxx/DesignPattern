package cn.cxy.designpattern.factory.spring.containerMock;

public class Test {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"cn/cxy/designpattern/factory/spring/containerMock/applicationContext.xml");
		Object bean = context.getBean("car");
		Vehicle vehicle = (Vehicle)bean;
		vehicle.run();
	}

}
