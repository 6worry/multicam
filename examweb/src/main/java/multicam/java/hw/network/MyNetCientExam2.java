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

public class MyNetCientExam2 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader br = null;
		BufferedReader key = null;
		PrintWriter pw = null;
		InputStream in = null;
		OutputStream os = null;
		
		try {
			client = new Socket("192.168.55.251", 31299);
			
			in = client.getInputStream();
			os = client.getOutputStream();
			
			key = new BufferedReader(new InputStreamReader(System.in));
			br = new BufferedReader(new InputStreamReader(in));
			pw = new PrintWriter(os, true);
			
			String msg = br.readLine();
			System.out.println(msg);
			
			String sendMsg = "";
			String reMsg = "";
			
			while((sendMsg = key.readLine()) != null) {
				pw.println(sendMsg);
				
				reMsg = br.readLine();
				System.out.println("server: " + reMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}