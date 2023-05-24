package AirCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void CheckTheAcIfIsOffAtDefault() {
        Aircondition classicAs = new Aircondition();
        classicAs.toggleOn();
        assertFalse(false);
    }

    @Test
    public void turnItoN() {
        Aircondition classicAs = new Aircondition();
        classicAs.toggleOn();
        assertTrue(classicAs.isOn());
        classicAs.toggleOn();
        assertFalse(classicAs.isOn());
    }

    @Test
    public void testTurnItOnAndTurnItOff() {
        Aircondition classicAs = new Aircondition();
        classicAs.toggleOn();
        assertTrue(classicAs.isOn());
    }@Test
    public void increaseAirConditionTest(){
        Aircondition classicAs = new Aircondition();
        classicAs.toggleOn();
        assertEquals(16, classicAs.getTemperature());
     //   classicAs.toggleOn();
        classicAs.increaseTemperature();
        classicAs.increaseTemperature();
        assertEquals(18,classicAs.getTemperature());
    }@Test
    public void increaseAirConditionTo30AndShouldNotExceed30Test(){
        Aircondition classicAs = new Aircondition();
        classicAs.toggleOn();
         for (int count= 16;count <30;count++){
             classicAs.increaseTemperature();
        }
        assertEquals(30,classicAs.getTemperature());
         classicAs.increaseTemperature();
         classicAs.increaseTemperature();
         classicAs.increaseTemperature();
         assertEquals(30, classicAs.getTemperature());
        System.out.println(classicAs.getTemperature());
    }
    @Test
     public  void decreaseAirCondition(){
        Aircondition classicAs = new Aircondition();
        classicAs.decreaseAirCondition();
        classicAs.toggleOn();
//        int decrease = 16;
//        for( ;decrease <= 30;decrease ++ ){
//            classicAs.decreaseAirCondition();
//        }
        assertEquals(30,classicAs.getTemperature());




    }
}









