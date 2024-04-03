package multicam.java.hw.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyNetCientExam {
	public static void main(String[] args) {
		Socket client = null;
		InputStream in = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			client = new Socket("192.168.55.251", 31299);
			
			in = client.getInputStream();
			dis = new DataInputStream(in);
			
			os = client.getOutputStream();
			dos = new DataOutputStream(os);
			
			String msg = dis.readUTF();
			String msg2 = dis.readUTF();
			System.out.println(msg);
			System.out.println(msg2);
			
			dos.writeInt(7);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}