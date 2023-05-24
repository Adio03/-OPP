package MyPDfPratice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a string");
        String input = userInput.nextLine();
       int low = 0;
        int high = input.length()-1;
        boolean isPalindrome = true;
        while(low < high ){
            if (input.charAt(low) != input.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) System.out.println(input + "  is a palindrome");
        else System.out.println(input + "  is not a palindrome");

    }
}
