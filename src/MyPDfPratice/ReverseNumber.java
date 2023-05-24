package MyPDfPratice;

public class ReverseNumber {
    public static void main(String[] args) {

        System.out.println("The reverse number is "+reverseDigits(92837465));

    }

    public static int reverseDigits(int number){
    int lastDigit = 0;
    String reverse ="";

     do {
        lastDigit = number % 10;
        reverse += lastDigit;
        number = number / 10;
    } while (number > 0);

        return Integer.parseInt(reverse);
}
}

