package ArrayPracticing;

import java.util.Arrays;

public class ClassArray {
    public static void main(String[] args) {
        int [][] arrays = new int[5][5];
        arrays[0] = new int[5];
        arrays[1] = new int[3];
        arrays[2] = new int[10];
        arrays[3] = new int[]{400,500};
        arrays[4] = new int [5];

   int [] newArrays = arrays[0];

        for (int index = 0; index< newArrays.length; index++) {
            newArrays[index] = index;
        }
        System.out.println(Arrays.deepToString(arrays));
    }
//    public static int[] populateSecondIndexInArray(int [] populateSecond){
//
//    }



}
