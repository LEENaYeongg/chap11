package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {
	public static void main(String[] args) {
		String source = "�ڵ���:010-1111-1111,��:02-123-5678," + "�̸���:regular@aaa.bbb,���¹�ȣ:301-12-123456";
		String telpattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telpattern);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("��ȭ��ȣ :");
		while (m.find()) { // ������ ���Ͽ� �´� �κ��� ã��
//			m.group() : ��Ī�� ���ڿ� �׷�
			System.out.println(++i + ":" + m.group() + "->" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		i=0;
		String emailpattern = "(\\w+)@(\\w+).(\\w+)";
		System.out.println("�̸���:");
		p = Pattern.compile(emailpattern);
		m = p.matcher(source);
		while (m.find()) {
			System.out.println(++i + ":" + m.group() + "->" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
		//source���� ���¹�ȣ ����ϱ�.
		i=0;
		String bankpattern ="(\\d{3})-(\\d{2})-(\\d{6})";
		System.out.println("���¹�ȣ:");
		p=Pattern.compile(bankpattern);
		m = p.matcher(source);
		while (m.find()){
			System.out.println(++i + ":" + m.group() + "->" + m.group(1) + "," + m.group(2) + "," + m.group(3));
		}
	}
}
