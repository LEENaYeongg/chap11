package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규 표현식 예제  :  문자의 형식을 지정하여 위치 여부를 결정 */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "cambat", "count", "cTT", "data","disk", "c" };
/*
 * c[a-z] : 첫번째 문자가 c이면서, 이후의 문자가 소문자(1개)로 이루어진 문자열
 * c[a-z]* : 첫번째 문자가 c이면서, 이후의 문자가  소문자들(여러개)로 이루어진 문자열
 *       * : 0개 이상.
 * c[a-z]+ : 첫번째 문자가 c이면서, 이후의 문자가  소문자들(여러개)로 이루어진 문자열   
 * 		 + : 1개 이상.
 * c[a-z]? : 첫번째 문자가 c이면서, 이후의 문자가  소문자들(여러개)로 이루어진 문자열   
 * 		 ? : 0,1개 이상.
 * 
 * */
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for (String s : data) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.print(s + ",");
			}
		}
		System.out.println();
		String names = "홍길동, 	김삿갓, 이몽룡	, 	성춘향	,  임꺽정";
//		String[] arr = names.split(",");
//		\\s : 공백, *:0개 이상
//		\\s*,\\s* : ,를 기준으로 앞뒤공백을 포함해서 문자열 나눔
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr)
			System.out.println(s);
	}

}
