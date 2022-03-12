package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("+ - = 를 입력하세요");
			String selection = sc.next();
			if(selection.equals("+")) {
				queue.add(++i +"번 고객 번호표 발권");
				System.out.println(i + " 고객 번호표 발권");
			} else if (selection.equals("-")) {
				if(!queue.isEmpty()) {
					String result = queue.poll();
					System.out.println(result + " - 업무 처리");
				} else {
					System.out.println("대기중인 고객 처리 완료");
				}
				
			} else if(selection.equals("=")) {
				while (!queue.isEmpty()) {
					System.out.println(queue.poll() + " - 업무 미처리");
				}
				System.out.println("업무 종료");
				break;
			} else {
				System.out.println("잘못된 요청");
				break;
			}
		}

	}
}
