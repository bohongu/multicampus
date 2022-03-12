package algorithm;

import java.util.Arrays;

public class MergeSort {

	static int [] buff;
	
	public static void main(String[] args) {
		int data[] = {33, 51, 4, 2, 100, 56, 7876,87, 500, 400};
		System.out.println("병합정렬 이전 =" + Arrays.toString(data));
		merge(data, data.length);
		System.out.println("병합정렬 이후 =" + Arrays.toString(data));
	}//main
	
	static void merge(int[] a, int n) {
		buff = new int[n];
		_merge(a, 0, n-1);
		buff = null;
	}
	
	static void _merge(int [] a, int left, int right) {
		//1개 그룹 분할
		if(left < right) {
			int i;
			int center = (left + right)/2;
			int p = 0;
			int j = 0;
			int k = left;
			
			_merge(a, left, center);
			_merge(a, center+1, right);
			
		//합병정렬
		//buff 합병하면서 정렬 배열
	
			for(i=left;i<=center;i++) {//a[] 왼쪽 반 저장
				buff[p++] = a[i];
			}
			
			while(i <= right && j < p) {//a[] 오른쪽 반 저장
				a[k++] = buff[j] <= a[i] ? buff[j++]:a[i++];
			}
			while(j<p) {
				a[k++] = buff[j++];//남아있는 내용들 복사
			}
			System.out.printf("left = %d, right = %d 일 때 병합 중간 결과 : %s \n", left, right, Arrays.toString(a));
		}
	}
}

