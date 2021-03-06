package ch6;

class Person {
	String name;
	int age;
	static final String nation = "대한민국";
}

public class PersonTest {

	public static void main(String[] args) {
		System.out.println(Person.nation);
		//System.out.println(Person.name); 불가능
		
		Person p1 = new Person();
		p1.name = "김기술";
		p1.age = 23;
		//p1.nation = "대한민국";
		System.out.println(p1.name + "은 나이가 " + p1.age + "세이고 국적은 " + p1.nation + "입니다.");

		Person p2 = new Person();
		p2.name = "박정보";
		p2.age = 33;
		//p2.nation = "대한민국";
		System.out.println(p2.name + "은 나이가 " + p2.age + "세이고 국적은 " + p2.nation + "입니다.");
		
		//p2.nation = "미국"; - final변수는 값을 수정할 수 없다.
		System.out.println(p1.name + "은 나이가 " + p1.age + "세이고 국적은 " + p1.nation + "입니다.");
		System.out.println(p2.name + "은 나이가 " + p2.age + "세이고 국적은 " + p2.nation + "입니다.");
	}

}
