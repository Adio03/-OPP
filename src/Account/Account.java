package Account;


import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
        private String firstName;
        private String lastName;
        private double balance;
        private String accountNumber;
        private String pins;
    private String phoneNumber;


//    public Account(String firstName,String lastName,String phoneNumber,String pin) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//        this.pins = pin;
//    }

    public Account() {

    }

    public void setFirstName(String firstName){this.firstName = firstName;}
        public String getFirstName(){
        return firstName;
        }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
   public void setPin(String pin) {
        if(pin.length() != 4 && pinValidation(pin))
            throw new IllegalArgumentException("invalid pin !!!");
        pins = pin;
    }
    private boolean pinValidation(String pin){
        Pattern pinPattern = Pattern.compile("[a-zA-z]");
        Matcher pinMatcher = pinPattern.matcher(pin);
        return !pinMatcher.find();
    }
    private boolean validateAccountNumber(String accountNumber){
        Pattern accountNumberPattern = Pattern.compile("[a-zA-z]");
        Matcher accountNumberMatcher =accountNumberPattern.matcher(accountNumber);
        return !accountNumberMatcher.find();
    }
    private boolean validateAccountNumberLength(String accountNumber) {
        return accountNumber.length() == 10;
    }
    public String confirmPin() {
        return pins;
    }
        public void deposit(double amount) {
        if(amount <= 0 ) throw new IllegalArgumentException("you can't deposit less than zero ");
        else balance +=  amount;
        }
        public void withdrawal(double amount, String pin) {
            if (!(Objects.equals(pins, pin)) || amount < 0 || amount > balance  )
                throw new IllegalArgumentException("Check your pin or you trying a negative amount");
                else balance -=  amount;
            }
            public double checkBalance(String pin) {
            if (!(Objects.equals(pins, pin)))
                throw new IllegalArgumentException("invalid pin");
                else return balance;
        }
    public void setAccountNumber(String phoneNumber){;
//        if (phoneNumber.length() != 10 || validateAccountNumber(phoneNumber))
//            throw new IllegalArgumentException("invalid account number");
        this.accountNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return  accountNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;}

    public String getPhoneNumber() {
        return phoneNumber;}


//    @Override
//    public String toString() {
//        return "Account{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", balance=" + balance +
//                ", accountNumber='" + accountNumber + '\'' +
////                ", pins='" + pins + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }

    @Override
        public String toString(){
            return "\nAccount Details:  \nfirstName: " + firstName + "\n last Name: " + lastName + "\naccountNumber:"+accountNumber;
        }



}




