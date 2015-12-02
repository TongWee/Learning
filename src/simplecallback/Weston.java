package simplecallback;

public class Weston implements OnCallBack {
	private String name = "Weston";

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void execute() {
		SelfIntroduce introduce = new SelfIntroduce();
		introduce.introduce(10, this);
	}
}
