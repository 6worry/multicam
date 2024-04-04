package multicam.java.hw.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {
	public static void main(String[] args) {
		Socket client = null;
		Thread t1 = null;
		Thread t2 = null;
		
		try {
			ServerSocket server = new ServerSocket(31299);
			
			while(true) {
				client = server.accept();
				t1 = new Thread(new ServerSendThread(client));
				t2 = new Thread(new ServerReceiverThread(client));
				
				t1.start();
				t2.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}