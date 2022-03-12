package algorithm;

public class SearchAlgorithm2 {

	public static void main(String[] args) {
		//이진검색
		// 1> 정렬상태의 데이터셋 준비
		// 2> 중앙값, 찾을값 비교
		//	   중앙값 > 찾을값 4앞의 데이터셋 비교
		//    중앙값 < 찾을값 4뒤의 데이터셋 비교
		//    중앙값 == 찾을값 - 찾음
		int [] data = {6, 4, 3, 2, 1, 5, 8};
		//정령 상태 가정.
		int [] data2 = {1, 2, 3, 4, 5, 6, 8};
		int target = 9;
		int pl = 0; //시작위치
		int pr = data2.length-1; //끝위치
		
		while(true) {
		//중앙위치값
			int pc = (pl + pr) / 2;
			if(target == data2[pc]) {
				System.out.println("data2[" + pc + "]에서  "+ target + " 찾음");
				break;
			} else if(target > data2[pc]) {
				pl = pc+1;//검색 시작위치를 중앙위치 다음 인덱스로(마지막위치 변화x)
			} else if(target < data2[pc]) {
				pr = pc-1;//검색 끝위치를 중앙위치 이전 인덱스로(시작위치 변화x)
			}
			if(pl > pr) {
				System.out.println("못찾음");
				break;
			}
		}//while end
		System.out.println("pl= " + pl + "  pr= " + pr);
	}//main end
}//class end


