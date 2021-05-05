package test_1008;
/*1. format 메서드 구현하기
메서드명 : String format (String str,int len,int align)
기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
나머지 공간은 공백으로채운다.(0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)*/

import java.util.Scanner;

/* 내가 생각한 방법 
 * 1. 입력된 len 까지의 문자열을 지정
 * 2. align에 맞는 정렬
 * 3. replace를 사용하여 정렬된 자리에 공백이 있는경우 "0"로 바꿈.
 * 
 * */

public class Test1 {
	public static void main(String[] args) {
		String str = "가나다";
		Scanner sc = new Scanner(System.in);
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
	}

	private static String format(String str, int len, int align) {
	// str= "가나다", len=길이, align=정렬
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
