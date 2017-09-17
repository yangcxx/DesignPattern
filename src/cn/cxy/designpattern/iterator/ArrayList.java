package cn.cxy.designpattern.iterator;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 23:04 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class ArrayList implements Collection {

    Object[] data = new Object[10];
    int index = 0;

    public void add(Object data){
        if (index == this.data.length){
            Object[] newData = new Object[this.data.length * 2];
            System.arraycopy(data,0,newData,0,this.data.length);
            this.data = newData;
        }
        this.data[index] = data;
        index++;
    }

    public int size(){
        return index;
    }

}
