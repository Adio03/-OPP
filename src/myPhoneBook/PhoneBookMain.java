package myPhoneBook;

import javax.swing.*;
import java.util.Scanner;

public class PhoneBookMain {
    private static  Scanner input = new Scanner(System.in);
   private static final PhoneBook phoneBook = new PhoneBook();
   public static void main(String[] args) {
        displayMainMenu();
}

    private static void displayMainMenu() {
        String mainMenu = ("""
                ---------------------------
                Welcome to My Phonebook
               1.Create New Contact
               2.view saved Contacts
               3.Delete contact
               4.exit
               
               ------------------------------
                """);
        String userInput =input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createNewContact();
            case '2' -> savedContacts();
            case '3' -> deleteContact();
            case '4' -> exit();
            default -> displayMainMenu();
        }
   }

    private static void deleteContact() {
        display("contact successfully Delete");
        String userInput = input("""
                   1. go back to main menu
                   2. exit
                   """);
        switch (userInput.charAt(0)) {
            case '1' -> displayMainMenu();
            case '2' -> exit();
            default -> display("wrong input");
        }

    }

    private static void savedContacts() {
       try {
           String search = input("search...............");

           String userInput = input("""
                0. for previous menu
                1. exit
                """);

            switch (userInput.charAt(0)){
                case '1' -> displayMainMenu();
                case '2' -> exit();
                default -> System.out.println("wrong input");}
       }
       catch (IllegalArgumentException name){
           System.out.println("the contact does not exist");
           displayMainMenu();
       }
        }


    private static void createNewContact() {
       try {
           String firstName = input("enter firstName");
           String lastName = input("enter secondName");
           String phoneNumber = input("enter PhoneNumber");
           phoneBook.createContact(firstName, lastName, phoneNumber);
           display("contact successfully created");
           String userInput = input("""
                   1. go back to main menu
                   2. exit
                   """);
           switch (userInput.charAt(0)) {
               case '1' -> displayMainMenu();
               case '2' -> exit();
               default -> display("wrong input");
           }
       }
       catch (IllegalArgumentException num){
           display( "enter a proper input");

       }


   }

    private static void exit() {
        display("Thanks for using phonebook");
       System.exit(99);

    }

    private static String input(String prompt) {
       return JOptionPane.showInputDialog(prompt);
   }
   private static void display(String display){
    JOptionPane.showMessageDialog(null,display);

    }
            }