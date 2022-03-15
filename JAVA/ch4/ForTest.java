package ch4;

public class ForTest {

	public static void main(String[] args) {
		// 1-10 총합계
		int total = 0;
		for(int i=1; i<=10; i++) {
			//System.out.println(i);
			total = total + i;
			System.out.println("i=" + i +  " 일 때 total= " + total);
		}
		//System.out.println(total);
		
		// while
		int total2 = 0;
		int i2 = 1;
		while(i2 <= 100) {
			total2 = total2 + i2;
			System.out.println("i2=" + i2 +  " 일 때 total2= " + total2);
			i2++;
		}
		//System.out.println(total2);
		
		// do - while : 최소 1번 이상 수행
		int total3 = 0;
		int i3 = 101;
		do {
			total3 = total3 + i3;
			System.out.println("i3=" + i3 +  " 일 때 total3= " + total3);
			i3++;
		}while( i3 <= 100);
	}

}
