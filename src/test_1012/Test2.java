package test_1012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기

[결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2020-02-28

두번째 날짜를 입력하세요(yyyy-MM-dd)
2020-03-02

2020-03-02 -2020-02-28 일자의 차이 : 3
 * */
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 날짜를 입력하세요");
		String f = scan.next();
		System.out.println("두번째 날짜를 입력하세요");
		String s = scan.next();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date start = format.parse(f);
			Date end = format.parse(s);
			long diffDay = (start.getTime() - end.getTime()) / (24 * 60 * 60 * 1000); //두 날짜 사이의 밀리초를 일자로 바꿈.
			System.out.println(f + " - " + s + " 일자의 차이 : " + diffDay + "일");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
