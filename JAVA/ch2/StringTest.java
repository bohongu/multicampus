package ch2;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "java";
		char c1 = 'j';
		int i1 = 100;
		
		System.out.println(s1); // String - 0개 이상의 문자열 ""
		System.out.println(c1); // char - 1개의 문자 ''
		
		System.out.println(s1 + c1);
		System.out.println(s1 + i1);
		System.out.println(c1 + i1);
		// + 1.숫자 덧셈
		// + 2.문자열 결합
		
		byte b1 = 127; // = -128 ~ 127
		// byte b2 = 128; - error
		
		int i2 = 127; //127 (4byte)
		byte b3 = (byte)i2; //127 (1byte)
		
		int i3 = 97;
		System.out.println(i3);//97
		System.out.println((char)i3);//a;
		// 'A' 출력
		System.out.println((char)(i3-32));
		 
	}

}
