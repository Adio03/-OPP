import myUnCompletedProjects.Petrol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PetrolClassTest {
     Petrol petrol = new Petrol("Yaba","Diesel",30,250.00,10 );

    @Test
    public void allArgsExistInClassPetrol(){
        assertNotNull(petrol);
    }
    @Test
    public void getLocationTest() {
        petrol.setLocation("yaba");
        String locationSet = petrol.getLocation();
        assertEquals("yaba", locationSet);
    }
    @Test
    public void setLocationTest(){
        petrol.setLocation("yaba");
        assertEquals("yaba", petrol.getLocation());
    }
    @Test
    public void getTypeOfPetrolTest(){
        petrol.setTypeOfPetrol("Diesel");
        String fuel =petrol.getTypeOfPetrol();
        assertEquals("Diesel",fuel);
    }
    @Test
    public void setTypeOfPetrolTest(){
        petrol.setTypeOfPetrol("Diesel");
        assertEquals("Diesel",petrol.getTypeOfPetrol());
    }
    @Test
    public void setLiterPurchase(){
        petrol.setLiterPurchase(30);
        assertEquals(30,petrol.getLiterPurchase());

    }
    @Test
    public void setPriceForPetrol(){
        petrol.setPriceForPetrol(250);
        assertEquals(250,petrol.getPriceForPetrol(),250.00);
    }
    @Test
    public void quantityPurchaseInLiter(){
        petrol.setDiscount(0.05);
        assertEquals(0.05,petrol.getDiscount());
    }
    @Test
    public void purchaseAmount(){
       double amount =  petrol.purchaseAmount(3_749.95);
       assertEquals(3_749.95, amount);
    }

}
