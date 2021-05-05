package chap11;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		//cal 2020-12-30 일로 설정
		cal.set(2020,(12-1),30); //월을 넣을 때 11로 넣어도 되지만 0부터 시작되기 때문에 12-1
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DATE)+"일");
		//cal 2020-12-30 일자의 요일을 출력하기
		String[] week = {"","월","화","수","목","금","토"};
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DATE)+"일 "+
		week[cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)]+"요일");
	}
}
