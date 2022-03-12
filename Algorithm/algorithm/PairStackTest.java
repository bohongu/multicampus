package algorithm;

import java.util.Stack;

public class PairStackTest {

	static boolean  isPair(String s) {
		Stack st = new Stack();
		for(int i = 0;i<s.length();i++) {
			if(s.equals("{")||s.equals("[")||s.equals("(")) {
				st.push(s.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
