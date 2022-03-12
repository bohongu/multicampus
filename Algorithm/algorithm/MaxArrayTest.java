package algorithm;

import java.util.Scanner;

public class MaxArrayTest {
	static int max(int[] data) {
		//data 배열 중에서 최대값 리턴
		int max = data[0];
		for(int i =1;i<data.length;i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 갯수 = ");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.print("최대값 찾을 숫자들 = ");
		String line = sc.nextLine();
		// 공백 중심 분리
		String[] su = line.split(" ");
		int[] suInt = new int[count];
		for(int i=0;i<count;i++) {
			suInt[i] = Integer.parseInt(su[i]); 
		}
		
		int result = max(suInt);
		System.out.println(result);
		
		
	}

}
