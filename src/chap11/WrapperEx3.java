package chap11;

/* switch �������� ���ǰ����� ����� �� �ִ� �ڷ���
 * byte, short, int, char, String(jdk7.0���� string �߰�)
 * Byte, Short, Integer, Character 
 * */
public class WrapperEx3 {
	public static void main(String[] args) {
		int data = 65;
		switch (data) {
		default:
			System.out.println("switch �׽�Ʈ");
		}
	}
}
/* Java.lang ��Ű���� Ŭ����
 * Object : ��� Ŭ������ �ֻ���.
 * String : ���ڿ�. ���Կ����� ��ü���� ����, +���갡��
 * StringBuffer : ���ڿ��� ����Ŭ����
 * 				  ���� ���ڿ� Ŭ����. equals �޼��� ���ٶ��̵� �ȵ�.
 * 				  ���� �񱳸� ���ؼ��� String Ŭ������ ��ȯ(toString())�� �ʿ���.
 * Math : ��ġ ����� ���� �޼��带 ����� ����. static  �޼�����.
 * 		   ��ü ���� �Ұ���.
 * Wrapper :
 * 			 Boolean, Byte, Short, Integer, Long, Float, Double, Character
 * 			  �����Ͽ� ��Ī�ϴ� Ŭ����
 * 			 Boxing, unBoxing => �ڵ� ����ȯ
 *  */