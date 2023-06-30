package myPhoneBook;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void testThanIHaveAPhoneBookClassTest(){
        assertNotNull(phoneBook);
    }
    @Test
    public void testIThatICanCreateContactInPhoneBookTest(){
        phoneBook.createContact("olawale","olaolu","07011223344");
        int expected = 1;
        assertEquals(expected,phoneBook.contactCreatedSize());
    }
    @Test
    public void TestToSaveManySaveManyContactTest(){
        phoneBook.createContact("olawale","Olaolu","+2347112223344");
        phoneBook.createContact("ola","olu","+2348122334455");
        phoneBook.createContact("wale","olu","+2348122334455");
        phoneBook.createContact("ade","ola","+2348122334455");
        phoneBook.createContact("ole","peter","+2348122334455");
        phoneBook.createContact("ebuka","wale","+2348122334455");
        phoneBook.createContact("sultan","olajide","+2348122334455");
        int expected = 7;
        assertEquals(expected,phoneBook.contactCreatedSize());
    }
    @Test
    public void testToSearContactWithFirstName() {
        phoneBook.createContact("ola","olu","+2348122334455");
        assertEquals(1, phoneBook.contactCreatedSize());
     Optional<Contact> actual = phoneBook.searchContactByFirstName("ola");
     assertTrue(actual.isPresent());
        String expected = """
                Firstname: ola
                Lastname: olu
                Phone number:+2348122334455""";
        assertEquals(expected,actual.get().toString());
    }
    @Test
    public void testICanSearchContactWithLastNameTest(){
            phoneBook.createContact("olawale","olaolu","+2348122334455");
            assertEquals(1, phoneBook.contactCreatedSize());
            Optional<Contact> actual = phoneBook.searchContactByLastName("olaolu");
            assertTrue(actual.isPresent());
        String expected = """
                Firstname: olawale
                Lastname: olaolu
                Phone number:+2348122334455""";
        assertEquals(expected,actual.get().toString());
        }


    @Test
    public void testToDisplayContactByPhoneNumber(){
        phoneBook.createContact("ola","olu","+2348122334455");
        assertEquals(1, phoneBook.contactCreatedSize());
        Optional<Contact> actual = phoneBook.searchContactByPhoneNumber("+2348122334455");
        assertTrue(actual.isPresent());
        String expected = """
                Firstname: ola
                Lastname: olu
                Phone number:+2348122334455""";
        assertEquals(expected,actual.get().toString());

    }
    @Test
    public void testToDeleteContactByIdTest(){
        phoneBook.createContact("ola","shade","07088997766");
        phoneBook.createContact("ola","shade","07088997766");
        phoneBook.createContact("ola","shade","07088997766");
        phoneBook.createContact("ola","shade","07088997766");
        phoneBook.createContact("ola","shade","07088997766");
        phoneBook.createContact("ola","shade","07088997766");
        int excepted = 6;
        assertEquals(excepted,phoneBook.contactCreatedSize());
        phoneBook.deleteContactById(1);
        assertEquals(5,phoneBook.contactCreatedSize());

    }
    @Test
    public void testToUpdateContactInfoTest(){
        phoneBook.createContact("ola","shade","07088997766");
        int excepted = 1;
        assertEquals(excepted,phoneBook.contactCreatedSize());
        Optional<Contact> actual = phoneBook.searchContactByPhoneNumber("07088997766");
        assertTrue(actual.isPresent());
        String expected = """
                Firstname: ola
                Lastname: shade
                Phone number:07088997766""";
        assertEquals(expected,actual.get().toString());
       Optional<Contact> actuals = phoneBook.updateContactPhoneNumber("07088997766","07011223344");
       assertTrue(actuals.isPresent());
        String expect = """
                Firstname: ola
                Lastname: shade
                Phone number:07011223344""";
        assertEquals(expect,actuals.get().toString());
    }
    @Test
    public void testToUpdateContactFirstNameTest(){
        phoneBook.createContact("ola","shade","07088997766");
        int excepted = 1;
        assertEquals(excepted,phoneBook.contactCreatedSize());
        Optional<Contact> actual = phoneBook.searchContactByFirstName("ola");
        assertTrue(actual.isPresent());
        String expected = """
                Firstname: ola
                Lastname: shade
                Phone number:07088997766""";
        assertEquals(expected,actual.get().toString());
        Optional<Contact> actuals = phoneBook.updateContactFirstName("ola","taiye");
        assertTrue(actuals.isPresent());
        String expect = """
                Firstname: taiye
                Lastname: shade
                Phone number:07088997766""";
        assertEquals(expect,actuals.get().toString());
    }
    @Test
    public void testToUpdateContactLastNameTest(){
        phoneBook.createContact("ola","shade","07088997766");
        int excepted = 1;
        assertEquals(excepted,phoneBook.contactCreatedSize());
        Optional<Contact> actual = phoneBook.searchContactByLastName("shade");
        assertTrue(actual.isPresent());
        String expected = """
                Firstname: ola
                Lastname: shade
                Phone number:07088997766""";
        assertEquals(expected,actual.get().toString());
        Optional<Contact> actuals = phoneBook.updateContactLastName("shade","taiye");
        assertTrue(actuals.isPresent());
        String expect = """
                Firstname: ola
                Lastname: taiye
                Phone number:07088997766""";
        assertEquals(expect,actuals.get().toString());
    }









}

