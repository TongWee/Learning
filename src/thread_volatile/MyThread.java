package thread_volatile;

public class MyThread extends Thread implements Runnable {
	private volatile boolean isStop = false;

	@Override
	public void run() {
		while (!isStop) {
			System.out.println(System.currentTimeMillis() % 100);
			// System.out.println(isStop);
		}
	}

	public void doStop() {
		isStop = true;
		// System.out.println(isStop);
	}
}
