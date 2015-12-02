package array;

public class Test {
	public static void trycatch() {
		try {
			System.out.println("try");
			return;
		} catch (Exception ex) {
			System.out.println("error");
		} finally {
			System.out.println("finally");
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a = "hello";
		// char []b = a.toCharArray();
		// System.out.println(a.length());
		// System.out.println(b.length);
		// //b[2]='\0';
		// for(char c :b){
		// System.out.print(c+" ");
		// }
		// String d = b.toString();
		// char a[] = {'a','b','c'};
		// int []b = {1,2,3};
		// System.out.println();
		// trycatch();
		// String str = "dog cat cat dog";
		// String pattern = "abba";
		Solution sol = new Solution();
		// System.out.println(sol.wordPattern(pattern, str));
		String test = "{}{}{}[](({}[]))";
		System.out.println(sol.isValid(test));
	}
}
