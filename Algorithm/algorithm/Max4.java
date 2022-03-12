package algorithm;

import java.util.Scanner;

public class Max4 {
	static int max(int a, int b, int c, int d) {
		
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		return max;
		
	}

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
		
		System.out.println("최댓값은 " + max(a,b,c,d) + " 입니다.");
		System.out.println("최댓값은 " + max(34,56,1,100) + " 입니다.");
		System.out.println("최댓값은 " + max(78,1,100,56) + " 입니다.");

	}

}
