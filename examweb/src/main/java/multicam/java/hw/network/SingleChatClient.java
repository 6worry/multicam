package multicam.java.hw.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatClient {
	public static void main(String[] args) {
		Socket client = null;
		Thread t1 = null;
		Thread t2 = null;
		
		try {
			client = new Socket("192.168.55.251", 31299);
			t1 = new Thread(new ClientSendThread(client));
			t2 = new Thread(new ClientReceiverThread(client));
			
			t1.start();
			t2.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}