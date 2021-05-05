package test_1013;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*1.  다음 결과가 나오도록 프로그램을 작성하시오

[결과]
찾고자 하는 번호를 입력하세요(종료:q)
3456
012-3456-7890
013-3456-7890
찾고자 하는 번호를 입력하세요(종료:q)
1111111
찾는 번호가 없습니다.
찾고자 하는 번호를 입력하세요(종료:q)
7890
012-3456-7890
013-3456-7890
찾고자 하는 번호를 입력하세요(종료:q)
q

​*/
public class Test1 {
	public static void main(String[] args) {
		String[] phoneNumberArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		String telpattern = "(0\\d{2})-(\\d{4})-(\\d{4})";
		Pattern p = Pattern.compile(telpattern);
		Scanner scan = new Scanner(System.in);
		int cnt =0;
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			String str = scan.next();
			
			if (str.equals("q")) //q일때 멈춤.
				break;
			
			for (String s : phoneNumberArr) { 
				Matcher m = p.matcher(s);
				while (m.find()) { // 지정된 패턴에 맞는 부분을 찾기
					if (m.group(1).equals(str)) {
						System.out.println(s);
						cnt++;
					} if (m.group(2).equals(str)) {
						System.out.println(s);
						cnt++;
					} if (m.group(3).equals(str)) {
						System.out.println(s);
						cnt++;
					}
				}
			}
			if (cnt == 0)
				System.out.println("번호가 없습니다.");
		}
	}
}