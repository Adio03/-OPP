package phoneBooksClassWorkTest;

import org.junit.jupiter.api.Test;
import phoneBooksClassWork.PhoneBooks;
import phoneBooksClassWork.PhonebookClasswork;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookClassworkTest {
    PhonebookClasswork phonebook = new PhonebookClasswork("matrix", "password");

    @Test
    public void testThatIHaveAPhonebook() {
        assertNotNull(phonebook);
    }

    @Test
    public void testThatPhonebookLockByDefaultTest() {
        assertTrue(phonebook.isLocked());
    }

    @Test
    public void testThatICanUnLockPhonebookWithPassWordTest() {
        assertTrue(phonebook.isLocked());
        phonebook.unlockWith("password");
        assertFalse(phonebook.isLocked());
    }
    @Test
    public void testToCreatePhonebookInPhonebookS() {
        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.createPhoneBooks("semicolon", "password");
        assertEquals(1, phoneBooks.listOfPhonebook().size());
    }
    @Test
    public void testToCreatePhonebookInPhonebookSA() {
        PhoneBooks phoneBooks = new PhoneBooks();
        phoneBooks.createPhoneBooks("semicolon", "password");
        phoneBooks.createPhoneBooks("semicolon", "password");
        phoneBooks.createPhoneBooks("semicolon", "password");
        assertEquals(3, phoneBooks.listOfPhonebook().size());
        for (PhonebookClasswork phonebookClasswork : phoneBooks.listOfPhonebook())
            assertTrue(phonebookClasswork.isLocked());
        }

        @Test
         public void testToCreatePhonebookInPhonebookSABi() {
        PhoneBooks phoneBooks = new PhoneBooks();
            phoneBooks.createPhoneBooks("semicolon", "password");
            phoneBooks.createPhoneBooks("semicolon", "password");
            phoneBooks.createPhoneBooks("semicolon", "password");
            assertEquals(3, phoneBooks.listOfPhonebook().size());
            for (PhonebookClasswork phonebookClasswork : phoneBooks.listOfPhonebook()){
                assertTrue(phonebookClasswork.isLocked());
            }
            phoneBooks.unlockAll();
            for (PhonebookClasswork phonebookClasswork : phoneBooks.listOfPhonebook()){
                assertFalse(phonebookClasswork.isLocked());
            }
    }
//    @Test[=
//    public  void testPasswordCanNotBeUnlockWithWrongPasswordTest(){
//        asserppptTrue(phonebook.isLocked());
//        phonebook.unlockWith("gems");
//        assertTrue(phonebook.isLocked());
//    }
//    @Test
//    public void testICanPhonebookCanBeUnlockTest(){
//        phonebook.unlockWith("password");
//        assertTrue(phonebook.isLocked());
//        phonebook.locked();
//        assertTrue(phonebook.isLocked());
//
//    }

}