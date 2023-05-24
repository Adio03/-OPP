package ClassExecise;

import java.util.Scanner;

public class PositiveInteger {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int newNumber;
        int countZero = 0;
        System.out.print("Enter a number: ");
        int number = userInput.nextInt();
        int i= 0;
        int counter = 0;
       // newNumber = number;
        for(newNumber = number; newNumber > 0; newNumber--){
            if (number%newNumber == 0) countZero++;
        }
        if (countZero == 2) System.out.println(number + " is a prime number");
        else System.out.println(number + " is not a prime number");






        }
    }

