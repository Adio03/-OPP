package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarApplicationTest {
    CarApplication car = new CarApplication("Toyota Camry","2020",200.00);

    @Test
        public void TestThatCarExistWithConstructor(){
        assertNotNull(car);
    }
    @Test
    public void TestToSetNameForTheCarModelTest(){
        car.carModelBrand("Toyota Camry");
        String expected = "Toyota Camry";
        assertEquals(expected,car.getCarBrand());
    }
    @Test
    public void testSetTheCarYearTest(){
        car.carYearOfProduction("2020");
        String expected ="2020";
        assertEquals(expected,car.getCarYearOfProduction());
    }
    @Test
    public void testToSetPriceForCarTest(){
        car.carPrice(2000.00);
        double expected = 2000.00;
        assertEquals(expected,car.getCarPrice());
    }
    @Test
    public void testToThatThePriceOfTheCarCanNotBeNegativeTest(){
        car.carPrice(2000.00);
      assertThrows(IllegalArgumentException.class,()-> car.carPrice(0));
    }
    @Test
     public void testThatEachCarBoughtWillHave5PerDisCountTest(){
        car.carPrice(2000.00);
        car.discountPerPurchase(2000.00);
        double expected = 1900.00;
        assertEquals(expected,car.getCarPrice());
    }
    @Test
    public void testToGiveDiscountOnSecondPurChaseTest(){
        car.carPrice(2000.00);
        car.discountOnSecondPurchase(2000.00);
        double expected = 1860.00;
        assertEquals(expected,car.getCarPrice());

    }

}
