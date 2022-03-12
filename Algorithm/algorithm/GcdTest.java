package algorithm;

public class GcdTest {

	public static void main(String[] args) {
		int a=100;
		int b=30;
		
		/*for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.println(i + "는 " + a + "의 약수");
			}
		}
		
		for(int i=1;i<=b;i++) {
			if(b%i==0) {
				System.out.println(i + "는 " + b + "의 약수");
			}
		}*/
		
		for(int i=1;i<=b;i++) {
			if(b%i==0 && a%i==0) {
				System.out.println(i);
			}
		}
		System.out.println("=============");
		//최대공약수 1
		int max, min;
		if(a > b) {
			max =a;
			min =b;
		} else {
			max =b;
			min =a;
		}
		while(true) {
		int temp = max - min;
		if(temp == 0) break;
		if(temp < min) {
			max = min;
			min = temp;
		} else {
			max = temp;
			min = min;
		}
		
		}
		System.out.println(max);
		System.out.println("=============");
		//최대공약수 2
		max = 100;
		min = 30;
		while(true) {
			int temp = max % min;
			if(temp == 0) break;
			max = min;
			min = temp;
		}
		System.out.println(min);
		System.out.println("=============");
		System.out.println(gcd(100, 30));		
	}
	//재귀
	static int gcd(int max, int min) {
		if(max % min == 0) return min;
		return gcd(min, max % min);
	}

}
