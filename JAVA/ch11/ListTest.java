package ch11;

import java.util.ArrayList;

class Employee {
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) {
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	public String toString () {
		return id+"-"+name+"-"+pay;
	}
	public int hashCode() {
		//객체식별자값
		return id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			return hashCode() == o.hashCode();
		} else {
			return false;
		}
	}
}

public class ListTest {

	public static void main(String[] args) {
		// 1. 동일타입 데이터만 저장 구조 2. 길이 한정
		String [] sarr = new String[100];
		// 1. 모든 타입 데이터 저장 구조 2. 길이 가변
		//ArrayList list = new ArrayList(5, 3); //최조 5개 공간 + 3개씩 자동 증가
		//ArrayList list = new ArrayList(); //최조 10개 공간 + 10개씩 자동 증가
		
		ArrayList list = new ArrayList(5); //최조 5개 공간 + 5개씩 자동 증가
		list.add("java");
		list.add(100);
		list.add(3.14);
		list.add("java");
		list.add(100);
		list.add(3.14);
		
		Employee e1 = new Employee(100, "박과장", 500000.55);
		Employee e2 = new Employee(200, "김대리", 400000.55);
		Employee e3 = new Employee(300, "최부장", 600000.55);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		//list.remove(0);
		//list.set(0, 200);
		System.out.println(list.size());
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(i + "번째 인덱스 값 = " + list.get(i)/*.toString*/);
		}
		
		System.out.println("======================================");
		for(Object one : list) {
			System.out.println(one);
		}
	}

}
