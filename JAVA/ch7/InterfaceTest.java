class Teacher {
	String name = "선생님";
	void teach() {
		System.out.println("가르치다");
	}
}

class StudentWorker extends Teacher implements Worker, Student {
	String name = "조교";
	void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	@Override
	public void study() {
		System.out.println("공부하다");
	}

	@Override
	public void work() {
		System.out.println("학교업무보다");
	}

	@Override
	public void lunch() {
		System.out.println("점심먹다");
	}
	
}
public class InterfaceTest {

	public static void main(String[] args) {
		StudentWorker sw = new StudentWorker();
		sw.study();// 인터페이스 구현
		sw.lunch();// 인터페이스 구현(2개 인터페이스 포함 - 구현 1번)
		sw.work();// 인터페이스 구현
		sw.teach();//Teacher에게 상속 받음
		System.out.println(Student.name);//(name)인터페이스 상속 2개
		System.out.println(Worker.name);//static 변수라 (인터페이스명.변수) 가능
		System.out.println(sw.name);
		sw.getName();
		
		//매개변수 전달 객체의 다형성
		StudentService ser = new StudentService();
		Student s = new StudentWorker();
		ser.serve(s);
		Student s2 = new HighStudent();
		ser.serve(s2);
	}

}

class HighStudent implements Student {

	@Override
	public void study() {
		System.out.println("고등학생이 공부하다");
	}

	@Override
	public void lunch() {
		System.out.println("무상급식하다");
	}
	
}

class StudentService {
	void serve(Student st) {
		st.study();
	}
}
