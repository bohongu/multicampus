package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) {
		try {
		System.out.println("===1byte 입력===");
		FileInputStream fi = new FileInputStream("test.txt");
		while(true) {
			int result = fi.read();
			if(result == -1)//eof 
				{
					break;
				}
			System.out.print((char)result);
		}
		fi.close();
		
		
		System.out.println();
		System.out.println("===2byte 입력===");
		FileReader fr = new FileReader("test.txt");
		while(true) {
			int result = fr.read();
			if(result == -1)//eof 
				{
					break;
				}
			System.out.print((char)result);
		}
		fr.close();		
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
	}
}
