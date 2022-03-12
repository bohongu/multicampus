package algorithm;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		//Scanner - 5 6 7 8 입력
		Stack<Integer> st = new Stack();
		
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		System.out.println("데이터 푸쉬 종료");			
		if(st.isEmpty() == false) {
			System.out.println("마지막 푸쉬 데이터 : " + st.peek());
		}
		
		System.out.println("데이터 팝 시작");
		while(! st.isEmpty()) {
			int value = st.pop();
			System.out.println(value);
		}
	}

}
