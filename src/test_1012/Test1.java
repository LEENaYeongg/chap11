package test_1012;

import java.util.Calendar;
import java.util.Scanner;

/*년도와 월을 입력 받아 해당 월의 달력을 출력하기

[결과]
년도와 월를 입력하세요

2020 10

     2020년10월

일   월     화    수    목    금   토
1  2  3
4  5  6  7  8  9  10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30 31
 * */

//첫 날짜의 시작점을 알아야함.
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요"); // 년과 월을 입력받음.
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance(); // 캘린더 객체 가져옴 이건 현재 시간
		cal.set(year, (mon - 1), 1); // 입력한 월의 첫번째 날짜 설정
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 해당날짜 요일 가져오기
		String[] week = { "", "월", "화", "수", "목", "금", "토" };
		System.out.println("\n" + "  " + cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월");
		System.out.println("   월      화      수      목      금      토      일");
		int end = cal.getActualMaximum(Calendar.DATE); //마지막 일자

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    "); //첫줄이 월요일부터 채워지지 않으면 공백으로 채우기
				}
			}
			if (i < 10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayOfWeek % 7 == 0) { //한줄에 7일
				System.out.println();
			}
			dayOfWeek++;
		}
	}
}
