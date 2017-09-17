package cn.cxy.designpattern.factory.abstractive;

public class Test {
	
	public static void main(String[] args) {
//		American american = new American();
//		american.printName();
//		Plane plane = new Plane();
//		plane.go();
//		BankRob bankRob = new BankRob();
//		bankRob.doing();
		
		//实体类的产生全部交由默认工厂解决
//		DefaultFactory factory = new DefaultFactory();
//		American american2 = factory.createAmerican();
//		american2.printName();
//		Plane plane2 = factory.createPlane();
//		plane2.go();
//		BankRob bankRob2 = factory.createBankRob();
//		bankRob2.doing();
		
//		AbstractFactory factory = new DefaultFactory();
		AbstractFactory factory = new IndiaFactory();
		Person person = factory.createPerson();
		person.printName();
		Vehicle vehicle = factory.createVehicle();
		vehicle.go();
		Things things = factory.createThings();
		things.doing();
	}

}
