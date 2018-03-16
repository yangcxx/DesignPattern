package cn.cxy.designpattern.adaptor;

public class LightningCharger implements AppleCharger {

	public void charge() {
		System.out.println("Apple's charger is charging...");
	}

}
