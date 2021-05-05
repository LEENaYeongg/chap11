package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* ���� ǥ���� ����  :  ������ ������ �����Ͽ� ��ġ ���θ� ���� */
public class RegularEx1 {
	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "cambat", "count", "cTT", "data","disk", "c" };
/*
 * c[a-z] : ù��° ���ڰ� c�̸鼭, ������ ���ڰ� �ҹ���(1��)�� �̷���� ���ڿ�
 * c[a-z]* : ù��° ���ڰ� c�̸鼭, ������ ���ڰ�  �ҹ��ڵ�(������)�� �̷���� ���ڿ�
 *       * : 0�� �̻�.
 * c[a-z]+ : ù��° ���ڰ� c�̸鼭, ������ ���ڰ�  �ҹ��ڵ�(������)�� �̷���� ���ڿ�   
 * 		 + : 1�� �̻�.
 * c[a-z]? : ù��° ���ڰ� c�̸鼭, ������ ���ڰ�  �ҹ��ڵ�(������)�� �̷���� ���ڿ�   
 * 		 ? : 0,1�� �̻�.
 * 
 * */
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for (String s : data) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.print(s + ",");
			}
		}
		System.out.println();
		String names = "ȫ�浿, 	���, �̸���	, 	������	,  �Ӳ���";
//		String[] arr = names.split(",");
//		\\s : ����, *:0�� �̻�
//		\\s*,\\s* : ,�� �������� �յڰ����� �����ؼ� ���ڿ� ����
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr)
			System.out.println(s);
	}

}
