package cn.cxy.designpattern.iterator;

/**
 * Function: TODO Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/16 23:04 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class ArrayList implements Collection {

	Object[] data = new Object[10];
	int size = 0;

	public void add(Object data) {
		if (size == this.data.length) {
			Object[] newData = new Object[this.data.length * 2];
			System.arraycopy(data, 0, newData, 0, this.data.length);
			this.data = newData;
		}
		this.data[size] = data;
		size++;
	}

	public int size() {
		return size;
	}

	public Iterator iterator() {
		return new ArrayListIterator();
	}

	/**
	 * 内部类实现迭代器
	 * @author charl
	 *
	 */
	private class ArrayListIterator implements Iterator {

		int index = 0;

		@Override
		public boolean hasNext() {
			if (index == size) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			return data[index++];
		}

	}

}
