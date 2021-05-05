package test_1008;

/* ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
 �޼���� : fillZero
 ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ��� �����,���� �� ������ 0���� ä���.
 ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
 ���� �־��� length�� ���� 0�� ���ų� ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
 ��ȯŸ�� : String
 �Ű����� : String src, int length

[���]

0000012345

123

null
 * */
public class Test3 {

	private static String fillZero(String src, int length) {
		if (src == null || src.length() == length)
			return src;
		if (length <= 0)
			return "";
		if (src.length() > length)
			return src.substring(0, length);
		char[] str = new char[length];
		for (int i = 0; i < length; i++)
			str[i] = '0';
		for (int i = 0; i < src.length(); i++) {
			str[length - src.length() + i] = src.charAt(i);
		}
		return new String(str);
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
		System.out.println(fillZero(null, 3));
	}
}