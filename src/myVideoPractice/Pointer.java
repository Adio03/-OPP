package myVideoPractice;

import java.util.Arrays;

public class Pointer {
    public static void main(String[] args) {
        int [] newArray = {1,2,3,3,4,5,5};
        duplicate(newArray);
        System.out.println(Arrays.toString(duplicate(newArray)));
    }
    public static int[] duplicate(int[] num ) {
        int index =0;
        for (int index2 = 0; index2 < num.length-1; index++) {
                if(num[index] != num[index2]){
                    num[index] = num[index2];
                }
            index++;
        }
        return num;


        }
    }
