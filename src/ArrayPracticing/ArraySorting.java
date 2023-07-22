package ArrayPracticing;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int [] sorted = {20,1,50,46,97,23,56};
        System.out.println(Arrays.toString(sortArray(sorted)));
    }
    public static int[] sortArray(int[] array){
        int temporaryHolder =0;
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] > array[index+1]){
                temporaryHolder= array[index];
                array[index] = array[index+1];
                array[index+1] = temporaryHolder;

            }
        }
        return array;

    }


}
