package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Student stu1 = new Student("2014218067", "West", 23);
		Student stu2 = new Student("2014218062 ", "Tom", 22);
		Map<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(stu1, "west");
		hashMap.put(stu2, "tom");
		Iterator itr = hashMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			Student stu = (Student) entry.getKey();
			String val = (String) entry.getValue();
			System.out.println("Key: " + stu);
			System.out.println("Value: " + val);
		}
	}

}
