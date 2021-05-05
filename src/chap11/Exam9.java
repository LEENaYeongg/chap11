package chap11;

import java.util.Random;

/* true/false 값을 난수로 발생하여 시스템과 사용자가 3번 연속으로 true가 나오면 한쪽이 승리하도록 프로그램 구현하기 */
/* 내 생각: while문으로 무한으로 출력하고 3번이 동일해지면 stop 하고 승리 출력 */

public class Exam9 {
	public static void main(String[] args) {
		Random srand = new Random();
		srand.setSeed(System.currentTimeMillis());
		Random urand = new Random();
		urand.setSeed(System.currentTimeMillis());
		int syscnt=0, usercnt=0;
		while (true) {
			if(srand.nextBoolean()) {
				syscnt++;
				System.out.print("시스템 true");
			}else {
				syscnt=0;
				System.out.print("시스템 false");
			}
			if(urand.nextBoolean()==true) {
				usercnt++;
				System.out.println("\t사용자 true");
			}else {
				usercnt =0;
				System.out.println("\t사용자 false");
			}
			if(syscnt ==3 || usercnt ==3) break;
		}
		if(syscnt ==3 &&usercnt==3)
			System.out.println("비김");
		else if (syscnt ==3)
			System.out.println("시스템 승리");
		else System.out.println("사용자 승리");
	}
}
