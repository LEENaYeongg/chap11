package test_1007;

/*1. ������ ����� �������� ���α׷��� �����ϱ�
[���]
fullPath:c:/jdk14/work/Test.java
path:c:/jdk14/work
fileName:Test.java
*
*/
public class test1 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk14/work/Test.java";
		String path = "";
		String fileName = "";
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + fullPath.substring(0,13));
		String[] arr2 = fullPath.split("/");
		fileName = arr2[3];
		System.out.println("fileName:" + fileName);
	}
}