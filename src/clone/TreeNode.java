package clone;

public class TreeNode implements Cloneable {
	public int val_int;
	public String val_str;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val1, String val2) {
		this.val_int = val1;
		this.val_str = val2;
	}

	public Object clone() {
		Object o = null;
		try {
			o = (TreeNode) super.clone();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return o;
	}
}
