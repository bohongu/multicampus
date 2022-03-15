package ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) throws UnknownHostException {
		//내컴퓨터 ip 주소
		InetAddress myip = InetAddress.getLocalHost();
		System.out.println("컴퓨터이름="+myip.getHostName());
		System.out.println("ip="+myip.getHostAddress());
		
		InetAddress [] serverip = InetAddress.getAllByName("www.naver.com");
		for(InetAddress oneip : serverip ) {
		System.out.println("서버="+oneip.getHostAddress());
		}

	}

}
