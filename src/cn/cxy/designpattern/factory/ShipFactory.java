package cn.cxy.designpattern.factory;

public class ShipFactory extends VehicleFactory {
	
	public Ship getInstance() {
		return new Ship();
	}

}
