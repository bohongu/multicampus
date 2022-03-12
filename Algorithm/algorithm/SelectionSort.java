package algorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] data = {4, 7, 2, 9, 1}; //오름차순
		System.out.println("선택정렬 이전 = " + Arrays.toString(data));
		selection(data, data.length);
		System.out.println("선택정렬 이후 = " + Arrays.toString(data));
		
		}
	
	static void selection(int [] a, int n) {
		for(int i=0;i<a.length-1;i++) {
			int min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j] < a[min]) {
					min = j;
				}				
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
					
				
			}
		}
	}
}

