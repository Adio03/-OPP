package Snacks;

import java.util.Arrays;

public class TwoOccurance {


    public boolean checkArray(int [] array, int number) {
        for (int index = 0; index < array.length; index++) {
            if(array[index] == number){
                return true;
            }

        }


        return false;
    }
}

