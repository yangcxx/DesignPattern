package cn.cxy.designpattern.factory.spring.containerMock;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.io.DOMReader;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Iterator;

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
     * 模拟加载实体类到工厂容器中  --  使用dom4j读取配置文件
     */
    public ClassPathXmlApplicationContext(String location) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(this.getClass().getClassLoader().getResourceAsStream(location));
        DOMReader domReader = new DOMReader();
        org.dom4j.Document dom4jDoc = domReader.read(document);
        Element rootElement = dom4jDoc.getRootElement();
        Iterator<Element> iterator = rootElement.elementIterator();
        while (iterator.hasNext()) {
            Element next = iterator.next();
            Attribute id = next.attribute("id");
            Attribute aClass = next.attribute("class");
            Object o = Class.forName(aClass.getValue()).newInstance();
            map.put(id.getValue(),o);
        }
    }

}
