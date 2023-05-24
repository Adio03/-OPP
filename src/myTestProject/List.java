package myTestProject;

import java.util.Arrays;
import java.util.Scanner;

//
//
public class List {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
///*
//      int [] list = new int[5];
//        System.out.println(list);
//        int [] number,age;
//        number = new int[4];
//        age = new  int[3];
////        int numbers [] , ages;
////        numbers = new int[4];
////        ages =new int [3];
////        int [] figures = {1,2,3,4,5};
//        System.out.println(figures);
//*/
//        String[] names = new String[]{
//                "esther", " kulitech", " vicky", "Retna", "oye", "Joy", "Sultan", "Bright"
//        };
//        System.out.println(names[7]);
//        System.out.println(names[names.length - 5]);
//        System.out.println(names[names.length / 2]);
        int[] count = new int[5];
        count[0] = 3;
        count[1] = 4;
        count[2] = 5;
        count[3] = 6;
        count[4] = 8;
        try {
            int[] arr = {1, 5, 7, 8, 3, 6};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(count));
//        int[] arraysNumber = new int[5];
//        int  sumArray = 0;
//        for (int index = 0; index <arraysNumber.length ; index++) {
//            System.out.println("enter number");
//            arraysNumber[index] = input.nextInt();
//            sumArray   += arraysNumber[index];
//        }
//        System.out.println(Arrays.toString(arraysNumber));
//        System.out.println(sumArray);




    }
}

