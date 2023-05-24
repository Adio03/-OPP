package ClassExecise;

import java.util.Arrays;

public class PrintStarTable {
    public static void main(String[] args) {
        int starStart = 0;
        int countSpace1 =4;
        int countStar1 =5;
        int countStar2 =5;
        int countSpace2 = 4;
       int countStar3 =1 ;
        for (int rowCounter = 0; rowCounter <= 5; rowCounter++) {
            for (int rowCounter1 = 1; rowCounter1 >= starStart ; rowCounter1++) {
                System.out.println("*");
            }
            for (int rowcounter2 = 0; rowcounter2 < countSpace1; rowcounter2++) {
                System.out.print(" ");
            }
            for (int rowcounter3 = 0; rowcounter3 < countStar1; rowcounter3++) {
                System.out.print("*");

                for (int rowCounter4 = 0; rowCounter4 < countStar2; rowCounter4++) {
                    System.out.print("*");
                }
                for (int rowCounter5 = 0; rowCounter5 < countSpace2; rowCounter5++) {
                    System.out.print(" ");
                }
                for (int rowCounter6 = 0;rowCounter6 < countStar3 ; rowCounter6++) {
                    System.out.print("*");
                }
            }
            starStart --;
            countSpace1 ++;
            countStar1 --;
            countStar2 ++;
            countSpace2 --;
            countStar3 ++;

            System.out.println();



            }
    }
    }


