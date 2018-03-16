package cn.cxy.designpattern.factory.abstractive;

public class DefaultFactory extends AbstractFactory {

	@Override
	public Person createPerson() {
		return new American();
	}

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}

	@Override
	public Things createThings() {
		return new BankRob();
	}
	
	/*public American createAmerican() {
		return new American();
	}
	
	public Plane createPlane() {
		return new Plane();
	}
	
	public BankRob createBankRob() {
		return new BankRob();
	}*/

}
