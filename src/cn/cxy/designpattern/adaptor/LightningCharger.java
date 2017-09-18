package cn.cxy.designpattern.adaptor;

public class LightningCharger implements AppleCharger {

	@Override
	public void charge() {
		System.out.println("Apple's charger is charging...");
	}

}
