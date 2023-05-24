package MyPDfPratice;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int mark= input.nextInt();
         String result = mark > 80 ? "a" : mark <= 50 && mark > 10 ?"b" : "c" ;
        System.out.println(result);



    }

}
