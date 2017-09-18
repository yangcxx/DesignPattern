package cn.cxy.designpattern.adaptor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Iphone8 {
	
	private AppleCharger appleCharger;
	
	public void charge() {
		appleCharger.charge();
	}

}
