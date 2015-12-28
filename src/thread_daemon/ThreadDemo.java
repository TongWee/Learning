package thread_daemon;

public class ThreadDemo extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName().toString()+": Begin.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName().toString()+": End.");
	}
}
