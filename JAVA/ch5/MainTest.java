package ch5;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력변수 갯수= " + args.length);
		System.out.println("입력내용 ");
		
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		
		// run-.... 100 200
		// 300
		System.out.println(args[0] + " + " + args[1] + " = " + args[0]+args[1]);
		//자바 형변환 - boolean 제외 기본형 변수들 가능/String(기본형x)
		//String --> int 형변환 메서드 (Integer.parseInt)
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		//String --> double 형변환 메서드(Double.parseDouble)
		//double d1 = Double.parseDouble(args[0]);
	}

}
