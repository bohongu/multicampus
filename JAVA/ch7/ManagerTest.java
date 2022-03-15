package ch7;

class Employee /*extends Object*/{
	int id;
	String name;
	double pay;
	String role = "회사원";
	void work() {
		System.out.println(id + " 사번의 사원명은 " + name + "이고 급여는 " + pay + " 입니다.");
		
	}
}

class Manager extends Employee {
	//상속 자동 포함 String role = "회사원";
	String role = "매니저";
	String jobOfManage;
	void getManage() {
		System.out.println(name + " 매니저는 " + jobOfManage + " 입니다.");
	}
	/*자동 포함 void work() {
		System.out.println(id + " 사번의 사원명은 " + name + "이고 급여는 " + pay + " 입니다.");
	}*/
	//work 기능을 Manager만의 기능으로 "재정의"하면 Manager 우선 실행 - Overriding
	@Override // annotation - 컴파일러나 실행시간 알려준다.
	void work() {
		super.work();
		System.out.println("관리업무는 " + jobOfManage);
	}
	void test() {
		String role = "지역변수";
		System.out.println(role);
		System.out.println(this.role);
		System.out.println(super.role);
	}
}

public class ManagerTest /*extends Object*/{

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.name ="김지원";
		m1.jobOfManage = "IT매니저";
		m1.id =100;
		m1.pay = 123456.99;
		m1.work();
		m1.getManage();
		System.out.println(m1.role);
		m1.test();
		//System.out.println(Manager.role);
		//System.out.println(Employee.role);

	}

}
