package test_1007;

/*3.���� ����� �������� Student Ŭ���� �����ϱ�.
	�л��� �й��� �̸��� ������ ���� �л����� ����ϰ��� �մϴ�.
 * 
 * [���]

s1�� s2�� �ٸ� ��ü�Դϴ�.
s1 �л��� s2 �л��� ���� �л��Դϴ�.
�л�1:studno=1, name=ȫ�浿, major=�濵
�л�2:studno=1, name=ȫ�浿, major=�İ�
 * */
class Student{
	int no;
	String name;
	String major;
	

	Student(int no, String name, String major){
		this.no = no;
		this.name = name;
		this.major = major;
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student c = (Student) o;
			return no==c.no&&name.equals(c.name);
		} else
			return false;
	}
	public String toString() {
		return "studno="+no+", name="+name+", major="+major;
	}
	
}
public class test3 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿", "�濵");
		Student s2 = new Student(1, "ȫ�浿", "�İ�");
		if (s1 == s2) {
			System.out.println("s1�� s2�� ���� ��ü�Դϴ�.");
		} else {
			System.out.println("s1�� s2�� �ٸ� ��ü�Դϴ�.");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 �л��� s2 �л��� ���� �л��Դϴ�.");
		} else {
			System.out.println("s1 �л��� s2 �л��� �ٸ� �л��Դϴ�.");
		}
		System.out.println("�л�1:" + s1);
		System.out.println("�л�2:" + s2);
	}

}