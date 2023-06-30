package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack stack = new MyStack(5);
    @Test
    public void stackExistTest(){
        assertNotNull(stack);
    }
    @Test
    public void newStackIsEmptyTest(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushXStackShouldNotBeEmpty(){
        stack.push("G-String");
        assertEquals("G-String",stack);
    }
    @Test
    public void pushXPopXStackShouldBeEmptyTest(){
        stack.push("E-String");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

}
