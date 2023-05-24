package ClassExecise;

import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class UserPromptTest {

    @Test
    public void UserPrompt(){
        UserPrompt input = new UserPrompt();
        input.setName("Godfry");
        assertEquals("Godfry", input.getName());
    }

}