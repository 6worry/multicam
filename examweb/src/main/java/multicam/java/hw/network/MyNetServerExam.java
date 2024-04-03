package multicam.java.hw.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam {
	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server = null;
		InputStream in = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			server = new ServerSocket(31299);
			
			while(true) {
				client = server.accept();
				
				in = client.getInputStream();
				dis = new DataInputStream(in);
				
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				String ip = client.getInetAddress().getHostAddress();
				dos.writeUTF("Hi, Welcome! " + ip + "님");
				dos.writeUTF("출력할 단:");
				
				int msg = dis.readInt();
				System.out.println(msg + "단");
				
				for(int i = 1; i <= 9; i++) {
					System.out.println(msg + " * " + i + " = " + (msg * i));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}