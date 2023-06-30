package Account;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final Bank bank = new Bank();
    public static void main(String[] args) {
        displayMainMenu();

    }
    private static void displayMainMenu() {

        String userInput = input(display( """
                 ----------------------
                Welcome to Semicolon Bank
                    1 -> Register account
                    2 -> exit
                """));
        switch (userInput.charAt(0)){
            case '1' -> registerAccount();
            case '2' -> exit();
            default -> displayMainMenu();
        }
    }

    private static void exit() {
        display("Thanks for Banking With us");
    }
    private static void registerAccount(){
        try {
            String firstName = input("Enter firstname: ");
            String lastName = input("Enter lastName: ");
            String phoneNumber = input("Enter PhoneNumber");
            String pin = input("Enter your desire Pin");
            bank.createNewAccounts(firstName, lastName, phoneNumber, pin);
            display("Account create Successfully\n");
        }catch (IllegalArgumentException wrongInput){
            display(wrongInput.getMessage());
        }

        String userInput = input("""
                   1. go back to main menu
                   2. Proceed to other services
                   3. exit
                   """);
        switch (userInput.charAt(0)) {
            case '1' -> displayMainMenu();
            case '2' -> proceedToOtherServices();
            case '3' -> exit();
            default -> display("wrong input");}
    }
    private static void proceedToOtherServices() {
        String userInput = input("""
                1. Deposit
                2. withdraw
                3. Check Balance
                4. Exit
                """);
        switch (userInput.charAt(0)){
            case '1' -> deposit();
            case '2' -> withdraw();
            case '3' -> checkBalance();
            case '4' -> exit();
        }
    }

    private static void checkBalance() {
        try {
            String accountNumber = input("enter your account number");
            String pin = input("enter your pin");
            double balance = bank.checkAccountBalanceInBank(accountNumber, pin);
            display("your Balance is: " + balance);
        } catch (IllegalArgumentException wrongInput){
            display(wrongInput.getMessage());
            proceedToOtherServices();
        }
        String userInput =display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);

        switch (userInput.charAt(0)){
            case '1' -> proceedToOtherServices();
            case '2' -> displayMainMenu();
            case '3' -> exit();
        }


    }

    private static void withdraw() {
        try {
            String accountNumber = input("enter your account number");
            String pin = input("enter your pin");
            double amount = Double.parseDouble(input("enter amount"));
            bank.withdrawFromAccount(accountNumber, pin, amount);
            display("successfully withdraw");
        }catch (IllegalArgumentException wrongInput){
            display(wrongInput.getMessage());
        }
        String userInput =display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);
    }

    private static void deposit() {
        String accountNumber = input("enter your account number");
        double amount = Double.parseDouble(input("enter the amount you want to deposit"));
        bank.depositToAccount(accountNumber,amount);
        display("successfully deposit");
        String userInput =display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);
        proceedToOtherServices();


    }


    private static String input(String prompt) {
       return JOptionPane.showInputDialog(prompt);
    }
    private static String display(String prompt){
         JOptionPane.showMessageDialog(null,prompt);
        return prompt;
    }
}