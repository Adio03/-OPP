package ArrayPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) throws insertionOfArray {
        int [] checkEven = evenNumber(10);
        System.out.println(Arrays.toString(checkEven));


    }
    public static int [] evenNumber(int number) throws insertionOfArray {
        int[] numberToCheck = new int[number];
        System.out.println("Enter a number : \r" );
        for (int index = 0; index < numberToCheck.length; index++) {
            numberToCheck[index] = userInput.nextInt();
            if (numberToCheck[index] % 2 == 0)
                index++;
            if (numberToCheck[index] != 2)
                System.out.println("enter an even number : \r");
        }


        return numberToCheck;
    }
}

