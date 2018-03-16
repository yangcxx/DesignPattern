package cn.cxy.designpattern.factory.normal;

public class PlaneFactory extends VehicleFactory {

	public Plane getInstance() {
		return new Plane();
	}

}
