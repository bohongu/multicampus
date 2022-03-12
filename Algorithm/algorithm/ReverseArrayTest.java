package algorithm;

import java.util.Scanner;

public class ReverseArrayTest {
	static int [] reverse(int[] data) {
		//data 배열 역순
		for(int i=0;i<data.length/2;i++) {
			swap(data,i,data.length-i-1);
		}
		return data;
	}
	
	static void swap(int[] ar, int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 갯수 = ");
		int count = sc.nextInt();
		sc.nextLine();
		
		
		System.out.print("역순으로 정렬할 숫자들 = ");
		String line = sc.nextLine();//100 90 34 78 19 --> 19 78 34 90 100
		// 공백 중심 분리
		String[] su = line.split(" ");
		int[] suInt = new int[count];
		for(int i=0;i<count;i++) {
			suInt[i] = Integer.parseInt(su[i]); 
		}
		
		reverse(suInt);
		for(int i =0;i<suInt.length;i++){
			System.out.println(suInt[i]);
		}
		
		
	}

}
