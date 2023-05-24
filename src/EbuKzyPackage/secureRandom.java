package EbuKzyPackage;

import java.security.SecureRandom;

public class secureRandom {
    public static void main(String[] args) {
        SecureRandom input = new SecureRandom();
        for (int index = 0; index <= 20; index++) {
            int numberToInput = 1 + input.nextInt(6);
            System.out.printf("%d    " , numberToInput);
            if (index % 5 == 0)
                System.out.println();
        }
    }
}
