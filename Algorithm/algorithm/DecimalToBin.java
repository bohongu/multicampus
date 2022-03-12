package algorithm;

import java.util.Scanner;

public class DecimalToBin {

	static String[] toBin(int decimal, int base){
		String [] remains = new String[30];
		int index = 0;
		while(true) {
			int remain = decimal % base;	
			decimal = decimal/base;
			if (remain >= 10) {
				remains[index++] = String.valueOf((char)(remain+55));
			} else {
			remains[index++] = String.valueOf(remain);
			}
			if(decimal==0) break;
			
		}
		return remains;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//10진수값
		int base = sc.nextInt();//변환할  진수값
		
		String[] result = toBin(a, base);
		for(int i=result.length-1;i>=0;i--) {
			if(result[i] != null) System.out.print(result[i]);	
		}
		System.out.println();	
		System.out.println(Integer.toHexString(a));
	}

}
