package Account;



import javax.swing.*;


public class Main {

    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        try {
            displayMainMenu();
        }catch (IndexOutOfBoundsException wrongInput){
            display(wrongInput.getMessage());
        }

    }
    private static void displayMainMenu() {
        display("""
                        <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>
                            Welcome to Semicolon Bank
                        <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>
                         
                        """ );
        String userInput = input("""
                          1 <> Bank Services
                          2 <> exit
                           """);
        switch (userInput.charAt(0)) {
            case '1' -> bankServices();
            case '2' -> exit();
        }
    }
    private static void bankServices() {
        String userInput = input("""
                1 <> Register Account
                2 <> Find Account
                3 <> Exit
                """);
        switch (userInput.charAt(0)){
            case '1' -> registerAccount();
            case '2' -> findAccountInBank();
            case '3' -> exit();}
    }
    private static void findAccountInBank() {
        try {
            String phoneNumber = input("enter your phone number");
           display( bank.findAccountNumberInAccount(phoneNumber));
        }catch (IllegalArgumentException wrongInput){
            display(wrongInput.getMessage());
            bankServices();
        }
        String userInput = input("""
                 1 <> Main Menu;
                 3 <> Exit
                 """);
        switch (userInput.charAt(0)){
            case '1'-> bankServices();
            case '2' -> exit();
        }
    }
    private static void exit() {
        display("Thanks for Banking With us");
    }
    private static void registerAccount() {
        try {
            String firstName = input("Enter firstname: ");
            String lastName = input("Enter lastName: ");
            String phoneNumber = input("Enter PhoneNumber");
            String pin = input("Enter your desire Pin");
            bank.createNewAccounts(firstName, lastName, phoneNumber, pin);
            display(" <<< Account create Successfully >>> ");
            display( "This is your account details: \n" + displayAccountCreated(firstName,lastName,phoneNumber));

        } catch (IllegalArgumentException wrongInput) {
            display(wrongInput.getMessage());
            bankServices();
        }

        String userInput = input("""
                1. go back to main menu
                2. Proceed to other services
                3. exit
                """);
        switch (userInput.charAt(0)) {
            case '1' -> bankServices();
            case '2' -> proceedToOtherServices();
            case '3' -> exit();
            default -> display("wrong input");
        }
    }

    private static void proceedToOtherServices() {
        String userInput = input("""
                1. Deposit
                2. withdraw
                3. Check Balance
                4. Main Menu
                5. Exit
                """);
        switch (userInput.charAt(0)) {
            case '1' -> deposit();
            case '2' -> withdraw();
            case '3' -> checkBalance();
            case '4' -> bankServices();
            case '5' -> exit();
        }
    }

    private static void checkBalance() {
        try {
            String accountNumber = input("enter your account number");
            String pin = input("enter your pin");
            double balance = bank.checkAccountBalanceInBank(accountNumber, pin);
            display("your Balance is: " + balance);
        } catch (IllegalArgumentException wrongInput) {
            display(wrongInput.getMessage());
            proceedToOtherServices();
        }
        String userInput = display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);

        proceedToOtherServices();
    }

    private static void withdraw() {
        try {
            String accountNumber = input("enter your account number");
            String pin = input("enter your pin");
            double amount = Double.parseDouble(input("enter amount"));
            bank.withdrawFromAccount(accountNumber, pin, amount);
            display("successfully withdraw");
        } catch (IllegalArgumentException wrongInput) {
            display(wrongInput.getMessage());
        }
        String userInput = display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);
        proceedToOtherServices();
    }

    private static void deposit() {
        try {
            String firstName =input("enter first name");
            String lastName = input("enter last name");
            String accountNumber = input("enter your account number");
            bank.validateDeposit(firstName,lastName);
            double amount = Double.parseDouble(input("enter the amount you want to deposit"));
            bank.depositToAccount(accountNumber, amount);
            display("successfully deposit");
        }catch (IllegalArgumentException wrongInput){
           display(wrongInput.getMessage());
        }
        String userInput = display("""
                1. Proceed to other services
                2. go back to main menu
                3. Exit
                 """);
        proceedToOtherServices();
    }
    private static  String displayAccountCreated(String firstName, String lastName, String phoneNumber){
        return display(" First name: " + firstName.toUpperCase()) +
        display("\nLast name: " + lastName.toUpperCase()) +
        display("\nAccount number: " + bank.generateAccountNumber(phoneNumber)) +
        display("\n Time Created: " + Clock.clockShow());
    }


    private static String input(String prompt) {
       return JOptionPane.showInputDialog(prompt);
    }

    private static String display(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
        return prompt;
    }

  

    }
