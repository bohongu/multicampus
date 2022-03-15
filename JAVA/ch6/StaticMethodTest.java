package ch6;

class B {
	int i = 10;//인스턴스변수
	static int j = 20;//클래스변수
	void m1() {//인스턴스메서드에서 인스턴스변수 + 클래스변수 사용 가능
		System.out.println(i+j);
	}
	static void m2( ) {//static메서드에서 인스턴스변수 사용 불가능
		System.out.println(j);
	}
}

public class StaticMethodTest {
	void test() {
		System.out.println("클래스는StaticMethodTest");
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		B.m2();//or b1.m2();
	
	}

}
