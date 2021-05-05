package chap11;
/*Wrapper Ŭ���� : 8���� �⺻ �ڷ����� ��üȭ �ϱ� ���� Ŭ����
 * 
 * �⺻�ڷ��� 	Wrapper Ŭ����
 * boolean  Boolean
 * char		Character
 * byte		Byte
 * short 	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * �⺻ �ڷ����� �����ڷ����� ����ȯ�� �Ұ���.
 * String str = 'A'; (x)
 * ���������� �⺻�ڷ����� Wrapper Ŭ�������� ����ȯ�� �����ϴ�.(jdk5 ���� ����)
 * �⺻��<= ������ : auto UnBoxing
 * ������<= �⺻�� : auto Boxing
 * 
 * */
public class WrapperEx1 {

	public static void main(String[] args) {
//	Integer i1 = new Integer(100);
//	Integer i2 = new Integer(100);
		Integer i1 = 100; //auto Boxing
		Integer i2 = 100;
	System.out.println("i1 == i2 :"+ (i1==i2));
	System.out.println("i1.equals(i2)"+i1.equals(i2));//equals�� Object�� ����Ŭ�������� ��� ����. ��, i1,i2 ��� ��ü
	//auto Boxing
	System.out.println("i1 == 100 :"+ (i1==100));
	System.out.println(System.identityHashCode(i1));
	System.out.println(System.identityHashCode(i2));
	//int �� ����
	System.out.println("int ���� �ִ�: " + Integer.MAX_VALUE);
	System.out.println("int ���� �ּڰ�: " + Integer.MIN_VALUE);
	System.out.println("int ���� bit ��: " + Integer.SIZE);
	//byte �� ����
	System.out.println("byte ���� �ִ�: " + Byte.MAX_VALUE);
	System.out.println("byte ���� �ּڰ�: " + Byte.MIN_VALUE);
	System.out.println("byte ���� bit ��: " + Byte.SIZE);
	//������ <= ���ڿ�
	int num = Integer.parseInt("123");
	System.out.println(num+100);
	//8���� 123�� �� ���
	num = Integer.parseInt("123",8); //8������ 128
	System.out.println(num); //������� 10����
	//16���� 255�� �� ���
	num = Integer.parseInt("FF",16); //16������ FF
	System.out.println(num); //������� 10����
	//255�� 2���� ǥ���ϱ�
	System.out.println(Integer.toBinaryString(num));
	//255�� 8���� ǥ���ϱ�
	System.out.println(Integer.toOctalString(num));
	//255�� 16���� ǥ���ϱ�
	System.out.println(Integer.toHexString(num));
	}

}
