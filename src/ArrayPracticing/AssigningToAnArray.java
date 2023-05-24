package ArrayPracticing;

import java.util.Arrays;

public class AssigningToAnArray {
    public static void main(String[] args) {
        int [] arrayInt = new int[10];
                arrayInt [0] = 20;
//         int [] myDoubleArray ={25,4,3,4,5,9} ;
        System.out.println(Arrays.toString(arrayInt));
//        System.out.println(Arrays.toString(myDoubleArray));
        int [] loopedArray = new int[5];
        for (int index = 0; index < loopedArray.length; index++) {
            loopedArray[index] = index + 100;
        }
        System.out.println(Arrays.toString(loopedArray));
    }
}
