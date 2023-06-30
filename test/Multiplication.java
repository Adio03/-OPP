public class Multiplication {

    public int multiplyTwoNumber(int number1, int number2) {
        int counter = 0;
        for (int i = number2; i <= number1; i+=number2) {
            counter = number1;
            counter += number2;
            number2++;
        }
        return counter;
    }
}



