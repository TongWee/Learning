package thread_synchronized;

public class Test {
	public static void main(String[] args) {
		myThread mf1 = new myThread(1);
		mf1.start();
		myThread mf2 = new myThread(2);
		mf2.start();
	}
}
