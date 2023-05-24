package ArrayPracticing;

import java.util.Arrays;



public class ClassArrayOne {
    public static void main(String[] args) {
        int [][] arrays = new int[5][5];
        arrays[0] = new int[5];
        arrays[1] = new int[3];
        arrays[2] = new int[10];
        arrays[3] = new int[]{400,500};
        arrays[4] = new int [10];

        int [] newArrays = arrays[0];

        for (int index = 0; index< newArrays.length; index++) {
            newArrays[index] = index;
        }
        int [] newArrayTwo = arrays[1];
        for (int index = 0; index < newArrayTwo.length; index++) {
            newArrayTwo[index] = index;
        }
        int [] addToIndexTwo = arrays[2];
        for (int index = 0; index <addToIndexTwo.length ; index++) {
            addToIndexTwo[index] = index;
        }
        int[] addIndexThree = arrays [3];
        for (int index = 0; index <addIndexThree.length ; index++) {
            addIndexThree[index] *= index;
        }
        int [] addIndexFour = arrays [4];
        int valueToAdd = 100;
        for (int index = 0; index < addIndexFour.length; index++) {
            addIndexFour[index] = index * valueToAdd;

        }
        System.out.println(Arrays.deepToString(arrays));
    }
}
