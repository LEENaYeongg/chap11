package chap11;
/*StringŬ������ ��ü�� ������ ���ڿ� ��ü��.*/
public class Exam2 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main :"+str);
		str = change(str); //�Ű����� str�� ABC123�� ����
//		change(str); ==> ���ο� ��ü�� ����� ���� �ڿ� ������ ���Ѵ�.
		System.out.println("change ���� main :"+ str);
	}
	private static String change(String str) {
		str += "456";
		System.out.println("change :" + str);
		return str;
	}
}
