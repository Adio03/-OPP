package ArrayPracticing;

import java.util.Scanner;

public class methodToDivideInArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       int [] myInt = getArray(5);
        for (int index = 0; index < myInt.length; index++) {
        }
        System.out.println("average is " + geAverage(myInt));


    }

    public static int[] getArray(int number){
        int [] values = new int[number];
        for (int index = 0; index < values.length; index++) {
            values[index] = input.nextInt();
        }

      return values;
    }
    public static double geAverage(int [] array){
        int sum =0;
        for (int index = 0; index < array.length ; index++) {
            sum += array[index];

        }
        return  (double) sum / (double)array.length;
    }


}
