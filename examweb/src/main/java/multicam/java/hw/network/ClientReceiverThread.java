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

public class ClientReceiverThread implements Runnable {
	private BufferedReader br;
	private BufferedReader key;
	private PrintWriter pw;
	private InputStream in;
	private OutputStream os;
	private Socket socket;
		
	public ClientReceiverThread() {
		
	}

	public ClientReceiverThread(Socket socket) {
		super();
		this.socket = socket;
	}
	
	@Override
	public void run() {
		String msg = null;
		
		try {
			in = socket.getInputStream();
			os = socket.getOutputStream();
			
			key = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(in));
			pw = new PrintWriter(os, true);
		
			msg = br.readLine();
			System.out.println(msg);
			
			String reMsg = "";
			
			while(true) {
				reMsg = br.readLine();
				
				if(reMsg == null) {
					break;
				}
				
				System.out.println("server: " + reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}