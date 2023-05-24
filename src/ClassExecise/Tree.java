package ClassExecise;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner classicAs = new Scanner(System.in);
        System.out.println();

        int englishLanguage = 1;
        int yorubaLanguage = 2;
        int igboLanguage = 3;
        int hausaLanguage = 4;

        int selectLanguage = 0;

        switch (selectLanguage) {
            case 1 -> System.out.println("English");
            case 2 -> System.out.println("Yoruba");
            case 3 -> System.out.println("Igbo");
            case 4 -> System.out.println("Hausa");
            default -> System.out.println("Thank you");
        }



    }
}


