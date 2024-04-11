package multicam.java.hw.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServerExam3 {
	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server = null;
		BufferedReader br = null;
		BufferedReader key = null;
		PrintWriter pw = null;
		InputStream in = null;
		OutputStream os = null;
		
		try {
			server = new ServerSocket(31299);
			
			while(true) {
				client = server.accept();
				
				in = client.getInputStream();
				os = client.getOutputStream();
				key = new BufferedReader(new InputStreamReader(System.in));
				br = new BufferedReader(new InputStreamReader(in));
				pw = new PrintWriter(os, true);
				
				pw.println("Hi, Welcome! Client!");
				
				String sendMsg = "";
				String reMsg = "";
				
				while(true) {
					reMsg = br.readLine();
					if(reMsg == null) {
						break;
					}
					System.out.println("client: " + reMsg);
					sendMsg = key.readLine();
					pw.println(sendMsg);
					
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}