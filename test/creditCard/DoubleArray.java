package creditCard;

import java.util.Arrays;

public class DoubleArray {


    private static int[] array;

    public static void  checkArray() {
        int[] newArrayContainer ={1,2,3};
         array = new int[newArrayContainer.length * 2];
        for (int index = 0; index < newArrayContainer.length; index++) {
            array [index]= newArrayContainer[index];
        }
    }

    public static int[] getCheckArray() {
        return array;
    }
}
