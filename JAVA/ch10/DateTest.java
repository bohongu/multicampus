package ch10;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		Calendar cal = Calendar.getInstance();//static메소드 - Calender객체 리턴
		System.out.println(cal);
		
		//년도 월 일 시 분 초
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //1월 = 0
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년도");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(min + "분");
		System.out.println(second + "초");
		
		//DAY_OF_WEEK : 요일 0:일 1:월 ...
		String[] weekday = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		//cal 에서 요일 추출하여 weekday의 값으로 출력
		int date = cal.get(Calendar.DAY_OF_WEEK);
		for(int i = 0;i<=date;i++) {
			System.out.println(weekday[i]);
		
		}
	}
}
