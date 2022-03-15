package ch13;

class Test1{
	void m1() {
		for(int i = 1; i <= 100;i++)
		System.out.print("!");
	}
}

class Test2{
	void m1() {
		for(int i = 1; i <= 100;i++)
		System.out.print("#");
	}
}
public class NonThreadTeset {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		Test2 t2 = new Test2();
		t2.m1();

	}

}
