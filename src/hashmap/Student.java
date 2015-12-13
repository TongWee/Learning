package hashmap;

public class Student {
	String sId;
	String name;
	int age;

	public int hashCode() {
		return sId.hashCode();
	}

	public boolean equals(Object obj) {
		Student stu = (Student) obj;
		if (this.sId == stu.sId)
			return true;
		else
			return false;
	}

	public Student(String _sId, String _name, int _age) {
		this.sId = _sId;
		this.name = _name;
		this.age = _age;
	}
}
