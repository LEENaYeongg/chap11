package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기 */
public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		String sday = year + "-" + (mon + 1) + "-01";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf.parse(sday); // 다음달 1일.
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 이번달의 마지막 일자
		day.setTime(day.getTime() - (1000 * 60 * 60 * 24 * 3)); //단위가 밀리기 때문에 *1000, 1분, 1시간, 하루, 3일
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}

}
