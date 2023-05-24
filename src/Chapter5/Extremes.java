package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber=0;
        int max = 0;
        int sum = 0;


        for (int index = 0; index < 10; index++) {
            System.out.println(index);
            System.out.println("Enter the Numbers");
            int numberCollected = input.nextInt();
            if (numberCollected > index){
                System.out.println(index);
               max = numberCollected;
            } else if (numberCollected < index) {
                System.out.println(index);
                 minNumber = numberCollected;
            }
            sum += index;

        }

        System.out.println( "The Maximum value: " + max);
        System.out.println(" The Minimum value: " + minNumber);

    }
}

