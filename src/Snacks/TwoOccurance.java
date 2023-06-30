package Snacks;

public class TwoOccurance {


    public int checkArray(int [] array) {
        int container = 0;
        for (int index = 0; index < array.length-1; index++) {
            if ( array[index] == array[index]) {
//                container = array[index];
                container++;
            }
        }
        System.out.println(container);
        return container;
    }
}

