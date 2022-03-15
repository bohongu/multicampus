package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class TCPServer2 {

	public static void main(String[] args)  {
		HashMap<String, String> memberinfo = new HashMap();
		memberinfo.put("java", "web");
		memberinfo.put("jsp", "view");
		memberinfo.put("html", "client");
		//1>서버시작 = ServerSocket생성
		try {
		ServerSocket ss = new ServerSocket(55000);
		System.out.println("[==서버 : 55000 포트에서 시작==]");
		while(true) {
			Socket s = ss.accept();
			System.out.println("[==서버 : " + s.getInetAddress().getHostAddress() + " 클라이언트와 연결==]");
			
			InputStream is = s.getInputStream();
			Scanner sc = new Scanner(is);
			
			
			String total = sc.nextLine();
			String id = total.split(" ")[0];
			String password = total.split(" ")[1];
			
			//String id = sc.next();
			//String password = sc.next();
			System.out.println("[==서버 : 클라이언트로부터 받은 로그인정보==]" + id + ":" + password);//java web
			
			OutputStream o = s.getOutputStream();
			PrintStream p = new PrintStream(o);
			
			if(memberinfo.containsKey(id) == true) {
				if(memberinfo.containsValue(password)) {
					p.print(id + "회원님 안전하게 로그인되었습니다.");
				} else {
					p.print("암호 " + password + "는 다릅니다. 다시 확인하세요.");
				}
			} else {
				p.print(id + "아이디 존재하지 않습니다.");
			}
			
			p.flush();
			
			s.close();
			System.out.println("[==서버 : 클라이언트와 연결 해제==]");
//			if(true) {
//				ss.close();
//				System.out.println("[==서버 : 종료==]");
//			}//if end(서버종료조건)
		}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
