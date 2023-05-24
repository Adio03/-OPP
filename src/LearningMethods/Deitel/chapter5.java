package LearningMethods.Deitel;

import java.util.Scanner;

public class chapter5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;
        while (gradeCounter <= 10){
            System.out.println("Enter grades :: ");
            int  grade = input.nextInt();
            total = total + grade;
            gradeCounter += 1;
            int average = total / 10;
            System.out.print("The total grade is :: " + total);
            System.out.print("The average is :: " + average);


        }
    }
}
