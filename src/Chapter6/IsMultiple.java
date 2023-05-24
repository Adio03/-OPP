package Chapter6;

public class IsMultiple {
    public static void main(String[] args) {

        System.out.println(isMultiple(12,4));
    }
    public static boolean isMultiple(int number1, int number2) {
        if (number1 % number2 == 0) return true;
        else return false;
    }
}