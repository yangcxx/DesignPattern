package cn.cxy.designpattern.adaptor;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Adaptor implements AppleCharger {

	private AndroidCharger androidCharger;

	@Override
	public void charge() {
		androidCharger.charge();
	}

}
