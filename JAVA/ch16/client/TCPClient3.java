package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient3 {
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",60000);
			
			OutputStream os = socket.getOutputStream();
			PrintStream p = new PrintStream(os);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String userId = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			
			p.print(userId + " " + password + "\n");
			p.flush();
			
			InputStream is = socket.getInputStream();
			Scanner response = new Scanner(is);
			System.out.println(response.nextLine());
			
			socket.close();
			System.out.println(" === 클라이언트 : 서버와 접속 해제 === ");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
