package algorithm;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		int first = 1;
		int second = 1;
		list.add(first);
		list.add(second);
		
		for(int i = 0;i<8;i++) {
			list.add(list.get(i)+list.get(i+1) );
			
		}
		for(int one : list) {
			System.out.print(one + " ");
		}
		
		//재귀호출
		System.out.println();
		System.out.println(10 + "항의 수열값은 " +fibo(10) );
		
	}
	
	static int fibo(int su) {
		if(su==1 || su==2) return 1;
		return fibo(su-1) + fibo(su-2);
	}

}
