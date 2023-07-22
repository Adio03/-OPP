package Account;


import java.time.LocalDateTime;
import java.util.Objects;

public class Account {
        private String firstName;
        private String lastName;
        private double balance;
        private String accountNumber;
        private String pins;
    private String phoneNumber;



    public Account(String firstName,String lastName,String phoneNumber,String pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        accountNumber = phoneNumber;
        pins = pin;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
        }
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
        pins = pin;
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
    public void setAccountNumber(String phoneNumber){
        this.accountNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return  accountNumber;
    }
    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;}

    public String checkPhoneNumber() {
        return phoneNumber;}




        @Override
        public String toString(){
            return "\nAccount Details:  \nfirstName: " + firstName + "\n last Name: " + lastName + "\naccountNumber:"+accountNumber;
        }



}




