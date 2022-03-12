package algorithm;

public class SearchAlgorithm {

	public static void main(String[] args) {
		// 선형검색으로 찾기 방법 1
		/* int [] data = {6, 4, 3, 2, 1, 5, 8};
		int target = 3;
		int i;
		for(i = 0; i<data.length;i++) {
			System.out.println(i + "번째 반복 중");
			if(target == data[i]) {
				System.out.println(i+ " 에서  " +target);
				break;
			}
		}
		if( i == data.length) {
			System.out.println(target + " 못찾음");
		} */
		
		// 선형검색으로 찾기 방법 2
		int [] data = {6, 4, 3, 2, 1, 5, 8, 0};// 검색대상 7개숫자 + 0
		int target = 10;
		int i;
		for(i = 0; i<data.length-1;i++) {
			System.out.println(i + "번째 반복 중");
			if(target == data[i]) {
				System.out.println(target + " 찾음");
				data[data.length-1] = data[i]; 
				break;
			}
		}
		System.out.println(data[data.length-1]);
		}
	}


