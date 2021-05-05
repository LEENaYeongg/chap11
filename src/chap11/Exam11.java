package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*  �⵵�� ���� �Է¹޾Ƽ� ����� ������ ���ڿ� ���� ����ϱ� 
 * ��, Calendar Ŭ������ �����ϱ�*/
public class Exam11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� ���� �Է��ϼ���"); //��� ���� �Է¹���.
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance(); //Ķ���� ��ü ������ �̰� ���� �ð�
		cal.set(year, (mon-1),1); // �Է��� ��¥�� ��-1
		//cal : �Է��� ���� 1�� ����.
		//lastday :  �Է��� ���� ������ ����
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year, (mon-1), lastday); //�ٽ��ѹ� ��¥ ����
		String[] week = {"","��","ȭ","��","��","��","��"};
		System.out.println("��¥:"+cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DATE)+"�� "+
		week[cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)]+"����");
	}

}
