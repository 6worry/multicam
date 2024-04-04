package multicam.java.hw.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerReceiverThread extends Thread {
	private Socket socket;
	private BufferedReader br;
	private BufferedReader key;
	private PrintWriter pw;
	private InputStream in;
	private OutputStream os;

	public ServerReceiverThread() {
		
	}
	
	public ServerReceiverThread(Socket socket) {
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
			
			String reMsg = "";
			
			while(true) {
				reMsg = br.readLine();
				
				if(reMsg == null) {
					break;
				}
				
				System.out.println("client: " + reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}