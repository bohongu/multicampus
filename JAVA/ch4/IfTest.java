package ch4;

public class IfTest {

	public static void main(String[] args) {
		String name = "이자바";
		//java, db, algorithm 시험점수 - 0 ~ 100
		int java = (int)(Math.random()*100)+1; // 1~100 난수 저장 / (int)(Math.random()*범위)+시작값
		int db = (int)(Math.random()*100)+1;
		int algo = (int)(Math.random()*100)+1;
		int total = java + db + algo;
		int avg = total/3;
		double avgDouble = (double)total/3;
		
		System.out.println(name + " 학생은 자바 점수  = " + java + ", db 점수 = " + db + ", 알고리즘 점수 = " + algo + " 입니다.");
		System.out.println(name + " 학생의 총점 = " + total + ", 정수평균  = " + avg + ", 실수평균  = " + avgDouble + " 입니다.");
		/*avg: 90~100 A 등급
		 * 80~90 B등급
		 * 70~80 C등급
		 * 나머지 미수료*/
		if (avg>=90) {
			System.out.println("A 등급");
			// 93점 이상 A+
			if (avg >= 93) {
				System.out.println("A+ 등급");
			}
		} else if (avg>=80) {
			System.out.println("B 등급");
		} else if (avg>=70) {
			System.out.println("C 등급");
		} else {
			System.out.println("미수료");
		}//if
		
	}//main end

}//class end
