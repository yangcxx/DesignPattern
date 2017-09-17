package cn.cxy.designpattern.factory.normal;

public class Test {
	
	public static void main(String[] args) {
		Car car = Car.getInstance();
		car.run();
		
		PlaneFactory factory = new PlaneFactory();
		Plane plane = factory.getInstance();
		plane.run();
		
		VehicleFactory shipFactory = new ShipFactory();
		Vehicle vehicle = shipFactory.getInstance();
		vehicle.run();
	}

}
