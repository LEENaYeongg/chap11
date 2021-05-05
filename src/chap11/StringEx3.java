package chap11;
/* String Ŭ���� : format  �޼��� ����
 * 				=> ����ȭ ���ڸ� ����� �� �ִ� �޼���
 * 				=> Ŭ���� �޼�����.
 * 
 * */
public class StringEx3 {
	public static void main(String[] args) {
		//�Ҽ��� ���� 2�ڸ��� ���. �Ҽ������� 3�ڸ����� �ݿø�
		//%f : �Ǽ��� ���ڸ� ����ȭ �ϴ� ��ȣ
		String sf = String.format("%.2f", 0.124);
		System.out.println(sf); 
		sf = String.format("%.2f", 0.125);
		System.out.println(sf); 
		sf = String.format("%f", 0.1251111);
		System.out.println(sf); 
		//%d : 10�� ���ڸ� ����ȭ �ϴ� ��ȣ
		//%10d : 10�� ���ڸ� 10�ڸ� Ȯ���Ͽ� ���, ���� ����
		System.out.println(String.format("%10d", 12345));
		//%-10d : 10�� ���ڸ� 10�ڸ� Ȯ���Ͽ� ���, ���� ����
		System.out.println(String.format("-10d", 12345));
		//%010d : 10�� ���ڸ� 10�ڸ� Ȯ���Ͽ� ���, ���ڸ� 0���� ä��
		System.out.println(String.format("%010d", 12345));
		//%,10d : 10�� ���ڸ� 10�ڸ� Ȯ���Ͽ� ���,3�ڸ�, ���
		System.out.println(String.format("%,10d", 12345));
		//%X, %x : 16�� ������ ����ȭ �ϴ� ��ȣ 
		System.out.println(String.format("%X", 255));
		System.out.println(String.format("%x", 255));
		//%o : o�� ������ 8������ ����ȭ �ϴ� ��ȣ
		System.out.println(String.format("%o", 12345));
		//%s : ���ڿ��� ����ȭ �ϴ� ��ȣ
		System.out.println(String.format("%s", "ȫ�浿"));
		//%c : ���ڸ� ����ȭ �ϴ� ��ȣ
		System.out.println(String.format("%c", 'A'));
		System.out.println(String.format("%s�� ������ %c�Դϴ�", "ȫ�浿",'A'));
	}

}
