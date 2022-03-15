package generictest;

class Apple{
	String origin;
	Apple(String origin){
		this.origin=origin;
	}
}

class Paper{
	String size;
	Paper(String size) {
		this.size=size;
	}
}

class Box<T>{
	T contents;//상자 내부 내용물 변수 - 내용물 종류 다양
	Box(T contents) {
		this.contents=contents;
	}
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	
}

public class GenericTest {

	public static void main(String[] args) {
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box<Apple> aBox = new Box<Apple>(a);
		Box<Paper> pBox = new Box<Paper>(p);
		System.out.println(aBox.getContents().origin);
		System.out.println(pBox.getContents().size);

	}

}
