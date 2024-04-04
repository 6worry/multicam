package multicam.java.hw.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSendThread extends Thread {
	private BufferedReader br;
	private BufferedReader key;
	private PrintWriter pw;
	private InputStream in;
	private OutputStream os;
	private Socket socket;
	
	public ServerSendThread() {
		
	}
	
	public ServerSendThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			in = socket.getInputStream();
			os = socket.getOutputStream();
			key = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(in));
			pw = new PrintWriter(os, true);
			
			pw.println("Hi, Welcome! Client!");
			
			String sendMsg = "";
			
			while((sendMsg = key.readLine()) != null) {
				pw.println(sendMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}