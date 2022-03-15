package ch6;

class Student {
	//Student () { } //자동 정의 = default constructor
	Student(int id , String name, String major){
		this.id=id;
		this.name=name;
		this.major=major;
	}
	Student(int id, String name){
		this(id,name,"전공미정");
		//this.id=id;
		//this.name=name;
		//major="전공미정";
	}
	Student(){
		this(-1,"none","전공미정");
		//id=-1;
		//name="none";
		//major="전공미정";
	}
	int id;//학번
	String name;
	String major;
	
	void study() {
		System.out.println(name + " 학생은 " + major + " 공부를 열심히 합니다.");
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student(10000, "김대한", "it전산학");
		st1.study();
		
		Student st2 = new Student(20000, "박민국");
		st2.study();

		Student st3 = new Student();
		st3.study();
		
		C c1 = null;//null 값 명시적 저장
		C c2 = new C();//객체주소값 저장
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
class C {
	int i = 10, j= 20, k= 30;
}
class D {
	int i,j;
	int l = 10;
	int k = l;
	
	C c1;//null 값 저장
	C c2 = new C();//객체주소값 저장
	D(int i){this.i = i ;
	}
	void m1() {
		System.out.println(j);
	}
}