package test_1012;

import java.util.Calendar;
import java.util.Scanner;

/*�⵵�� ���� �Է� �޾� �ش� ���� �޷��� ����ϱ�

[���]
�⵵�� ���� �Է��ϼ���

2020 10

     2020��10��

��   ��     ȭ    ��    ��    ��   ��
1  2  3
4  5  6  7  8  9  10
11 12 13 14 15 16 17
18 19 20 21 22 23 24
25 26 27 28 29 30 31
 * */

//ù ��¥�� �������� �˾ƾ���.
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� ���� �Է��ϼ���"); // ��� ���� �Է¹���.
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance(); // Ķ���� ��ü ������ �̰� ���� �ð�
		cal.set(year, (mon - 1), 1); // �Է��� ���� ù��° ��¥ ����
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // �ش糯¥ ���� ��������
		String[] week = { "", "��", "ȭ", "��", "��", "��", "��" };
		System.out.println("\n" + "  " + cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONTH) + 1) + "��");
		System.out.println("   ��      ȭ      ��      ��      ��      ��      ��");
		int end = cal.getActualMaximum(Calendar.DATE); //������ ����

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < dayOfWeek; j++) {
					System.out.print("    "); //ù���� �����Ϻ��� ä������ ������ �������� ä���
				}
			}
			if (i < 10) { //���ڸ����� ��� ������ �߰��ؼ� �ٸ��߱�
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (dayOfWeek % 7 == 0) { //���ٿ� 7��
				System.out.println();
			}
			dayOfWeek++;
		}
	}
}
