package thread_daemon;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Main start.");
		Thread thread = new ThreadDemo();
		thread.setDaemon(true);//设置为守护线程而没有需要维护的子线程时，JVM会自动关闭
		thread.start();
		System.out.println("Main exit.");
	}

}
