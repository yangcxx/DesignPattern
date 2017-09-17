package cn.cxy.designpattern.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>() {{
			add("a");
			add("b");
			add("c");
			add("d");
		}};
		Iterator<String> iterable = list.iterator();
		while (iterable.hasNext()) {
			String string = (String) iterable.next();
			System.out.println(string);
		}
	}

}
