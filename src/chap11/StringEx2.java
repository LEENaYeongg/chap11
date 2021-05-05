package chap11;

/* String 클래스의 주요 메서드 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		// s 문자열에서 4번 인덱스(5번째) 문자를 리턴
		System.out.println(s.charAt(4));// E
		// 'A' - 'a' = -32 리턴. 정렬시 사용되는 메서드
		System.out.println(s.compareTo("abc")); // -32
		// IgnoreCase : 대소문자 상관없이
		System.out.println(s.compareToIgnoreCase("abcdefg"));
		// s + "abc" 의미
		System.out.println(s.concat("abc"));
		// s 문자열의 끝이 "GH"?
		System.out.println(s.endsWith("GH")); // true
		// s 문자열의 시작이 "ABC"?
		System.out.println(s.startsWith("ABC")); // true
		System.out.println(s.equals("ABCDEFGH")); // true
		System.out.println(s.equalsIgnoreCase("abcdEFGH"));// true

		s = new String("This is a String");
		// i라는 문자가 몇 번째 있니?
		System.out.println(s.indexOf('i'));// 2
		// indexOf(문자, 인댁스) : 인덱스부터 문자의 위치 인덱스값 리턴
		System.out.println(s.indexOf('i', 6)); // 5
		// indexOf(문자, 인댁스) : 인덱스부터 문자의 위치 인덱스값 리턴
		System.out.println(s.indexOf('i', 15)); // -1. 없는 경우
		// indexOf(문자열) : 문자의 위치 인덱스값 리턴
		System.out.println(s.indexOf("is")); // 2
		// lastIndexOf("is") : is 문자열 뒤쪽부터 검색하기.
		System.out.println(s.lastIndexOf("is"));// 5
		// length() : 문자열의 길이
		System.out.println(s.length()); // 16
		// replace(원본문자열,변경문자열) 치환
		System.out.println(s.replace("is", "QR"));
		// 부분문자열 : substring
		// 5번 인덱스 이후 문자열 리턴
		System.out.println(s.substring(5));
		// 5번 인덱스 부터 13번 인덱스 앞까지의 문자열 리턴
		System.out.println(s.substring(5,13));
		//소문자로 변경
		System.out.println(s.toLowerCase());
		//대문자로 변경
		System.out.println(s.toUpperCase());
		//양쪽 공백 제거(가운데 공백 X) : trim()
		System.out.println("    문자열 trim 메서드     ".trim());
		System.out.println("    문자열 trim 메서드     ");
		//문자열 분리 : split()
		String[] sarr = "홍길동,이몽룡,김삿갓".split(","); //,(콤마)를 기준으로 배열의 형태로 분리
		for(String ss : sarr ) System.out.println(ss);
		
		
	}
}
