package myVideoPractice;

public class WhileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (number <= 10){
            sum += number;
            number++;

        }
        System.out.printf("the sum is %d%n" , sum);
    }
}
