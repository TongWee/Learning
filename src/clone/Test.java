package clone;

public class Test {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1, "Parent 1");
		TreeNode t2 = new TreeNode(2, "LeftChild");
		TreeNode t3 = (TreeNode) t1.clone();
		TreeNode t4 = t1;
		t1.left = t2;
		System.out.println("Parent 1\t" + t1);
		System.out.println("Parent \'=\'\t" + t4);
		System.out.println("Parent clone\t" + t3);
		System.out.println("------Clone------");
		System.out.println("str\t" + t3.val_str);
		System.out.println("int\t" + t3.val_int);
		System.out.println("left\t" + t3.left);
	}
}
