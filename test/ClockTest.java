
import myUnCompletedProjects.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ClockTest {
private Clock clock = new Clock(0,0,0) ;

@Test
    public void allArgsExistInClock(){
    assertNotNull(clock);
}
@Test
    public void gethourTest(){
    int hour = clock.getHour();
    assertEquals(0, hour);
}
@Test
    public void getMinuteTest(){
    int minute = clock.getMinute();
    assertEquals(0, minute);
}
@Test
    public void getSeconds(){
    int seconds = clock.getSeconds();
    assertEquals(0, seconds);
}
@Test public void hourCanBeSet(){
    clock.setHour(23);
    assertEquals(23, clock.getHour());
}
@Test
public void ifTheVlueOfHourIs23ItShouldGoBackTo0(){
    clock.setHour(24);
    assertEquals(0, clock.getHour());
}
@Test
public void ifTheValueoFHourIsLessThan0ShouldReturnZero(){
    clock.setHour(-1);
    assertEquals(0, clock.getHour());

}
@Test
public void ifValuePassedInIsBetween0And23ItShouldReturnTheSameValue(){
    clock.setHour(5);
    assertEquals(5, clock.getHour());
}
@Test
public void minuteCnBeSet(){
    clock.setMinute(40);
    assertEquals(40, clock.getMinute());
}
@Test
    public void secondCanBeSetTest(){
    clock.setSeconds(40);
    assertEquals(40, clock.getSeconds());
}
//@Test
//    public void iCan3

}
