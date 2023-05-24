package chaptertwo;



public class LargestAndSmallNumber {
    public int[] getMaxAndMin(int[] arrayValues) {
        int[] result = new int[2];
        int minValue = getMinValue(arrayValues);
        int maxValue = getMaxValue(arrayValues);


        result[0] = minValue;
        result[1] =maxValue;
        return result;
    }

    public int getMinValue(int[] newArrays) {
        int minValue = newArrays[0];
        for (int index = 0; index < newArrays.length; index++) {
            if (newArrays[index] < minValue)minValue = newArrays[index];
        }
        return minValue;
    }

    public int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > maxValue) maxValue =arr[index];
        }
        return maxValue;
    }


}