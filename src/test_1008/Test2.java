package test_1008;
/*
2.int getRand(f,t) : �Լ� �����ϱ�
f ~ t �Ǵ� t~ f ���� ������ ���ڸ� ������ ���� �����ϴ� �Լ�
f, t ���� ���Ե�. 
1 ~ 10 ���� (int)(Math.random() * (10-1 +1)) + 1*/

public class Test2 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-1, 3) + ",");

		}
	}

	private static int getRand(int f, int t) {
		return (int)(Math.random()*((Math.abs(t-f))+1)) + Math.min(f, t);
		
	}
}
