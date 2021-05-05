package chap11;
/*String클래스의 객체는 정적인 문자열 객체임.*/
public class Exam2 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main :"+str);
		str = change(str); //매개변수 str가 ABC123을 참조
//		change(str); ==> 새로운 객체를 만들어 버려 뒤에 붙이지 못한다.
		System.out.println("change 이후 main :"+ str);
	}
	private static String change(String str) {
		str += "456";
		System.out.println("change :" + str);
		return str;
	}
}
