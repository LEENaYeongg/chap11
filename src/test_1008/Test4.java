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
		return o.getTotal() - getTotal(); // ���� ��� ����
	}

	public int getTotal() {
		return kor + eng + math;
	}

	public String toString() {
		return "�̸�: " + name + ", ����: " + kor + ", ���� = " + eng + ", ���� = " + math + ", ����=" + getTotal();
	}
}

public class Test4 {

	public static void main(String[] args) {
		Student[] arr = {
				new Student("ȫ�浿", 70, 60, 70),
				new Student("�̸���", 55, 65, 90),
				new Student("���", 95, 65, 80),
				new Student("������", 95, 95, 80)
		};
		Arrays.sort(arr);
		for (Student s : arr)
			System.out.println(s);
	}
}
