package ch6;

class A{
	int i; //인스턴스변수 = 객체변수 = 필드변수 = 멤버변수 - 자동초기저장값 정해짐
	void m() {
		int j=20;// m메서드 지역변수
		System.out.println(i+j);
		/*for(int k=0;i<10;k++) {// k -> for블록 지역변수
			System.out.println(k);
		}*/
		//System.out.println(k);
	}
	void m2() {
		System.out.println(i);//main에서 호출해야 출력 가능
	}
}

public class VariableTest {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m2();
		a1.m();

	}

}
