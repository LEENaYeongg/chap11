package chap11;

import java.util.Calendar;

/*Calendar 예제
 * 추상 클래스이므로 new Calendar() 생성자로 객체 생성 불가.
 * 단 getInstance() static 메서드로 현재 날짜에 해당하는 객체를 리턴*/
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("년도:"+today.get(Calendar.YEAR));
		System.out.println("이번달(0:1월 ~ 11:12월):"+(today.get(Calendar.MONTH)+1));
		System.out.println("년도기준 몇째주:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇째주:"+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자:"+today.get(Calendar.DATE));
		System.out.println("일자:"+today.get(Calendar.DAY_OF_MONTH)); //일요일(1)부터 시작
		System.out.println("년도기준날짜:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1:일~7:토):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월기준 몇째요일:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전(0)_오후(1):"+Calendar.AM_PM);
		System.out.println("시간(0~11):"+today.get(Calendar.HOUR));
		System.out.println("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):"+today.get(Calendar.MINUTE));
		System.out.println("초(0~59):"+today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):"+today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(-12~12):"+today.get(Calendar.ZONE_OFFSET)/(60*60*1000)); //
		System.out.println("이번달의 마지막일자:"+today.getActualMaximum(Calendar.DATE));
		}

}
