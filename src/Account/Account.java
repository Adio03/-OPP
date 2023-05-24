package Account;

import java.sql.SQLOutput;

public class Account {
        private String name;
        private double balance;


        public  void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }

        public void deposit(double amount) {
            if(amount > 0 ) balance = amount + balance;
        }
        public void withdrawal(double amount) {
            if (amount < 0) {
                System.out.println("invalid input");
            } else if (amount > balance){
                System.out.println( "input again !");
            }
            else balance = balance -amount;
        }

        public double getBalance() {
            return balance;
        }
        @Override
        public String toString(){
            return "Account{\n"+"name: "+ name +"\nbalance:"+balance+"\n}";
        }

    }
