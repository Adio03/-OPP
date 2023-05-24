package chaptertwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestAndSmallNumberTest {
    LargestAndSmallNumber largestAndSmallNumber = new LargestAndSmallNumber();
    @Test
    public void checkIfMethodCanTakesInValueAndGiveTheMaxAndMin() {
        int [] newArrays = {20,50,100,45,2};
        int minValue = largestAndSmallNumber.getMinValue(newArrays);
        assertEquals(2,minValue);
    }
    @Test
    public void checkMaxValue(){
        int [] arr = {20,30,40,35,80};
        int maxValue = largestAndSmallNumber.getMaxValue(arr);
        assertEquals(80,maxValue);
    }
    @Test
    public void checkBothMaxAndMin(){
        int [] checkBothValues ={20,100,50,34,80};
        int[] minAndMaxValue = largestAndSmallNumber.getMaxAndMin(checkBothValues);
        assertEquals(minAndMaxValue[0],20);
        assertEquals(minAndMaxValue[1],100);
    }

    }

