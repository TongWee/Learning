package thread_volatile;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.doStop();
	}
}
