package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner�� �̿��Ͽ� ������ ���� �б�
 */
public class ScannerEx2 {

   public static void main(String[] args)throws FileNotFoundException {
      Scanner scan = new Scanner(new File("score.txt"));
      int cnt=0, total =0;
      while(scan.hasNextLine()){ //���� �� �ִ� line ����?
    	  //nextLine : ���� �б�
         String line = scan.nextLine(); //ȫ�浿,4.5,3.8,4.2
         Scanner scan2 = new Scanner(line);  
         scan2 = scan2.useDelimiter(",");
         double sum =0;
         int i=0;
         String name = scan2.next();
         System.out.print(name + ":"); //ȫ�浿
         while(scan2.hasNextDouble()) {
            double score = scan2.nextDouble();
            sum += score;
            System.out.print(score + ",");
            i++; //��� ���ϱ� ����
         }
         System.out.printf("sum=%5.1f,avg=%5.2f\n", sum,sum/i);
         cnt ++;
      }
      System.out.println("ó�� �ο��� :"+cnt);
   }

}