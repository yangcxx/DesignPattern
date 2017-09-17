package cn.cxy.designpattern.iterator;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/17 12:26 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class MainTest {

    public static void main(String[] args){
        Collection collection = new ArrayList();
        for (int i = 0; i < 10; i++) {
			collection.add(i+"--"+i);
		}
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
			Object type = (Object) iterator.next();
			System.out.println(type);
		}
        System.out.println(collection.size());
    }

}
