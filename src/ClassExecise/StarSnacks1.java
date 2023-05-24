package ClassExecise;

import java.util.Scanner;

public class StarSnacks1 {

    public static void main(String[] args) {

        star(5);
    }
        public static void star(int number){

           for (int row = 0; row < number; row++) {

            for (int column = row; column <= number; column++) {

                System.out.print(" ");
            }
            for (int column2 = 1; column2 <= row; column2++) {

                System.out.print("* ");
            }
            for (int column3 = 1; column3 <=number ; column3++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int row = 1; row <=number ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= number; column++) {
                System.out.print("3 ");
            }
            for (int column = row; column <= number ; column++) {
                System.out.print("4 ");

            }
            System.out.println();

        }



    }
}













