package myPhoneBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    Contact contact = new Contact("olamide","Oye","+2348122334455");
    @Test
    public void testThatIHaveContactWithConstructorTest(){
        assertNotNull(contact);
    }
    @Test
    public void testThatICanUpdateFirstNameTest(){
        String firstName= "olamide";
        contact.setFirstName(firstName);
        assertEquals(firstName,contact.getFirstName());
    }
    @Test
    public void testThatICanUpdateLastNameTest(){
        String lastName = "olawale";
        contact.setLastName(lastName);
        assertEquals(lastName,contact.getLastName());

    }
    @Test
    public void testThatICanCreateContactWithPhoneNumberTest() {
        String contactNumber = "+2348122334455";
        contact.addPhoneNumberToContact(contactNumber);
        assertEquals(contactNumber, contact.getContactPhoneNumber());
    }
    @Test
    public void testThatICanCreateConTactWithPhoneNumberTest2(){
        String contactNumber = "07022334455";
        contact.addPhoneNumberToContact(contactNumber);
        assertEquals(contactNumber,contact.getContactPhoneNumber());
    }
    @Test
    public void testThatPhoneNumberShouldNotBeMoreThan14andEleven(){
        String checkPhoneNumber ="1223345578899";
       assertThrows( IllegalArgumentException.class,()-> contact.validatePhoneNumberLength(checkPhoneNumber));
    }
    @Test
    public void testThatPhoneNumberShouldNotBeContainsAlphaBetTest(){
        String checkPhoneNumber = "a12ae566828999";
        assertThrows(IllegalArgumentException.class,()->contact.validatePhoneNumbersCharacters(checkPhoneNumber));
    }


    }

