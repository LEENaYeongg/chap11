package chap11;
/* String 클래스 : format  메서드 예제
 * 				=> 형식화 문자를 사용할 수 있는 메서드
 * 				=> 클래스 메서드임.
 * 
 * */
public class StringEx3 {
	public static void main(String[] args) {
		//소숫점 이하 2자리로 출력. 소숫점이하 3자리에서 반올림
		//%f : 실수형 숫자를 형식화 하는 기호
		String sf = String.format("%.2f", 0.124);
		System.out.println(sf); 
		sf = String.format("%.2f", 0.125);
		System.out.println(sf); 
		sf = String.format("%f", 0.1251111);
		System.out.println(sf); 
		//%d : 10진 숫자를 형식화 하는 기호
		//%10d : 10진 숫자를 10자리 확보하여 출력, 우측 정렬
		System.out.println(String.format("%10d", 12345));
		//%-10d : 10진 숫자를 10자리 확보하여 출력, 좌측 정렬
		System.out.println(String.format("-10d", 12345));
		//%010d : 10진 숫자를 10자리 확보하여 출력, 빈자리 0으로 채움
		System.out.println(String.format("%010d", 12345));
		//%,10d : 10진 숫자를 10자리 확보하여 출력,3자리, 출력
		System.out.println(String.format("%,10d", 12345));
		//%X, %x : 16진 정수를 형식화 하는 기호 
		System.out.println(String.format("%X", 255));
		System.out.println(String.format("%x", 255));
		//%o : o진 정수를 8진수로 형식화 하는 기호
		System.out.println(String.format("%o", 12345));
		//%s : 문자열을 형식화 하는 기호
		System.out.println(String.format("%s", "홍길동"));
		//%c : 문자를 형식화 하는 기호
		System.out.println(String.format("%c", 'A'));
		System.out.println(String.format("%s의 학점은 %c입니다", "홍길동",'A'));
	}

}
