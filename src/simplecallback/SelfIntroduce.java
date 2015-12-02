package simplecallback;

public class SelfIntroduce {
	public void introduce(int times, OnCallBack onCallBack) {
		while (times != 0) {
			System.out.println("My name is " + onCallBack.getName() + " "
					+ times);
			times--;
		}
	}
}
