package cn.cxy.designpattern.adaptor;

public class TypeCCharger implements AndroidCharger {

	@Override
	public void charge() {
		System.out.println("TyepC charger is charging...");
	}

}
