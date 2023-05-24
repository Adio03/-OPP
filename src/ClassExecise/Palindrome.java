package ClassExecise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String str ="";
        String another = "y";
        int left=0;
        int right =0;
        Scanner scan = new Scanner(System.in);
        while (another.equalsIgnoreCase("y")) { // allows y or Y
            System.out.println("Enter a potential palindrome:");
            str = scan.nextLine();
            left = 0;
            right = str.length() - 1;
            while (str.charAt(left) == str.charAt(right) && left < right) {
                left++;
                right--;
            }
            if (left < right)
                System.out.println("That string is NOT a palindrome.");
            else
                System.out.println("That string IS a palindrome.");
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }

    }
}