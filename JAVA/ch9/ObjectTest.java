package ch9;

public class ObjectTest {

	public static void main(String[] args) {
		MyObject o1 = new MyObject(100, "java");
		MyObject o2 = new MyObject(100, "java");
		
		
		System.out.println(o1/*.toString()*/);
		System.out.println(o2/*.toString()*/);
		
		//Object equals 메소드 객체 참조형 동등성 비교(String equals와 다름)
		//==연산자 : 기본형(실제값 비교), 참조형(주소값 비교) 동등성 비교
		if(o1 == o2) { //주소비교. 연산자 오버라이딩 불가
			System.out.println("o1 == o2 true");
		}
		if(o1.equals(o2)) { //주소비교. 메소드 오버라이딩 가능 --> MyObject 타입이고 code, msg 변수값 동일하면 true
			System.out.println("o1.equals(o2) true");
		} 		

	}

}

class MyObject /*extends Object*/{
	int code;
	String msg;
	MyObject(int code, String msg) {
		this.code = code;
		this.msg = msg;
		
	}
	@Override
	public String toString() {
		System.out.println(getClass().getName());
		return code + "-" + msg;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//MyObject 타입이고 code, msg 변수값 동일하면 true
		if(obj instanceof MyObject) {
			if(this.code == ((MyObject)obj).code && this.msg.equals(((MyObject)obj).msg)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
	
}
