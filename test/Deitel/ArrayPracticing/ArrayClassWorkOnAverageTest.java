package ArrayPracticing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWorkOnAverageTest {
    ArrayClassWorkOnAverage arrayClassWorkOnAverage = new ArrayClassWorkOnAverage();

    @Test
    public void iHaveAMethodThatCanTakesInput(){
        int [] arr = {10, 20, 30, 40};
        double sum = arrayClassWorkOnAverage.getAverage(arr);
        assertEquals(25, sum);


    }


}
