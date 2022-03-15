abstract class Shape {
	abstract public void area();
	abstract public void circum();
}

class Rectangle extends Shape {
	//메서드 overriding : 리톤타입, 이름, 매개변수 동일하고 접근 modifier 동일하거나 더 넓어도 됨
	int width = 0;
	int height = 0;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.println("가로 = " + width + " 세로 = " + height + " 인 사각형의 면적 = " + width*height);
	}

	@Override
	public void circum() {
		System.out.println("가로 = " + width + " 세로 = " + height + " 인 사각형의 둘레 = " + 2*(width+height));
		
	}

}

class Circle extends Shape {
	int radius = 0;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("반지름 = " + radius + " 인 원의 면적 = " + radius*radius*3.14);
		
	}

	@Override
	public void circum() {
		System.out.println("반지름 = " + radius + " 인 원의 둘레 = " + 2*radius*3.14);
		
	}
	
}

class Parent {
	String name = "부모";
	void tellName() {
		System.out.println(name);
	}
}

class Child extends Parent {
	int su = 2;
	void tellSu() {
		System.out.println(su);
	}
	//overriding
	void tellName() {
		System.out.println("자식");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.tellName(); //자식. 형변환된 후에 overriding된 메서드이면 자식 메서드 호출
		System.out.println(p.name);//부모
		
		
		Shape s1 = new Rectangle(5,8);
		Shape s2 = new Circle(6);
		Shape s3 = new Circle(7);
		Shape s4 = new Rectangle(10,15);
		
		Shape ar[] = new Shape[4];
		ar[0] = s1;
		ar[1] = s2;
		ar[2] = s3;
		ar[3] = s4;
		
		for(int i =0;i<ar.length;i++) {
			ar[i].area();
			ar[i].circum();
			if(ar[i] instanceof Circle) {
				//Circle c = (Circle)ar[i];// 명시적 형변환 이후 변수 Circle 클래스 사용 가능
				System.out.println(((Circle)ar[i]).radius);
			}
		}	
	}
}
