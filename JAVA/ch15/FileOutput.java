package ch15;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		try {
		FileOutputStream fo = new FileOutputStream("new2.txt", true);
		//파일 존재하지 않으면 새롭게 empty file 자동 생성
		//매개변수 false 이거나 없으면 파일 존재하면 기존 파일 내용 삭제 후 수정(덮어쓰기)
		//매개변수 true이면 파일 존재하면 기존 파일 내용 유지 + 추가
		fo.write(98);
		fo.write('a');
		fo.write('A');
		fo.write('0');
		fo.write(0);// unicode 0 : 공백
		fo.close();
		
		FileWriter fw = new FileWriter("new3.txt", true);
		//파일 존재하지 않으면 새롭게 empty file 자동 생성
		//매개변수 false 이거나 없으면 파일 존재하면 기존 파일 내용 삭제 후 수정(덮어쓰기)
		//매개변수 true이면 파일 존재하면 기존 파일 내용 유지 + 추가
		fw.write(98);
		fw.write('a');
		fw.write('A');
		fw.write('0');
		fw.write(0);
		fw.write('가');
		fw.write('\n');
		fw.write("두번째줄입니다.\n");
		fw.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
