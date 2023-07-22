package Snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoOccuranceTest {
    TwoOccurance twoOccurance = new TwoOccurance();
    @Test
    public void checkIfElement(){
        int [] arr = {2,3,2,2,2,4,5,6,7,8,9,};
     int result = twoOccurance.checkArray(arr);
        assertEquals( 4,result);

    }

}