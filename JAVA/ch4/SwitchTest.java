package ch4;

public class SwitchTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java, db, algorithm 시험점수 - 0 ~ 100
		int java = 100;
		int db = 85;
		int algo = 90;
		int total = java + db + algo;
		int avg = total/3;
		double avgDouble = (double)total/3;
		
		System.out.println(name + " 학생은 자바 점수  = " + java + ", db 점수 = " + db + ", 알고리즘 점수 = " + algo + " 입니다.");
		System.out.println(name + " 학생의 총점 = " + total + ", 정수평균  = " + avg + ", 실수평균  = " + avgDouble + " 입니다.");
		/*avg: 90~100 A 등급
		 * 80~90 B 등급
		 * 70~80 C 등급
		 * 나머지 미수료*/
		
		int avg10 = avg / 10; // 9x/10 ==> 9
		switch (avg10) {
		case 10:
		case 9:
			System.out.println("A 등급");
			break;
			
		case 8:
			System.out.println("B 등급");
			break;
			
		case 7:
			System.out.println("C 등급");
			break;
			
		default:
			System.out.println("미수료");
		}//switch end
		
		
		
		/*avg: 90 A 등급
		 * 80 B등급
		 * 70 C등급
		 * 나머지 기타등급*/
		
		/*switch (avg) {
		case 90:
			System.out.println("A 등급");
			break;
			
		case 80:
			System.out.println("B 등급");
			break;
			
		case 70:
			System.out.println("C 등급");
			break;
			
		default:
			System.out.println("기타등급");
		}//switch end*/

	}//main end

}//class end
