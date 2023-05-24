package Chapter6;

public class IsDivision {
    public static void main(String[] args) {
        int numbers = 10000;
        System.out.println(isDivision(numbers,3));
    }
    public static boolean isDivision(int number, int num) {
        for (int index = 0; index < number; index++) {
            if (number % num == 0) {
                return true;
            }

        }
        return false;
    }
}