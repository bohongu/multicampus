package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCPServer3 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> userData = new HashMap<String,String>(); 
		userData.put("java", "web");
		userData.put("jsp", "view");
		userData.put("html", "client");
		
		//1. 서버 소켓 생성
		try {
			ServerSocket server = new ServerSocket(60000);
			System.out.println("server start...");
			while(true) {
				Socket client = server.accept();
				InputStream is = client.getInputStream();
				Scanner sc = new Scanner(is);
				String[] params = sc.nextLine().split(" ");
				String response = "";
				String id  = params[0];
				String pw =  params[1];
				
				System.out.println("Request :  id=" +  id + "&password=" + pw);
				
				if(!userData.containsKey(id)) {
					response = id +  " 는 존재하지 않는 아이디 입니다.";
				}else if(pw.equals(userData.get(id))) {
					response = id + "님 안전하게 로그인 되었습니다.";
				}else {
					response = "암호 " + pw + "은 다릅니다. 다시 확인하세요.";
				}
				
				OutputStream os = client.getOutputStream();
				PrintStream p = new PrintStream(os);
				p.println(response);
				p.flush();
				
				client.close();
				
//				if(false) {
//					server.close();
//					System.out.println(" === 서버 종료 === ");
//				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}