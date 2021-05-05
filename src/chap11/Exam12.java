package chap11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* ���� : str ���ڿ����� ���� ����ϱ� */
public class Exam12 {

	public static void main(String[] args) {
		String str = "Java and JSP and Spring" + "and HTML and JavaScript and Jquery";
		
		System.out.println("String.split �޼��� �̿�:");
		String[] arr = str.split("\\s*and\\s*");
		for (String s : arr) System.out.println(s);
		System.out.println();
		
		System.out.println("Scanner �̿�:");
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while ( scan.hasNext()) {
			System.out.println(scan.next());
		}
				}
		}
