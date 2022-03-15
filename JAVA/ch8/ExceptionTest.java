package ch8;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			System.out.println(second / first);
			
			
			//IllegalArgumentException e = new IllegalArgumentException(); //예외 객체 강제 생성
			//throw e; //e 참조 예외 객체 강제 발생
			
			throw new IllegalArgumentException("매개변수 잘못 지정");
			
		}
		//jdk1.7버전 - 멀티캐치
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("0을 입력하거나 숫자가 아닌 값을 입력하셨습니다");
		}
		catch(Exception e) {
			System.out.println("모든 예외 동일 처리");
			System.out.println(e.getMessage());
		}
		/*catch(ArithmeticException e) {
			//int first = (int)(Math.random()*100) + 1;
			//args[0] = "100";
			System.out.println("0이 아닌 값을 입력하세요");
			//e.printStackTrace();//예외발생원인, 문장, 메서드 추적
			//System.out.println(e.getMessage());//예외발생원인
		}
		catch(NumberFormatException e) {
			System.out.println("정수 변환 가능 값을 입력하세요");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값을 2개 이상이어야 합니다");
		}*/
		System.out.println("main 실행완료");
	}

}
