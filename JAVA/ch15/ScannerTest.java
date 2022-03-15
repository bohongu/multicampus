package ch15;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하면 덧셈 연산 수행합니다.");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int sum = first+second;
		System.out.println(sum);
		System.out.println("한글입력하세요");
		String third = sc.next();// 한개의 단어(공백이전)
		System.out.println(third);*/
		
		//100 김사원 345600.5 사원 교육부 - Emolyee 변수값 초기화
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.next();
		double pay = sc.nextDouble();
		String title = sc.next();
		String dept = sc.next();
		
		Employee e = new Employee(id, name, pay, title, dept);
		
		System.out.println(e);

	}

}

class Employee {
	int id;
	String name;
	double pay;
	String title, dept;
	
	public Employee(int id, String name, double pay, String title, String dept) {
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.title = title;
		this.dept = dept;
	}
	
	public String toString () {
		return id + " " + name + " " + pay + " " + title + " " + dept;
		
	}
}