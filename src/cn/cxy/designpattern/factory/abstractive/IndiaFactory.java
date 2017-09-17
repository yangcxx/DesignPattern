package cn.cxy.designpattern.factory.abstractive;

public class IndiaFactory extends AbstractFactory {

	@Override
	public Person createPerson() {
		return new Indian();
	}

	@Override
	public Vehicle createVehicle() {
		return new Motorcycle();
	}

	@Override
	public Things createThings() {
		return new Eat();
	}

}
