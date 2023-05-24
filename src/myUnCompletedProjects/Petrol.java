package myUnCompletedProjects;

import java.util.Scanner;

import static java.lang.reflect.Modifier.FINAL;

public class Petrol {
    private String location;
    private String typeOfPetrol;
    private int literPurchase;
    private double petrolPrice;
    private double discount;
    public Petrol(String location, String  typeOfPetrol , int literPurchase, double petrolPrice, int quantity ) {
        this.location = location;
        this.typeOfPetrol =  typeOfPetrol;
        this.literPurchase = literPurchase;
        this.petrolPrice = petrolPrice;
        this.discount = quantity;
    }
    public void setLocation(String location) {
        location = "yaba";
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setTypeOfPetrol(String typeOfPetrol) {
        typeOfPetrol = "Diesel";
        this.typeOfPetrol = typeOfPetrol;
    }
    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setLiterPurchase(int literPurchase) {
        int literOfPetrol = 0;
        int petrolNuzzle = 0;
        while (petrolNuzzle != -1) {
           petrolNuzzle =literOfPetrol + 1;
            literOfPetrol ++;
        }
        this.literPurchase = literPurchase;
    }
    public int getLiterPurchase() {
        return literPurchase;
    }
    public void setPriceForPetrol(double petrolPrice) {
        this.petrolPrice = petrolPrice ;
    }
    public double getPriceForPetrol() {
        return petrolPrice;

    }

    public void setDiscount(double discount) {
         double discounts = 0.05;
        discounts = this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    public double purchaseAmount(double amount) {
            double price = 250;
            double quantity = 15;
            double amounts = price * quantity - 0.05;
        return amount = amounts;
    }
}


