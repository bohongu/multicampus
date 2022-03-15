package ch4;

public class GugudanTest {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				if (j==5) {
					continue;//5단 빼고 출력
					//break;//5단까지 출력
				}
				
				
				/*if (j==5) {
					System.out.print("->");
				}*/
				System.out.print(j + " * " + i + " = " + i*j + "\t");
			}//inner for end
			System.out.println();
		}//outer for end
		
	}//main end
	
}//class end