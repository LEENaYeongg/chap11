package chap11;
/*Wrapper 클래스 : 8개의 기본 자료형을 객체화 하기 위한 클래스
 * 
 * 기본자료형 	Wrapper 클래스
 * boolean  Boolean
 * char		Character
 * byte		Byte
 * short 	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * 기본 자료형과 참조자료형은 형변환이 불가함.
 * String str = 'A'; (x)
 * 예외적으로 기본자료형과 Wrapper 클래스간의 형변환은 가능하다.(jdk5 이후 가능)
 * 기본형<= 참조형 : auto UnBoxing
 * 참조형<= 기본형 : auto Boxing
 * 
 * */
public class WrapperEx1 {

	public static void main(String[] args) {
//	Integer i1 = new Integer(100);
//	Integer i2 = new Integer(100);
		Integer i1 = 100; //auto Boxing
		Integer i2 = 100;
	System.out.println("i1 == i2 :"+ (i1==i2));
	System.out.println("i1.equals(i2)"+i1.equals(i2));//equals는 Object의 하위클래스여야 사용 가능. 즉, i1,i2 모두 객체
	//auto Boxing
	System.out.println("i1 == 100 :"+ (i1==100));
	System.out.println(System.identityHashCode(i1));
	System.out.println(System.identityHashCode(i2));
	//int 형 정보
	System.out.println("int 형의 최댓값: " + Integer.MAX_VALUE);
	System.out.println("int 형의 최솟값: " + Integer.MIN_VALUE);
	System.out.println("int 형의 bit 수: " + Integer.SIZE);
	//byte 형 정보
	System.out.println("byte 형의 최댓값: " + Byte.MAX_VALUE);
	System.out.println("byte 형의 최솟값: " + Byte.MIN_VALUE);
	System.out.println("byte 형의 bit 수: " + Byte.SIZE);
	//정수형 <= 문자열
	int num = Integer.parseInt("123");
	System.out.println(num+100);
	//8진수 123의 값 출력
	num = Integer.parseInt("123",8); //8진수의 128
	System.out.println(num); //결과값은 10진수
	//16진수 255의 값 출력
	num = Integer.parseInt("FF",16); //16진수의 FF
	System.out.println(num); //결과값은 10진수
	//255를 2진수 표현하기
	System.out.println(Integer.toBinaryString(num));
	//255를 8진수 표현하기
	System.out.println(Integer.toOctalString(num));
	//255를 16진수 표현하기
	System.out.println(Integer.toHexString(num));
	}

}
