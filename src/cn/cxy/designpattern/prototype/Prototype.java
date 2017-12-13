package cn.cxy.designpattern.prototype;

import java.io.*;

/**
 * Function: 深拷贝与浅拷贝
 * Reason: TODO 浅拷贝采用 object.clone() 方法实现；深拷贝采用二进制流实现
 * Date: 2017/9/26 17:05 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Prototype implements Cloneable, Serializable {


    private String name;
    private SerializableObject object;

    /**
     * 深复制 - 采用二进制流进行
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //读出二进制流产生的新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    /**
     * 浅复制 - 方法名称随便；重点是 super.clone() 调用的是 Object 的方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    protected Object shallowClone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }
}

class SerializableObject implements Serializable {
    private static final long serialVersionUID = 8031894943643917264L;
}
