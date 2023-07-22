import creditCard.DoubleArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleArrayTest {
    DoubleArray doubleArray = new DoubleArray();
    @Test
    public void iHaveAnArray(){

        int [] arrays = {1,2,3};
        int [] expect = {1,2,3,0,0,0,};
        DoubleArray.checkArray();
        assertArrayEquals(expect, DoubleArray.getCheckArray());
    }



}