package algorithm;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] data = {3, 5, 4, 2, 1}; //오름차순
		System.out.println("삽입정렬 이전 = " + Arrays.toString(data));
		insertion(data, data.length);
		System.out.println("삽입정렬 이후 = " + Arrays.toString(data));
		
		}
	
	static void insertion(int [] a, int n) {
		for(int i=1;i<n;i++) {
			int j;
			// 1. 정렬되지 않은 데이터 한개 선택
			int temp;
			temp = a[i];
			System.out.printf("i=%d , temp=%d\n" , i, temp);
			// 2. 정렬된 데이터들 자리 이동(temp보다 크면) 반복
			for(j=i;j>0 && a[j-1] > temp;j--) {
				System.out.printf("현재 a[j-1]값 %d은 temp값 %d보다 크므로 자리 밀리는 중\n", a[j-1], temp);
				a[j] = a[j-1];
			}
			a[j]=temp;
		}
	}
}

