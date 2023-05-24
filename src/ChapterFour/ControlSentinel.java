package ChapterFour;

import java.util.Scanner;

public class ControlSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        System.out.print("Enter graden or -1 to quit ");
        int grade = input.nextInt();
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;
            System.out.print(" total of the  grades enter is" + gradeCounter);
            System.out.printf("class average is %.2f%n", average);
        } else {
            System.out.println("No grade were enter");


        }
    }
}
