package algorithm;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int data[] = {33, 51, 4, 2, 100, 56, 7876,87, 500, 400};
		System.out.println("퀵정렬 이전 =" + Arrays.toString(data));
		quick(data, 0, data.length-1);
		System.out.println("퀵정렬 이후 =" + Arrays.toString(data));
	}//main
	
	static void quick(int[] a, int left, int right) {
		//System.out.printf("left = %d 이고 right = %d 일 때 quick 시작 \n", left, right);
		int pl = left;//왼쪽부터 검색 인덱스 변수
		int pr = right;//오른쪽부터 검색 인덱스 변수
		int x = a[(pr + pl)/2]; //pivot
		do {
			while(a[pl] < x) {// a[pl] 데이터가 x보다 크거나 같으면 중단
				pl++;
			}
			while(a[pr] > x) {// a[pr] 데이터가 x보다 작거나 같으면 중단
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
		
		if(left < pr) quick(a, left, pr);//pivot보다 작거나 같은 그룹 분할
		if(pl < right) quick(a, pl, right);//pivot보다 크거나 같은 그룹 분할
		//System.out.printf("left = %d 이고 right = %d 일 때 quick 시작 \n", left, right);
	}

}

