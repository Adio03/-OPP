package chaptertwo;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = input.nextInt();
        int square = (int) Math.pow(number, 2);
        int integer = 100;
        if (square > integer) {
            System.out.println(" is greater than  ");
        }
        if (square == integer) {
            System.out.println("is equal to 100  ");
        }
        if (square != integer) {
            System.out.println("is not equal to 100  ");
        }
        if (square < integer) {
            System.out.println("is less than 100 :  ");
        }

    }
}
