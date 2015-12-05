package string;

public class StringLength {

	public static void main(String[] args) {
		String a = "\\123456\0 123456\\t";
		System.out.println(a);
		System.out.println(a.length());
		for(int i=0;i<a.length();i++){
			System.out.print(i+1 + ":"+a.charAt(i) + " ");
		}
	}
}
