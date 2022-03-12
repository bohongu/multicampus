package algorithm;

import java.util.Scanner;

public class PrimeNumberTest {

	static boolean isPrime(int a) {
		int cnt = 0;
		for(int i = 1;i<=a;i++) {
			if(a%i==0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소수인지 판단할 양수 : ");
		int a = sc.nextInt();
		
		boolean result = isPrime(a);
		if(result) {
			System.out.println(a + "는 소수이다.");
		} else {
			System.out.println(a + "는 소수가아니다.");
		}
		
		//소수 판단되면 배열 저장
		int [] prime = new int[a];
		int j = 0;
		for(int i = 2;i<=a;i++) {
			if(isPrime(i)) {
				prime[j++] = i;
			}
		}
		//출력
		for(int i =0;i<j;i++) {
			System.out.println(prime[i]);
		}
	}

}
