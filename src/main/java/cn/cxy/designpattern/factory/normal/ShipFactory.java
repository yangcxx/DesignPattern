package cn.cxy.designpattern.factory.normal;

public class ShipFactory extends VehicleFactory {
	
	public Ship getInstance() {
		return new Ship();
	}

}
