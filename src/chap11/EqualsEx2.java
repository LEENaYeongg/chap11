package chap11;
//equals �޼���� ��κ� �������̵��� �ؼ� ���.
class Equal2{
   int value;
   Equal2(int value){
      this.value = value;
   }
   @Override
   public boolean equals(Object o) {
      if(o instanceof Equal2) {
         Equal2 e = (Equal2)o;
         return value == e.value;
      }else return false;
   }
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) System.out.println("e1�� e2�� ���� ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ��ü��"); 
		if(e1.equals(e2))
			System.out.println("e1�� e2�� ���� ������ ��ü��");
		else System.out.println("e1�� e2�� �ٸ� ������ ��ü��");
	}
}