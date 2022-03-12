package algorithm;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] coins = {10, 50, 100, 300, 500};
		int total = 0;
		int cnt = 0;	
		int money = sc.nextInt();
		int price = sc.nextInt();
		int change = money - price;
		System.out.print(change + "원 - ");
		
		for(int i = coins.length-1;i>=0;i--) {
			if(change/coins[i] != 0) {
				cnt = 0;
				cnt += change/coins[i];
				change = change%coins[i];
				total += cnt;
				System.out.print(coins[i] + "원 " + cnt + "개 " + " ");	
			} 
		}
		System.out.println();
		System.out.println("총 동전 갯수 " + total + "개");
	}
}
