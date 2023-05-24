package Snacks;

import java.io.OptionalDataException;
import java.util.Arrays;

public class ReverseList {
//    public static void main(String[] args) {
//        int[] arry = {321,4,5,1,10,1};
//        System.out.print(Arrays.toString(reverseArrayValues(arry)));
//    }

    public int[] reverseArrayValues(int[] arr) {
        for (int index = 0; index < arr.length -1; index++) {
           if( arr[index] > arr[index+1]) {
               int temp = arr[index];
                arr[index] = arr[index +1];
               arr[index+1] = temp;
               index=-1;
           }

            System.out.println();
        }
        return arr;
    }

}
