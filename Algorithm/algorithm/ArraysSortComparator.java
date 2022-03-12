package algorithm;

import java.util.Arrays;
import java.util.Comparator;

class MyStringSort implements Comparator<String>{  //String[] 사용 정렬 기준
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
		// s1 == s2: 대소문자 무시하고 비교했을 때 같으면 0
		// s1 < s2 : 대소문자 무시하고 비교했을 때 s1이 앞쪽 배열 -1 (순서 교환 x)
		// s1 > s2 : 대소문자 무시하고 비교했을 때 s2이 앞쪽 배열 1 (순서 교환)
	}
}

class MyArraySort implements Comparator<int []>{   //int[][] 사용 정렬 기준
	public int compare(int [] s1, int [] s2) {
		//1차배열 각 데이터의 갯수가 작은 < 큰 ...
		if(s1.length > s2.length) return 1;
		else if(s1.length < s2.length) return -1;
		else return 0;
	}
}


public class ArraysSortComparator {

	public static void main(String[] args) {
		String [] data = {"test","TEST", "test123", "TeSt123", "가나다"};
		Arrays.sort(data, new MyStringSort());
		
		System.out.println(Arrays.toString(data));
		
		int [][] data2 = {{1,2,3},{4,5,6,7,8,9},{10,20,30}};
		Arrays.sort(data2, new MyArraySort());
		for(int [] one : data2) {
			System.out.println(Arrays.toString(one));
		}
	}

}
