package chaptertwo;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter a number: ");
        int number2 = input.nextInt();
        int square1 = (int) Math.pow(number1 ,2);
        int square2 = (int) Math.pow(number2, 2);
        int difference = square2 - square1;
        int differnce2 = square1 - square2;
        if (square2 > square1) {
            System.out.printf("Difference is %d%n", difference);
        }
        else System.out.printf("Difference is %d%n", differnce2);
        }
}
