package test_1012;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*�ΰ��� ��¥�� �Է¹޾Ƽ� �γ�¥������ �ϼ��� ����ϱ�

[���]
ù��° ��¥�� �Է��ϼ���(yyyy-MM-dd)
2020-02-28

�ι�° ��¥�� �Է��ϼ���(yyyy-MM-dd)
2020-03-02

2020-03-02 -2020-02-28 ������ ���� : 3
 * */
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ��¥�� �Է��ϼ���");
		String f = scan.next();
		System.out.println("�ι�° ��¥�� �Է��ϼ���");
		String s = scan.next();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date start = format.parse(f);
			Date end = format.parse(s);
			long diffDay = (start.getTime() - end.getTime()) / (24 * 60 * 60 * 1000); //�� ��¥ ������ �и��ʸ� ���ڷ� �ٲ�.
			System.out.println(f + " - " + s + " ������ ���� : " + diffDay + "��");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
