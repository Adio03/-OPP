package chapterThree;

public class CarApplication {
    private String carModel;
    private String yearOfProduction;
    private double carPrice;

    public CarApplication(String model, String year, double price ) {
        carModel = model;
        yearOfProduction = year;
        carPrice = price;
    }

    public void carModelBrand(String model) {
        carModel = model;
    }
    public String getCarBrand() {
        return carModel;
    }

    public void carYearOfProduction(String year) {
        yearOfProduction = year;
    }

    public String getCarYearOfProduction() {
        return yearOfProduction;
    }
    public void carPrice(double price) {
        if(price > 0)carPrice = price;
        else throw new IllegalArgumentException("invalid amount");
    }
    public double getCarPrice() {
        return carPrice;
    }

    public void discountPerPurchase(double price) {
        double discount = (double) 5 / 100 * carPrice;
        carPrice = price - discount;
    }
    public void discountOnSecondPurchase(double price) {
        double discount = (double) 7 / 100 * carPrice;
        carPrice = price - discount;


    }
}
