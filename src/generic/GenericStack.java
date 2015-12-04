package generic;

import java.util.ArrayList;

/**
 * @author Tong List<int> list = new GenericStack<>(); �� List<Integer> list =
 *         new GenericStack(); �� ��������Զ���������<E1, E2, E3>
 */

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<E>();

	/**
	 * ע�⹹�캯����д��
	 */
	public GenericStack() {

	}

	/**
	 * @return ջ��С
	 */
	public int getSize() {
		return list.size();
	}

	/**
	 * ѹջ����
	 * 
	 * @param objҪѹ���Ԫ��
	 */
	public void push(E obj) {
		list.add(obj);
	}

	/**
	 * ��������
	 * 
	 * @return ������Ԫ��
	 */
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	/**
	 * �Ƿ�Ϊ��
	 * 
	 * @return ���򷵻�true
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	/**
	 * ����ջ��Ԫ��
	 * 
	 * @return ջ��Ԫ��
	 */
	public E peak() {
		return list.get(getSize() - 1);
	}
}
