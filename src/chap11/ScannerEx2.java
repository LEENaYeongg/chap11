package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner를 이용하여 파일의 정보 읽기
 */
public class ScannerEx2 {

   public static void main(String[] args)throws FileNotFoundException {
      Scanner scan = new Scanner(new File("score.txt"));
      int cnt=0, total =0;
      while(scan.hasNextLine()){ //읽을 수 있는 line 존재?
    	  //nextLine : 한줄 읽기
         String line = scan.nextLine(); //홍길동,4.5,3.8,4.2
         Scanner scan2 = new Scanner(line);  
         scan2 = scan2.useDelimiter(",");
         double sum =0;
         int i=0;
         String name = scan2.next();
         System.out.print(name + ":"); //홍길동
         while(scan2.hasNextDouble()) {
            double score = scan2.nextDouble();
            sum += score;
            System.out.print(score + ",");
            i++; //평균 구하기 위해
         }
         System.out.printf("sum=%5.1f,avg=%5.2f\n", sum,sum/i);
         cnt ++;
      }
      System.out.println("처리 인원수 :"+cnt);
   }

}