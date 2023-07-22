package Chapter6;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int check = randomNumber.nextInt(5);
        System.out.println(check);
    }
}
