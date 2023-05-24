package ArrayPracticing;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int[] newArray = getIntegers(10);
        System.out.println(Arrays.toString(newArray));
//        System.out.println(Arrays.toString(printArray(printArray));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the values: " + number + "integer.\r");
        int[] value = new int[number];
        for (int index = 0; index < value.length; index++) {
            value[index] = userInput.nextInt();
        }
        return value;

    }

    public static void printArray(int[] printArray) {
        for (int index = 0; index < printArray.length; index++) {
            System.out.println(" element" + index + " content" + printArray[index]);
        }
    }

    public static int[] sortInteger(int[] array) {
        int[] sortArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            sortArray[index] = array[index];

        }
        return sortArray;
    }

}


