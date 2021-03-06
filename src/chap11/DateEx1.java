package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; //java.util => 날짜와 시간 출력
						// java.sql => 날짜만 출력
/* Date 클래스 예제 
 * SimpleDateFormat : 형식화 클래스. Date 객체를 형식화된 문자열로 변경
 * String format(Date) : Date 객체를 지정된 format 형식에 맞도록 문자열로 리턴 
 * Date parse(String) :  형식에 맞는 문자열을 Date 객체로 리턴
 * 						 ParseException 예외처리 필수*/

public class DateEx1 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd HH시mm분ss초 E a");
		System.out.println(sf.format(now)); // sf 형식으로 출력해~
		/*
		 * 날짜 format에 사용되는 문자 yyyy : 년도 4자리 MM : 월을 2자리 dd : 일을 2자리 HH : 시간을 2자리 mm : 분을
		 * 2자리 ss : 초를 2자리 E : 요일 a : 오전/오후
		 */

		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2020-12-25 10:00:00";
		Date day = null;
		try {
			day = sf2.parse(dateStr);// parse는 예외처리가 필수.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		// 문제 : day 날짜를 "2020-12-25 금요일" 형식으로 출력하기
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
	}

}
