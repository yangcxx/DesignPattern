package cn.cxy.designpattern.factory;

public class PlaneFactory extends VehicleFactory {

	public Plane getInstance() {
		return new Plane();
	}

}
