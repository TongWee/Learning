package generic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class GenericMethod {
	/**
	 * ·ºÐÍ·½·¨
	 * 
	 * @param list
	 */
	public static <E> void print(E[] list) {
		if (list.length == 0) {
			return;
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static void main(String[] args) {
		String[] stringList = { "Tom", "Merry", "John", "Lim", "Tony" };
		Integer[] intList = { 1, 2, 3, 4, 5 };
		print(stringList);
		print(intList);
		ArrayList<String> list = new ArrayList<String>();
		list.add(new String());
		String s = list.get(0);
	}
}
