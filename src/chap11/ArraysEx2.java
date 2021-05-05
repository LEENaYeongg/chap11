package chap11;
/* java.lang.ClassCastException : 객체와 내가 참조할 참조형의 자료형이 맞지 않을 경우 오류 발생 즉, 형변환이 맞지 않을 때 */

import java.util.Arrays;

class Value implements Comparable<Value>{
	int value;

	Value(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(Value o) { //정렬을 하고자 하는 객체는 무조건 compareable(compareTo)
		return value - o.value;
		// return o.value - value  ==> 정렬 순서 바꿈
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
