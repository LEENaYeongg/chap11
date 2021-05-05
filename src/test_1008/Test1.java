package test_1008;
/*1. format �޼��� �����ϱ�
�޼���� : String format (String str,int len,int align)
��� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ.
������ ������ ��������ä���.(0 : ���� ����, 1: ��� ����, 2:������ ����)*/

import java.util.Scanner;

/* ���� ������ ��� 
 * 1. �Էµ� len ������ ���ڿ��� ����
 * 2. align�� �´� ����
 * 3. replace�� ����Ͽ� ���ĵ� �ڸ��� ������ �ִ°�� "0"�� �ٲ�.
 * 
 * */

public class Test1 {
	public static void main(String[] args) {
		String str = "������";
		Scanner sc = new Scanner(System.in);
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
	// str= "������", len=����, align=����
		String re = "";
    	
    	if(align==0) {
    		re=str;
    	}
    	else if(align==1) {
    		for(int i=0;i<len/2;i++	) {
    			re+=" ";
    		}
    		re+=str;
    	}
    	else if(align==2) {
    		for(int i=0;i<len;i++) {
    			re+=" ";
    		}
    		re+=str;
    	}
    	return re;
	}
}
