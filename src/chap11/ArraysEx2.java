package chap11;
/* java.lang.ClassCastException : ��ü�� ���� ������ �������� �ڷ����� ���� ���� ��� ���� �߻� ��, ����ȯ�� ���� ���� �� */

import java.util.Arrays;

class Value implements Comparable<Value>{
	int value;

	Value(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Value o) { //������ �ϰ��� �ϴ� ��ü�� ������ compareable(compareTo)
		return value - o.value;
		// return o.value - value  ==> ���� ���� �ٲ�
	}
}

public class ArraysEx2 {

	public static void main(String[] args) {
		Value[] arr = { new Value(100), new Value(10), new Value(50) };
		Arrays.sort(arr);
		String[] arr2 = {"a","b","A","Z","a"};
		Arrays.sort(arr2);
		for(String s : arr2) System.out.println(s);
		

	}
}
