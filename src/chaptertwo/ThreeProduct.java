package chaptertwo;

import java.util.Scanner;

public class ThreeProduct {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer :  ");
        int x = input.nextInt();
        System.out.print("Enter second integer : ");
        int y = input.nextInt();
        System.out.print("Enter third integer : ");
        int z =  input.nextInt();
        int total = x * y * z;
        System.out.printf("Product is %d%n", total);


    }
}
