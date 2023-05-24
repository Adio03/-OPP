package Snacks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddPositionTest {
    OddPosition oddPosition = new OddPosition();
    @Test
    public void checkIfIHaveAtListTest(){
        int [] arrays = { 2,3,4,5,6,10,15,8,13,14};
        int[] numberToCheck=OddPosition.checkList(arrays);
//        assertArrayEquals(numberToCheck);


    }



}
