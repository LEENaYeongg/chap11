package chap11;
/* delChar 메서드 구현하기
 * StringBuffer delChar(원본문자열, 삭제문자열)
 * */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3#4~5)","~!@#$%^&*()"));//12345
		System.out.println(delChar("(1!2@3#4~5)","12345"));//(!@^~)
	}
	static StringBuffer delChar(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			//if(del.indexOf(str.charAt(i))<0) { //방법1
			if(!del.contains(str.charAt(i)+"")) {  //방법2 ==> 단, 문자열만 가능
				sb.append(str.charAt(i));
			}
		}
		return sb;
	}
}
