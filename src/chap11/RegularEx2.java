package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 예제 
 * 
 * . :  문자 하나 
 * ? : 0 또는 1
 * + : 1개 이상
 * * : 0개 이상
 * ^ : 문자열의 시작
 * [] : [] 지정된 문자 한개
 * [^] : 지정된 문자를 제외하고
 * | : or
 * & : and
 * {} : 그룹
 * \s : 공백한개
 * \S : 공백이 아닌 문자
 * \d : 숫자
 * \D : 숫자가 아닌 문자
 * \w : 특수문자가 아닌 문자 [a-zA-Z0-9]
 * \W : 특수문
 * {n} : n개의 문자 \d{3}
 * {n,} : 최소 n개의 문자
 * {n,m} : n개~m개 까지 문자
 * */
public class RegularEx2 {
	public static void main(String[] args) {
		String[] patterns = { ".", "[a-z]?", "[0-9]", "^[0-9]", "[^0-9]", "[a-z]*", "[a-z]+", "02|010", "\\s", "\\S",
				"\\d", "\\w", "\\W" };
		// w: 일반문자,W : 특수문자,  s: 공백인, S: 공백이 아닌 , ^ 안에 들어가면 : not ,^ 바깥에 들어가면:
		String[] datas = { "", "a", "1", "12", "012", "abc", "02", " ", "A", "5", "a", "*" };
		for (String d : datas) {
			if (d.equals("")) {
				System.out.print("빈문자\"\"의 패턴=>");
			} else if (d.equals(" ")) {
				System.out.print("공백문자\"\"의 패턴=>");
			} else {
				System.out.print(d + "문자의 패턴=>");
			}
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
			System.out.println();
		}
	}
}
