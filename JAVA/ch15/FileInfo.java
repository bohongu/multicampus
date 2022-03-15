package ch15;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) throws IOException {
		File f = new File(args[0]);
		if(f.exists()) {
			System.out.println("경로: " + f.getCanonicalPath());
			if(f.isFile()) {
				System.out.println("파일명: " + f.getName());
				System.out.println("파일읽기가능여부: " + f.canRead());
				System.out.println("파일쓰기가능여부: " + f.canWrite());
				System.out.println("파일실행가능여부: " + f.canExecute());
				long last = f.lastModified();// 1/1000초
				Date d = new Date(last);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년도 MM월 dd일 E요일 HH시 mm분 ss초");
				System.out.println("파일최종수정시각: " + sdf.format(d));	
				System.out.println("파일크기(Byte단위): " + f.length());
							
			} else {//디렉토리라면..
				System.out.println("디렉토리명: " + f.getName());
				String [] details = f.list();
				System.out.println("세부목록은 다음과 같습니다.");
				for(String s : details) {
					System.out.println(s);
				}
				System.out.println("==============================");
			}
		} else {//파일이나 디렉토리가 없다면..
			System.out.println(args[0] + " 파일이나 디렉토리 없습니다.");
		}
		File f2 = new File("a.bb.cc.txt");
		String totalname = f2.getName();
		/*while(true) {
			int location = totalname.indexOf(".");
			if(location < 0) {break;}
			totalname = totalname.substring(location + 1);
			System.out.println(totalname);
		}*/
		
		int location = totalname.lastIndexOf(".");
		totalname = totalname.substring(location + 1);
		System.out.println("확장자 : " + totalname);
		
	}

}
