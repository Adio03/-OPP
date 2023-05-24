package Snacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LargestElementInListTest {
    LargestElementInList largestElementInList = new LargestElementInList();
   @Test
    public void iHaveAMethodThatCanTakesInElement() {
       int [] arrayElement = {20,10,45,19,34};
       int newElement =largestElementInList.getElement(arrayElement);
       assertEquals(45,newElement);
       System.out.println("the largest value is: " + newElement);
   }


}