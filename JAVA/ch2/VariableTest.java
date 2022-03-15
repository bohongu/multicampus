package ch2;

public class VariableTest {

	public static void main(String[] args) {
		//국어 영어 수학 정수 : 선언 + 값 할당
		int kor = 100;
		int eng = 50;
		int mat = 75;
		//int sci = 99.9;
		
		//총점 정수 : 선언
		int total ;
		
		//평균 : 선언
		int avgInt ;
		double avgDouble ;
		
		System.out.println("국어점수 = " + kor); // String + 정수,실수, String + String ==> 요소 결합 출력
		System.out.println(kor + eng + mat); // 정수, 실수 + 정수, 실수 ==> 산술연산 덧셈
		
		System.out.println(eng);
		System.out.println(mat);
		
		//영어 점수 조정 : 2배
		eng = eng * 2;
		total = kor + eng + mat;
		
		avgInt = total/3;
		avgDouble = total/3.0;
		
		System.out.println(total);
		System.out.println(avgInt);
		System.out.println(avgDouble);
		
		//데이터타입 변수명 = 값
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
		
		//오류 boolean flag2 = True;
		
		char c1 = '이';
		char c2 = '학'; 
		char c3 = '생';
		char c4 = '\n'; // new line, \t = tab, \w = spacebar
		System.out.print(c1 + '\n');
		System.out.print(c2);
		System.out.println(c3);
		//System.out.println((char)c1+ "" +(char)c2+(char)c3);
		
		//기본 제공 데이터타입 여러 문자 묶어 선언 불가능
		//사용자 데이터타입 정의 사용 가능
		String name = "이학생";
		
	}

}
