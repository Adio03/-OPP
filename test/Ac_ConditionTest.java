import ClassExecise.Ac_Condition;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ac_ConditionTest {
    Ac_Condition condition = new Ac_Condition();
    @Test
    public void isOnAcTest(){
        condition.toggle_on();
        assertTrue(condition.isOn());
    }
    @Test
    public  void increaseTemperatureTest(){
        //given
        condition.toggle_on();
        assertTrue(condition.isOn());
        assertEquals(0,condition.getTemperature());
        condition.increaseTemperature();
        assertEquals(1,condition.getTemperature());



    }
}
