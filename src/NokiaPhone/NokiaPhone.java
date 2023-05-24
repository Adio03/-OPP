package NokiaPhone;

import java.util.Scanner;

public class NokiaPhone {

    private static Scanner input = new Scanner(System.in);
    private static int userInput ;




    public static void menu() {

        System.out.println("""
                 Press 1 Phone Book
                 Press 2 Messages
                 Press 3 Chat
                 Press 4 Call Register
                 Press 5 Tones
                 Press 6 Setting
                 press 7 call divert
                 Press 8 Games
                 Press 9 Calculator
                 Press 10 Reminders
                 Press 11 Clocks
                 Press 12 Profile
                 Press 13 Sim Service
                 14. Exit
                      
                """);
        System.out.println("pick an option to continue");
        userInput =input.nextInt();

        switch(userInput){

            case 1 -> phoneBook();
//            case 2 -> messages();
//            case 3 -> chats();
            case 14 -> exit();


    }

}

    public static void phoneBook() {
        System.out.println("""
                1. Search
                2. Service Nos
                3. Add Name
                4. Erase
                5. Edit
                6. Assign Tones
                7. Send b' Card
                8. Options
                9. Speed Dials
                10. voice Tags
                11. Go back to main menu
                
                
                """);

        System.out.println("pick an option to continue");
        userInput = input.nextInt();

        switch (userInput){

            case 1 -> search();
            case 2 -> serviceNos();
            case 3 -> addName();
            case 4 -> erase();
            case 5 -> edit();
            case 6 -> assignTones();
            case 7 -> sendBCard();
            case 8 -> option();
            case 9 -> speedDials();
            case 10 -> voiceTags();
            case 11-> menu();
        }
    }



    private static void search() {
        System.out.println(""" 
                 1. search
                 2. Go back to phoneBook
                 3. Go back main menu
                 
           
                 """);
        System.out.println("pick an pick to proceed");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> search();
            case 2 -> phoneBook();
            case 3 -> menu();
        }

    }
    private static void serviceNos() {
        System.out.println("""
                1. service Nos
                2. Go back to phoneBook
                3. Go back main menu
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> serviceNos();
            case 2 -> phoneBook();
            case 3 -> menu();

        }
    }
    private static void addName() {
        System.out.println("""
                1. Add name
                2. Go back to phoneBook
                3. Go back main menu
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> addName();
            case 2 -> phoneBook();
            case 3 -> menu();
        }
    }
    private static void erase() {
        System.out.println("""
                1. Erase
                2. Go back to phoneBook
                3. Go back main menu
                
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> erase();
            case 2 -> phoneBook();
            case 3 -> menu();
        }
    }


    private static void edit() {
        System.out.println("""
                1. Edit
                2. Go back to phoneBook
                3. Go back main menu
                
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> edit();
            case 2 -> phoneBook();
            case 3 -> menu();
        }
    }

    private static void assignTones() {
        System.out.println("""
                1. Assign Tones
                2. Go back to phoneBook
                3. Go back main menu
                
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> assignTones();
            case 2 -> phoneBook();
            case 3 -> menu();
        }
    }
    private static void sendBCard() {
        System.out.println("""
                1.  Send b' card
                2. Go back to phoneBook
                3. Go back main menu
                 """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> sendBCard();
            case 2 -> phoneBook();
            case 3 -> menu();
        }

    }

        public static void option() {

        System.out.println("""
                1. Type Of View
                2. Memory
                3. Go back to phoneBook
                4. Go back main menu
                """);
        System.out.println("pick an option to proceed");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> typeOfView();
            case 2 -> memory();
            case 3 -> phoneBook();
            case 4 -> menu();
        }

    }
    public static void typeOfView() {

        System.out.println( "Type of view");
        System.out.println("""
                1. Go back to option
                2. Go back to phoneBook
                3. Go back menu
                """);

        System.out.println("pick an option to proceed");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> option();
            case 2 -> phoneBook();
            case 3 -> menu();
        }

    }
    private static void memory() {
        System.out.println("""
                1. Go back to option
                2. Go back to phoneBook
                3. Go back menu
                
                """);
        System.out.println("pick an option to proceed");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> option();
            case 2 -> phoneBook();
            case 3 -> menu();
            case 4 -> exit();
        }

    }
    private static void speedDials() {
        System.out.println("""
                1. Speed Dials
                2. Go back to phoneBook
                3. Go back menu
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> speedDials();
            case 2 -> phoneBook();
            case 3 -> menu();
            case 4 -> exit();
        }
    }
    private static void voiceTags() {
        System.out.println("""
                1. Voice tags
                2. Go back to phoneBook
                3. Go back menu
                """);
        System.out.println("pick an option");
        userInput = input.nextInt();
        switch (userInput){
            case 1 -> voiceTags();
            case 2 -> phoneBook();
            case 3 -> menu();
            case 4 -> exit();
        }
    }
    public static void exit(){
        System.out.println("Thank you for using our app");
        System.exit(2);
    }
}
