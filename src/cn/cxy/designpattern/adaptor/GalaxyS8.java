package cn.cxy.designpattern.adaptor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GalaxyS8 {

	private AndroidCharger androidCharger;

	public void charge() {
		androidCharger.charge();
	}

}
