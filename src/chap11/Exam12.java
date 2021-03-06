package chap11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 문제 : str 문자열에서 과목만 출력하기 */
public class Exam12 {

	public static void main(String[] args) {
		String str = "Java and JSP and Spring" + "and HTML and JavaScript and Jquery";
		
		System.out.println("String.split 메서드 이용:");
		String[] arr = str.split("\\s*and\\s*");
		for (String s : arr) System.out.println(s);
		System.out.println();
		
		System.out.println("Scanner 이용:");
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while ( scan.hasNext()) {
			System.out.println(scan.next());
		}
				}
		}
