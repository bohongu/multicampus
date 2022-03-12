package algorithm;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		int [] data = {6, 4, 3, 2, 1, 5, 8};	
		Arrays.sort(data);
		
		//data 전체내용 출력
		System.out.println(Arrays.toString(data) );
	
		int target=1;
		int index = Arrays.binarySearch(data, target);
		if(index < 0) {
			System.out.println("못찾음");
		} else {
			System.out.println(target + "을 " + index + " 위치에서 찾았음");
		}
		
		
		

	}

}
