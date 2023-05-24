package MyPDfPratice;

import java.util.Scanner;

public class SwicthTest {
    public static void main(String[] args) {
        int count = 0;
        for (int index = 0; index < 50 ; index++) {
            if(isprime(index)){
                count ++;
                System.out.println("number"  + index +  " is a prime");
                if(count == 50){
                    System.out.println("out of the loop");
                    break;
                }
            }

        }

    }
    public static boolean isprime(int number){

        for(int index = 2; index <= number/2 ; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        if (number == 1){
            return false;
        }

        return true;
    }

}
