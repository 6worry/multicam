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
import java.time.LocalDate;
import java.util.Date;

public class MyNetServerExam2 {
	public static void main(String[] args) {
		Socket client = null;
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		InputStream in = null;
		OutputStream os = null;
		
		try {
			server = new ServerSocket(31299);
			
			while(true) {
				client = server.accept();
				
				in = client.getInputStream();
				os = client.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(in));
				pw = new PrintWriter(os, true);
				
				pw.println("Hi, Welcome! Client!");
				
				String reMsg = "";
				
				while(true) {
					String name = client.getInetAddress().getHostName();
					reMsg = br.readLine();
					System.out.println(reMsg);
					
					if(reMsg == null) {
						break;
					}
					
					if(reMsg.contains("안녕하세요?") || reMsg.contains("하이")) {
						pw.println("반갑습니다. " + name + "님");		
					} else if(reMsg.contains("오늘 날짜는")) {
						pw.println("오늘 날짜는 " + LocalDate.now() + "입니다.");
					} else {
						pw.println("ㅇㅇ");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}