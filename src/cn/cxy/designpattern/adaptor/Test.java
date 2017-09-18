package cn.cxy.designpattern.adaptor;

public class Test {

	public static void main(String[] args) {
		Iphone8 iphone8 = new Iphone8(new LightningCharger());
		iphone8.charge();

		System.out.println("===============");

		GalaxyS8 galaxyS8 = new GalaxyS8(new TypeCCharger());
		galaxyS8.charge();

		System.out.println("===============");

		/**
		 * 通过 Adaptor 实现 通过 AppleCharger 调用 AndroidAdaptor
		 */
		Adaptor adaptor = new Adaptor();
		adaptor.setAndroidCharger(new TypeCCharger());
		Iphone8 newIphone8 = new Iphone8(adaptor);
		newIphone8.charge();

	}

}
