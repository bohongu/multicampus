package algorithm;

import java.util.Scanner;

public class RectTest {
	
	static void rect(int w) {
		
		for(int j=1;j<=w;j++) {
			for(int i=1;i<=w;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void tri(int w) {//왼쪽 하단 직각
		
		for(int j=1;j<=w;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void aaa(int w) {//왼쪽 상단 직각
		
		for(int j=1;j<=w;j++) {
			for(int i=1;i<=w-j+1;i++) { // == for(int i=w;i>=j;i--)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void bbb(int w) {//오른쪽 하단 직각
		
		for(int j=1;j<=w;j++) {
			for(int i=w;i>j;i--) {
				System.out.print(" ");
			}
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ccc(int w) {//오른쪽 상단 직각
		
		for(int j=1;j<=w;j++) {
			for(int i=1;i<j;i++) {
				System.out.print(" ");
			}
			for(int i=w;i>=j;i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ddd(int w) {//오른쪽 상단 직각
		
		for(int j=1;j<=w;j++) {
			for(int i=1;i<j;i++) {
				System.out.print(" ");
			}
			int k = 65;
			for(int i=w;i>=j;i--) {
				System.out.print((char)k++);
				
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1개를 입력하세요.");
		System.out.print("한변의 길이 = "); //5
		int width = sc.nextInt();
		
		ddd(width);
		
		
		

	}

}
