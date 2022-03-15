package ch6;

class Arithmetic {
	int add(int i, int j) {
		return i+j;
	}
	double add(double i, double j) {
		return i+j;
	}
	String add(String i, String j) {
		return i+j;
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		double r1 = a.add(1.1,2.5);
		String r2 = a.add("java","JSP");
		int r3 = a.add(100,200);
		double r4 = a.add(3.14,1);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		int i1 = Integer.parseInt("100");
		int i2 = Integer.parseInt("100", 2);
		int i3 = Integer.parseInt("100", 16);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		

	}

}
