package ch10;

import java.util.Calendar;

public class DateTest2 {

	public static void main(String[] args) {
		//알고리즘 문장 수행 시간 측정
		//현재시각
		Calendar cal = Calendar.getInstance();
		long starttime = cal.getTimeInMillis();
		
		
		
		//알고리즘 문장
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
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//3초동안 아무 액션x
		
		//현재시각
		Calendar c2 = Calendar.getInstance();
		long endtime = c2.getTimeInMillis();
		System.out.println(endtime - starttime + "(1/1000초단위) 경과함");
	}

}
