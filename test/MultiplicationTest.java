import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultiplicationTest {
    Multiplication multiplication = new Multiplication();
    @Test
    public void MultiplicationExistTest(){
        assertNotNull(multiplication);
    }
    @Test
    public void multiplyTwoNum(){
        int sum = multiplication.multiplyTwoNumber(10,10);
        assertEquals(100,sum);

    }

}
