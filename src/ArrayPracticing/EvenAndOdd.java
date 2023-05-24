package ArrayPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        int [] checkEven = evenNumber(10);
        System.out.println(Arrays.toString(checkEven));


    }
    public static int [] evenNumber(int number){
        int[] numberToCheck = new int [number];
        for (int index = 0; index <numberToCheck.length ; index++) {
            System.out.println("Enter a number" + index);
            numberToCheck[index] = userInput.nextInt();
            if (numberToCheck[index] % 2 == 0) {
                index++;
            }
             if (numberToCheck[index] != 2 ) {
                System.out.println("enter an even number");
                break;
            }
        }
        return numberToCheck;
    }


    }

