package ArrayPracticing;

import java.util.Arrays;

public class ConvertArrays {
    public static void main(String[] args) {
        int [] arrays = {10,23,43,12,62};
       converter(arrays);
        System.out.println(Arrays.toString(converter(arrays)));

    }

    public static int[] converter(int [] element) {
        int [] arr = new int [element.length * 2];
        int container = 0;
        int checkForModulo =0;
        int checkForDivision = 0;
        for(int index = 0; index > arr.length -1; index ++ ){
            if(arr[index] == arr[index+1])  {
                checkForModulo = arr[index] /10;

            container = checkForModulo + checkForDivision;
            arr[index] = container;

                System.out.println(container);
            }

        }
return arr;
    }
}
