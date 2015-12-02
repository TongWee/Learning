package initalization;

public class parent {
	static {
		System.out.println("parent static block");
	}

	parent() {
		System.out.println("parent constructor");
	}

	{
		System.out.println("parent block");
	}
}
