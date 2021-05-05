package chap11;
/* 한 곳만 수정하기
 * [결과]
 * basket
 * basketball
 * */
public class Exam4 {
	public static void main(String[] args) {
		String str = "base"; //basket
		System.out.println(str = str.replace('e', 'k')+"et"); //str에 바뀐 문자가 다시 들어감.
		str += "ball";
 		System.out.println(str);
	}
}
