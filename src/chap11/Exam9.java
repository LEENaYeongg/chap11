package chap11;

import java.util.Random;

/* true/false ���� ������ �߻��Ͽ� �ý��۰� ����ڰ� 3�� �������� true�� ������ ������ �¸��ϵ��� ���α׷� �����ϱ� */
/* �� ����: while������ �������� ����ϰ� 3���� ���������� stop �ϰ� �¸� ��� */

public class Exam9 {
	public static void main(String[] args) {
		Random srand = new Random();
		srand.setSeed(System.currentTimeMillis());
		Random urand = new Random();
		urand.setSeed(System.currentTimeMillis());
		int syscnt=0, usercnt=0;
		while (true) {
			if(srand.nextBoolean()) {
				syscnt++;
				System.out.print("�ý��� true");
			}else {
				syscnt=0;
				System.out.print("�ý��� false");
			}
			if(urand.nextBoolean()==true) {
				usercnt++;
				System.out.println("\t����� true");
			}else {
				usercnt =0;
				System.out.println("\t����� false");
			}
			if(syscnt ==3 || usercnt ==3) break;
		}
		if(syscnt ==3 &&usercnt==3)
			System.out.println("���");
		else if (syscnt ==3)
			System.out.println("�ý��� �¸�");
		else System.out.println("����� �¸�");
	}
}
