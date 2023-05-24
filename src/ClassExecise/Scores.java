package ClassExecise;

import java.util.Scanner;

public class Scores {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      double scores;
      double total = 0;
      double average= 0;

      for( int count= 1; count <= 5; count ++ ){
          System.out.println("enter number : " );
                   scores = input.nextInt();
                      total += scores;
                      average= scores/ total;


  }
      System.out.println("Total :" + average);

 }
 }

