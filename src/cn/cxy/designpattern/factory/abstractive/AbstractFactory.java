package cn.cxy.designpattern.factory.abstractive;

/**
 * 将产生工厂及需要产生的实体类均抽象化 - 具体交由子类实现
 * @author charl
 *
 */
public abstract class AbstractFactory {
	
	public abstract Person createPerson();
	
	public abstract Vehicle createVehicle();
	
	public abstract Things createThings();

}
