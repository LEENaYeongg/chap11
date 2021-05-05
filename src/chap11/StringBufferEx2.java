package chap11;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4); //2������ 4�� �ձ��� ����, �� 4���� ���Ե��� X
		System.out.println(sb);
		sb.deleteCharAt(4); //4��° ���� �ϳ��� ����, but 0���� ���� �� 0,1,2,3,4 �ϸ� 4��°�� 2
		System.out.println(sb);
		sb.insert(5, "==");  //5��°�� == �߰�, but 0���� ���� �� 0,1,2,3,4 �ϸ� 5��°�� f
		System.out.println(sb);
		sb.insert(6, 1.23);
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb); //�Ųٷ� ���
		sb.reverse();
		System.out.println(sb);
	}

}
