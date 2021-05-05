package chap11;

/* 문자열 1,234를 정수로 변경하여 * 10 한 값을 세자리마다, 찍어 출력하기
 * 12,340
 * 
 * */
public class Exam6 {
	public static void main(String[] args) {
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",", "")); // ''문자는 빈 문자를 쓸 수 없지만 ""문자열은 빈 문자열 가능.
		System.out.println(String.format("%d", num * 10));
		System.out.printf("%d\n", num * 10);
	}
}
