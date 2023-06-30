 package Account;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

 public class Bank {
    private final List<Account> accounts = new ArrayList<>();

     public void getTimeEachAccountWasCreated() {
     }

     private final LocalDateTime timeEachAccountWasCreated = LocalDateTime.now();


    public void createNewAccounts(String firstName, String lastName, String phoneNumber,String pin) {
        String accountNumber = generateAccountNumber(phoneNumber);
        Account account = new Account(firstName, lastName, phoneNumber,pin);
        account.setAccountNumber(accountNumber);
        account.getTimeEachAccountWasCreated();
        accounts.add(account);
        getTimeEachAccountWasCreated();

    }
    public int getTotalAccountsInBank() {
        return accounts.size();
    }

    public void   findAccountNumberInAccount(String phoneNumber) {
        boolean isAccountFound = false;
        String findAccountNumber = generateAccountNumber(phoneNumber);
        for (Account account : accounts)
            if (findAccountNumber.equals(account.getAccountNumber())) {
                isAccountFound = true;
                displayAccount();
                break;}
        if (!isAccountFound) throw new IllegalArgumentException("the account does not exist");
    }
    public void displayAccount(){
        for (Account account:accounts)
            account.toString();}

    public String generateAccountNumber(String accountNumbers) {
        return accountNumbers.startsWith("0") ? accountNumbers.substring(1) : accountNumbers;
    }
    public void depositToAccount( String accountNumber, double amount) {
        boolean isAccountNumberCorrect = false;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                isAccountNumberCorrect = true;
            account.deposit(amount);}
        if(!isAccountNumberCorrect)throw new IllegalArgumentException("the Account number is in correct");
    }

    public double checkAccountBalanceInBank(String accountNumber, String pin) {
        for (Account account : accounts)
            if (accountNumber.equals(account.getAccountNumber()) &&
                 account.confirmPin().equals(pin)) return account.checkBalance(pin);

        throw getIllegalArgumentException();
    }
    @NotNull
    private static IllegalArgumentException getIllegalArgumentException() {
        return new IllegalArgumentException("The your Account Number or Pin Is Incorrect");
    }

    public void withdrawFromAccount(String accountNumber,String pin,double amount) {
        boolean isAccountNumberCorrect = false;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                isAccountNumberCorrect = true;
            account.withdrawal(amount,pin);}
        if(!isAccountNumberCorrect)throw new IllegalArgumentException("the Account number is in correct");
    }

    public void transferFundInTheBank(String senderFirstName, String SenderLastName, String SenderPhoneNumber,
                                      String SenderPin, double AmountToBeSend, String receiverFirstName,
                                      String receiverLastName, String receiverAccountNumber) {

    }
}


