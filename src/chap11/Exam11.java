package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*  년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기 
 * 단, Calendar 클래스로 구현하기*/
public class Exam11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요"); //년과 월을 입력받음.
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance(); //캘린더 객체 가져옴 이건 현재 시간
		cal.set(year, (mon-1),1); // 입력한 날짜와 월-1
		//cal : 입력한 월의 1일 설정.
		//lastday :  입력한 월의 마지막 일자
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year, (mon-1), lastday); //다시한번 날짜 설정
		String[] week = {"","월","화","수","목","금","토"};
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"+cal.get(Calendar.DATE)+"일 "+
		week[cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)]+"요일");
	}

}
