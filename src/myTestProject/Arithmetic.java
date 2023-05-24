package myTestProject;

import java.util.Scanner;

public class Arithmetic {
    private static int maxNum;

    public Arithmetic(int maxNum){

    }

    public static int getMaxNum(int num1,int num2,int num3) {
        return Math.max( num1,Math.max(num2,num3));


    }

    public static void main(String... args) {
        int result = getMaxNum(5,2,3);
        int result2 = getMin(2,4,1);
        System.out.println(result);
        System.out.println(result2);


    }
    public static int getMin(int num1,int num2,int num3){
        return Math.min(( num1),Math.min(num2,num3));


    }


}


