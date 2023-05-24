import Chapter6.IsMultiple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsMultipleTest {
    IsMultiple isMultiples = new IsMultiple();

    @Test
    public void checkIfNumberIsMultiple(){
      boolean answer =  IsMultiple.isMultiple(25,5);
        assertTrue(answer);


    }

}