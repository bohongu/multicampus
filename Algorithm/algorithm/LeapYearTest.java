package algorithm;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		int [][] datesample = {{2022, 1, 24}, {2020, 12, 12}, {1999, 1, 1}, {2000, 12, 12}};
		for(int i = 0;i<datesample.length;i++) {
			int year = datesample[i][0];
			if(year%4 == 0 && year%100 != 0||year%400 ==0) {
				System.out.println(year + "윤년");
		}
		
		}
	}

}
