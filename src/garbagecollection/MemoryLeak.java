package garbagecollection;

import java.util.HashMap;
import java.util.Vector;

public class MemoryLeak {
	// ��̬���������
	public static Vector vector = new Vector();
	public static HashMap hashMap = new HashMap();

	// ���ݿ����ӡ��������ӡ�IO����
	// ������
	/*
	 * Button btn = new Button(); btn.setOnClickListener(new OnClickListener(
	 * 
	 * @Override void onCLick(){ System.out.println("Button down."); } ))
	 */
	// �����������������
	class Server {
		private String msg;// ����������Server��������������ͬ�����ܵ����ڲ�й©

		public void recieveMsg() {
			// readFromNet();
			// saveDB();
		}
	}
	// ����ģʽ������ɲ����Ķ����޷����գ������ڴ�й¶

}
