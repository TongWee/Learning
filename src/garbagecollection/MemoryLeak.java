package garbagecollection;

import java.util.HashMap;
import java.util.Vector;

public class MemoryLeak {
	// 静态集合类如果
	public static Vector vector = new Vector();
	public static HashMap hashMap = new HashMap();

	// 数据库连接、网络连接、IO连接
	// 监听器
	/*
	 * Button btn = new Button(); btn.setOnClickListener(new OnClickListener(
	 * 
	 * @Override void onCLick(){ System.out.println("Button down."); } ))
	 */
	// 变量不合理的作用域
	class Server {
		private String msg;// 生命周期与Server对象生命周期相同，可能导致内侧泄漏

		public void recieveMsg() {
			// readFromNet();
			// saveDB();
		}
	}
	// 单例模式可能造成产生的对象无法回收，导致内存泄露

}
