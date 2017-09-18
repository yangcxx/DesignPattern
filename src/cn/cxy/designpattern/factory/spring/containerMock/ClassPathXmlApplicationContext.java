package cn.cxy.designpattern.factory.spring.containerMock;

import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @ClassName: ClassPathXmlApplicationContext
 * @Description: 简单模拟 Spring bean 工厂
 * @author: charl
 * @date: 2017年9月18日 下午10:56:29
 */
public class ClassPathXmlApplicationContext {
	/**
	 * 用于模拟容器池
	 */
	private HashMap<String, Object> map = new HashMap<>();
	
	/**
	 * 模拟从容器中获取bean
	 */
	public Object getBean(String name) {
		return map.get(name);
	}

	/**
	 * 模拟加载实体类到工厂容器中
	 */
	public ClassPathXmlApplicationContext(String location) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(this.getClass().getClassLoader().getResourceAsStream(location));
		NodeList nodeList = document.getElementsByTagName("bean");
		if (null != nodeList && nodeList.getLength() > 0) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node item = nodeList.item(i);
				NodeList children = item.getChildNodes();
				if (null != children && children.getLength() > 0) {
					for (int j = 0; j < children.getLength(); j++) {
						Node child = children.item(i);
						System.out.println(child.getAttributes());
					}
				}
			}
		}
	}

}
