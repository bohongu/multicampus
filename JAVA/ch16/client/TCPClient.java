package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception  {
		//2> 서버 접속
		Socket s = new Socket("127.0.0.1",50000);
		System.out.println("[==클라이언트 : 서버와 접속==]");

		OutputStream o = s.getOutputStream();
		PrintStream p = new PrintStream(o);
		p.print("안녕 hello 서버님 \n");
		p.flush(); //print 메소드 출력문자열 - 클라이언트 임시메모리만 저장 - 한번에 서버로 내보내기
		
		System.out.println("[==클라이언트 : 서버로 인사말 출력 ==]");
		
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		System.out.println("[==클라이언트 : 서버로부터 받은 인사말==]" + sc.nextLine());
		
		s.close();
		System.out.println("[==클라이언트 : 서버와 접속해제==]");
		
	}

}
