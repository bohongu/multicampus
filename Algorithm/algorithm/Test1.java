package algorithm;

import java.util.Scanner;

public class Test1 {

	static int isPalindrome(String s) {
		for(int i = 0; i<s.length()/2;i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {return 0;}		
		}
		return 1;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			String a = sc.next();
			System.out.println(isPalindrome(a));
		}
			
	}

}
