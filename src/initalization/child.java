package initalization;

public class child extends parent {
	static {
		System.out.println("child static block");
	}

	child() {
		System.out.println("child constructor");
	}

	{
		System.out.println("child block");
	}
	static {
		System.out.println("child static block again");
	}
}
