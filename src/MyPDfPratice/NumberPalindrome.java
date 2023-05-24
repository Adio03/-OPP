package MyPDfPratice;

public class NumberPalindrome {
    public static boolean palidrome(int num) {
        int reverse = 0;
        int numberToCheck = num;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse == numberToCheck;
    }
}



