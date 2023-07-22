package ArrayPracticing;

import java.util.Arrays;

public class SortArrayFromHighestToLowest {
    public int[] sortedArray(int[] arr) {

        boolean turnConditionToTrueIfIfBecomeFalse = true;
        int container = 0;
        while (turnConditionToTrueIfIfBecomeFalse) {
            turnConditionToTrueIfIfBecomeFalse= false;
            for (int index = 0; index < arr.length - 1; index++) {
                if (arr[index] < arr[index + 1]) {
                    container = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = container;
                    turnConditionToTrueIfIfBecomeFalse= true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}