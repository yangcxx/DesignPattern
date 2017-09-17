package cn.cxy.designpattern.factory.abstractive;

/**
 * 具体的业务实体继承自抽象实体 - 对应的工厂只定义对应的抽象
 * @author charl
 *
 */
public class American extends Person {
	
	public void printName() {
		System.out.println("一个美国人");
	}

}
