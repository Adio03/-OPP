 package Account;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

 public class Bank {
    private final List<Account> accounts = new ArrayList<>();


    public void createNewAccounts(String firstName, String lastName, String phoneNumber,String pin) {
        String accountNumber = generateAccountNumber(phoneNumber);
        Account account = new Account(firstName, lastName, phoneNumber, pin);
        account.setAccountNumber(accountNumber);
        accounts.add(account);

    }
    public int getTotalAccountsInBank() {
        return accounts.size();
    }
    public String findAccountNumberInAccount(String phoneNumber) {
        boolean isAccountFound = false;
        String findAccountNumber = generateAccountNumber(phoneNumber);
        for (Account account : accounts)
            if (findAccountNumber.equals(account.getAccountNumber())) {
                isAccountFound = true;
                display();
                break;}
        if (!isAccountFound) throw new IllegalArgumentException("the account does not exist");
        return findAccountNumber;
    }
    public String generateAccountNumber(String accountNumbers) {
        return accountNumbers.startsWith("0") ? accountNumbers.substring(1) : accountNumbers;
    }
    public void depositToAccount( String accountNumber, double amount) {
        boolean isAccountNumberCorrect = false;
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                isAccountNumberCorrect = true;
            account.deposit(amount);
            if (!isAccountNumberCorrect) throw new IllegalArgumentException("the Account number is incorrect");
        }
    }
    public void validateDeposit(String firstName,String lastName){
        for (Account account: accounts)
            if(!Objects.equals(account.getFirstName(), firstName) && !Objects.equals(account.getLastName(),lastName) )
                throw new IllegalArgumentException("you have entered a wrong Name");
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
            validateWithdraw(pin);
            account.withdrawal(amount,pin);}
        if(!isAccountNumberCorrect)throw new IllegalArgumentException("the Account number is incorrect");
    }
    private void validateWithdraw(String pin){
        for (Account account:accounts)
            if (account.checkBalance(pin) == 0) throw new IllegalArgumentException("Insufficient funds");
    }
    public void display(){
        for (Account account: accounts)
            account.toString();
    }

    public void transferFundInTheBank(String senderFirstName, String SenderLastName, String SenderPhoneNumber,
                                      String SenderPin, double AmountToBeSend, String receiverFirstName,
                                      String receiverLastName, String receiverAccountNumber) {

    }
}


