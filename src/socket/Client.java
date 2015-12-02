package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			Socket socket = new Socket("localhost", 1992);
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			// ����������͵���Ϣ
			pw.println("Hello, my name is Tong.");
			String s = null;
			while (true) {
				s = br.readLine();
				if (s != null) {
					break;
				}
				System.out.println(s);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			br.close();
			pw.close();
		} catch (Exception ex) {
		}
	}
}
