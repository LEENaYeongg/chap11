package chap11;

/* ���ڿ� 1,234�� ������ �����Ͽ� * 10 �� ���� ���ڸ�����, ��� ����ϱ�
 * 12,340
 * 
 * */
public class Exam6 {
	public static void main(String[] args) {
		String str = "1,234";
		int num = Integer.parseInt(str.replace(",", "")); // ''���ڴ� �� ���ڸ� �� �� ������ ""���ڿ��� �� ���ڿ� ����.
		System.out.println(String.format("%d", num * 10));
		System.out.printf("%d\n", num * 10);
	}
}
