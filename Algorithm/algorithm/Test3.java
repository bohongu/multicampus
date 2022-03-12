package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	static void bubble(int [] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		System.out.println();
		int [] list = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("학생 " + (i+1) + " 점수 입력 : ");
			list[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("성적 순으로 정렬");
		bubble(list);
		int index = 1;
		for(int one : list) {
			System.out.println(index++ + "등 : " + one);
		}

	}

}
