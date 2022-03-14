package algorismProject1;

import java.util.Scanner;

public class algorismProject1 {

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
		quick(list, 0, list.length-1);
		int index = 1;
		for(int one : list) {
			System.out.println(index++ + "등 : " + one);
		}
		
		

	}
	
	static void quick(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pr + pl)/2];
		do {
			while(a[pl] > x) {
				pl++;
			}
			while(a[pr] < x) {
				pr--;
			}		 
			if(pl <= pr) {
				int temp = a[pl];
				a[pl] = a[pr];
				a[pr] = temp;
			    pl++;
			    pr--;
			}
			
		}while(pl <= pr);
		
		if(left < pr) quick(a, left, pr);
		if(pl < right) quick(a, pl, right);
	}

}
