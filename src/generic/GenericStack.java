package generic;

import java.util.ArrayList;

/**
 * @author Tong List<int> list = new GenericStack<>(); × List<Integer> list =
 *         new GenericStack(); √ 泛型类可以定义多个参数<E1, E2, E3>
 */

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<E>();

	/**
	 * 注意构造函数的写法
	 */
	public GenericStack() {

	}

	/**
	 * @return 栈大小
	 */
	public int getSize() {
		return list.size();
	}

	/**
	 * 压栈操作
	 * 
	 * @param obj要压入的元素
	 */
	public void push(E obj) {
		list.add(obj);
	}

	/**
	 * 弹出操作
	 * 
	 * @return 弹出的元素
	 */
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	/**
	 * 是否为空
	 * 
	 * @return 空则返回true
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * 返回栈顶元素
	 * 
	 * @return 栈顶元素
	 */
	public E peak() {
		return list.get(getSize() - 1);
	}
}
