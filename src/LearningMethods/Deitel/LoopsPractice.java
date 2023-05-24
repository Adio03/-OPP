package LearningMethods.Deitel;

import NokiaPhone.Static;

import java.util.Stack;

public class LoopsPractice {
    public static void main(String[] args) {
        printPattern();
        printTableStars();
    }
    public static void printPattern(){
        int outerLoop = 10;
        for (int counter  = 0; counter  <= outerLoop ; counter ++) {
            for (int counter2 = 0; counter2 < counter; counter2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int printTableStars(){
        int outerLoops = 5;
        int printStars =8;
        for (int counter = 0; counter < outerLoops; counter++) {
            for (int counter2 = 0; counter2 < printStars; counter2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }
    public static void printDownTriangle(){



    }
}
