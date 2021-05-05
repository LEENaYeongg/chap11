package chap11;
/* Random Ŭ���� : ���� �߻� Ŭ����. 
 * 1. �ڷẰ�� ���� �߻�
 * 		nextInt() :  ������ ����
 * 		nextInt(n) :  0<= x < n ������ ���� ����
 * 		nextDouble() : 0<=x <1.0 �Ǽ��� ���� ����
 * 		nextBoolean() : true/false �� �ϳ�
 * 
 * 2. seed �� ���� ����.
 * 		*/

import java.util.Random;

public class RandomEx1 {
	public static void main(String[] args) {
	Random rand = new Random();
	rand.setSeed(1); //�������� �پ��ϰ� �����ϵ��� ���� seed���� ������ ���� �ʾƵ� ��.
	Random rand2 = new Random();
	//System.currentTimeMillis() : 1970�� ���ۺ��� ��������� �ð��� msec���� ����.
	rand2.setSeed(System.currentTimeMillis());
	System.out.println("rand==>");
	for(int i =0; i<5; i++)
		System.out.println(i + ":"+rand.nextInt(100));
	System.out.println();
	System.out.println("rand2==>");
	for(int i=0; i<5; i++)
		System.out.println(i + ":"+rand2.nextInt(100));

	}

}
