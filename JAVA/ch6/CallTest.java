package ch6;

class Data {
	int a = 30;
}

class Call{
	void add(int i) {
		System.out.println("add내부=" + i++);
	}
	void addData(Data d) {
		System.out.println("addData내부=" + d.a++);
	}
}

public class CallTest {

	public static void main(String[] args) {
		int j = 10;
		Call c = new Call();
		//기본형 전달 원리
		//c.add(j);
		//System.out.println("main내부=" + j);
		Data d1 = new Data();
		c.addData(d1);
		System.out.println("main내부 =" + d1.a);
	}

}
