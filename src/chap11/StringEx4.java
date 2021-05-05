package chap11;
/* ���� <= ���ڿ� */
public class StringEx4 {
	public static void main(String[] args) {
		// Integer.parseInt : ������ <= ���ڿ�
		int i = Integer.parseInt("100");
		System.out.println(i + 1);
		// Long.parseLong�� ������ �� �Ⱦ�.
		// Double.parseDouble : �Ǽ��� <= ���ڿ�
		// Float.parseFloat : �Ǽ��� <= ���ڿ�
		double d = Double.parseDouble("100.5");
//		double ++d = Double.parseDouble("100.5"); ==> ���������� ++ �� ���� ����� �� ����. �������ٰ� ����ؾ���.
		System.out.println(d + 0.1); //100.6
		System.out.println(++d);
		//2���� ���ڿ� <= ������
		String binary = Integer.toBinaryString(i); // 2������ ���ڿ�
		System.out.println(binary);
		String octal = Integer.toOctalString(i); // 8������ ���ڿ�
		System.out.println(octal);
		String hex = Integer.toHexString(i); //16������ ���ڿ��� ����
		System.out.println(hex);
	}

}
