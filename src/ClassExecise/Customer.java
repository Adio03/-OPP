package ClassExecise;

import java.math.BigDecimal;

public class Customer {

    private static String location;
    private String name;
    private BigDecimal balance;

    public Customer(String name, BigDecimal balance,String location) {
        this.name = name;
        this.balance = balance;
        Customer.location = location;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }


    public BigDecimal getBalance() {
        return balance;
    }
    public static String getLocation() {
        return location;
    }

    public static void setLocation(String location) {
        Customer.location = location;
    }


    private String getCustomerInformation(){
        return "name :" + getName() + "\nbalance: " + getBalance().doubleValue()+"\nlocation: " +getLocation();
    }


    public static void main(String[] args) {
        Customer customer= new Customer("Adio",BigDecimal.valueOf(700_000_000),"Aja" );
        customer.getCustomerInformation();
        System.out.println(customer.getCustomerInformation());
    }
}
