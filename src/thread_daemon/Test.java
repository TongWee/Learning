package thread_daemon;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Main start.");
		Thread thread = new ThreadDemo();
		thread.setDaemon(true);//����Ϊ�ػ��̶߳�û����Ҫά�������߳�ʱ��JVM���Զ��ر�
		thread.start();
		System.out.println("Main exit.");
	}

}
