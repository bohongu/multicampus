package ch9;

public class StringTest1 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "def";
		a = a + b;
		System.out.println(a);
		
		char c[] = {'a', 'b', 'c', 'd'};
		//String 변환
		String sc = new String(c);
		System.out.println(sc);
		System.out.println(sc.equals("abcd"));
		
		byte by[] = {65,66,67,68};
		//숫자 대응 문자로 변환
		String sb = new String(by);
		System.out.println(sb);
	}

}
