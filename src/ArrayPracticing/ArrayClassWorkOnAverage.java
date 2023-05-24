package ArrayPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassWorkOnAverage {
    private static Scanner userInput = new Scanner(System.in);

//    public static void main(String[] args) {
//        int [] arrayNumber = getUserInput(5);
//        System.out.println(Arrays.toString(arrayNumber));
//        System.out.println("The Average is : " + getAverage(arrayNumber));
//    }
    public static int [] getUserInput(int values){

        int [] number =new int[values];
        System.out.println("enter numbers");
        for (int index = 0; index < number.length ; index++) {
            number[index] = userInput.nextInt();
        }
        return number;
    }
    public double  getAverage(int ... array) {
        int [] newArray = new int[array.length];
        int sum = 0;
        for (int index = 0; index < array.length ; index++) {
            newArray[index] = array[index];
            sum += array[index];
        }
        return (double) sum / (double) array.length;
    }

}
