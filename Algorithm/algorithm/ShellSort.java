package algorithm;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int [] data = {3, 5, 4, 2, 1}; //오름차순
		System.out.println("쉘정렬 이전 = " + Arrays.toString(data));
		shell(data, data.length);
		System.out.println("쉘정렬 이후 = " + Arrays.toString(data));
		
		}
	
	static void shell(int [] a, int n) {
		for(int h=n/2;h>0;h/=2) {
			for(int i=h;i<n;i++) {
				int j;
				// 1. 정렬되지 않은 데이터 한개 선택
				int temp;
				temp = a[i];
				System.out.printf("h=%d, i=%d, temp=%d 반복 : ", h, i, temp);
				// 2. 정렬된 데이터들 자리 이동(temp보다 크면) 반복
				for(j=i-h;j>=0 && a[j] > temp;j-=h) {
					System.out.printf("현재 a[j]값 %d 은 temp값 %d보다 크므로 자리 밀리는 중 \n", a[j], temp);
					a[j+h] = a[j];
				}
				a[j+h]=temp;
			}	
		}//gap. 배열 나누기
	}
}

