package ch15;

import java.io.IOException;

public class KeyboardTest {

	public static void main(String[] args) {
		try {
			while(true) {
				int onekey = System.in.read();
				if(onekey == '\n') break; // 엔터키입력 중단
				//if(onekey == 13) break; // 엔터키입력 중단
				System.out.println((char)onekey);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
