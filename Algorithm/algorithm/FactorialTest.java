package algorithm;

import java.util.Scanner;

public class FactorialTest {
	
	static int fact1(int su) {
		//반복문
		System.out.println("===" + su + " 일 때 fact1 시작 ===");
		int result = 1;
		for(int i=1;i<=su;i++) {
			result *= i;
		}
		System.out.println("===" + su + " 일 때 fact1 종료 ===");
		return result;
	}
	
	static int fact2(int su) {
		//재귀
		System.out.println("===" + su + " 일 때 fact2 시작 ===");
		if(su==0 || su==1) return 1;
		System.out.println("===" + su + " 일 때 fact2 종료 ===");
		return su * fact2(su-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n +"! = " + fact1(n));
		System.out.println(n +"! = " + fact2(n));
		
	}

}
