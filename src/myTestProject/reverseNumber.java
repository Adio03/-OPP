package myTestProject;

public class reverseNumber {
    public static void main(String[] args) {

        System.out.println(reverseDigit(123456));
    }
    public static int reverseDigit(int number) {
        int digit = 0;
        int reverse = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;


        }
        return reverse;
    }
}
