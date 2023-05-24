package Snacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    ReverseList reverseList = new ReverseList();
    @Test
    public void reverseListTest(){

        int [] arrays = {10,23,1,4,5};
        int[] expected = reverseList.reverseArrayValues(arrays);
        assertEquals(1, expected[0]);
        assertEquals(4, expected[1]);
        assertEquals(5, expected[2]);
    }
    public void reverseElement(){
        int [] array = {10,23,1,4,5};



    }




}