package algorithm;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 4개를 입력하세요.");
		System.out.print("a = ");
		int a = sc.nextInt();
		System.out.print("b = ");
		int b = sc.nextInt();
		System.out.print("c = ");
		int c = sc.nextInt();
		System.out.print("d = ");
		int d = sc.nextInt();
		
		int max = a; //기준값
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		System.out.println("최댓값은 " + max + " 입니다.");

	}

}
