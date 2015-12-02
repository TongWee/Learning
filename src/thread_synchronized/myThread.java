package thread_synchronized;

public class myThread extends Thread {
	private int val;

	public myThread(int v) {
		val = v;
	}

	public void printVal(int v) throws InterruptedException {
		synchronized (myThread.class) {
			while (true) {
				System.out.println(v);
				Thread.sleep(500);
			}
		}
	}

	public void run() {
		try {
			printVal(val);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
