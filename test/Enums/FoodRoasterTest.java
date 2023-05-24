package Enums;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FoodRoasterTest {
    @Test

    public void createFoodRosterTest(){
        FoodRoaster[] roster = FoodRoaster.values();
        for (FoodRoaster day: roster){
            System.out.println(day.name() + " "+ Arrays.toString(day.getFood()));
        }



    }



}

