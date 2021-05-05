package test_1008;

import java.util.Arrays;

class Student implements Comparable<Student> {
	String name;
	int kor, eng, math;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public int compareTo(Student o) {
		return o.getTotal() - getTotal(); // Á¤·Ä ¹æ½Ä ÁöÁ¤
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public String toString() {
		return "ÀÌ¸§: " + name + ", ±¹¾î: " + kor + ", ¿µ¾î = " + eng + ", ¼öÇÐ = " + math + ", ÃÑÁ¡=" + getTotal();
	}
}

public class Test4 {

	public static void main(String[] args) {
		Student[] arr = {
				new Student("È«±æµ¿", 70, 60, 70),
				new Student("ÀÌ¸ù·æ", 55, 65, 90),
				new Student("±è»ñ°«", 95, 65, 80),
				new Student("¼ºÃáÇâ", 95, 95, 80)
		};
		Arrays.sort(arr);
		for (Student s : arr)
			System.out.println(s);
	}
}
