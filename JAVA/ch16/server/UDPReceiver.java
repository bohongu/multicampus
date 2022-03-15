package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket receiver = new DatagramSocket(40000);
		System.out.println("수신 시작");
		
		//비어 있는 DatagramPacket 생성
		byte b[] = new byte[100];
		DatagramPacket data = new DatagramPacket(b, b.length);//한글 33자
		receiver.receive(data);
		
		b = data.getData();
		String receiveddata = new String(b);
		System.out.println(receiveddata);
		
		System.out.println("수신 종료");
		receiver.close();

	}

}
