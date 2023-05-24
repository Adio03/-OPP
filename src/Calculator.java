public class Calculator {

    public int add( int number1, int number2) {

        return number1+number2;

    }

    public int subtract( int number1 ,int number2) {
        int sub = number1 - number2;
        if(number1 < number2) {
            sub = number2 - number1;}

        return sub;
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public double divide(double num1,double num2) {
        if(num1 > num2) return num1 / num2;
        else return num2 / num1;

    }
}
