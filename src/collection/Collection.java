package collection;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		int array[] = { 3, 1, 2, 5, 4 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			list.add(new Integer(array[i]));
		}
		System.out.println();
		Collections.sort(list);
		for (int i = 0; i < array.length; i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
