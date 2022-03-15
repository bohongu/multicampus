package ch16;


import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) {
		try {
		URL site = new URL("https://lc.multicampus.com/kdt-venture");
		InputStream is = site.openStream();
		Scanner sis = new Scanner(is);
		//stream 키보드끝 파일 끝 서버코드끝 --> -1
		//Scanner - hasNextLine() t/f
		while(sis.hasNextLine()) {
			System.out.println(sis.nextLine());
			
		System.out.println("====================");
		System.out.println(site.getHost());
		System.out.println(site.getPort());
		System.out.println(site.getProtocol());
		System.out.println(site.toURI());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
