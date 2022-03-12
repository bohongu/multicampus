package algorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] data = {4, 5, 2, 3, 1}; //오름차순
		System.out.println("버블정렬 이전 = " + Arrays.toString(data));
		bubble(data, data.length);
		System.out.println("버블정렬 이후 = " + Arrays.toString(data));
		
		}
	
	static void bubble(int [] a, int n) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
	}
}

