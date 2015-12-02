package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			ServerSocket serverSocket = new ServerSocket(1992);
			Socket socket = serverSocket.accept();
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream(), true);
			String s = br.readLine();
			pw.println(s);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			pw.close();
			br.close();
		} catch (Exception ex) {
		}
	}
}
