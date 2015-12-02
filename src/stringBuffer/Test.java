package stringBuffer;

public class Test {
	public static void passString(StringBuffer a, StringBuffer b) {
		a.append(" world.");
		b = a;
	}

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Hello");
		StringBuffer b = new StringBuffer("Hello");
		passString(a, b);
		System.out.println("a ----- " + a);
		System.out.println("b ----- " + b);
	}
}
