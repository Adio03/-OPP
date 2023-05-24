import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void addNumber(){
        int number =   calculator.add(2,2);
        assertEquals(4,number);
    }
    @Test
    public void subtractNumber(){
        int number = calculator.subtract(2,5);
        assertEquals(3,number);
    }
    @Test
    public void multiplicationTest(){
        int number = calculator.multiplication(-10,10);
        assertEquals(-100,number);
    }
    @Test
    public void divisionTest(){
        double number = calculator.divide(2,10);
        assertEquals(5,number);
    }
}
