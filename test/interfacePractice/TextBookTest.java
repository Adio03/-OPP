package interfacePractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextBookTest {
    TextBook textBook;
    @BeforeEach
    void setUp(){
        textBook = new TextBook();
    }
    @Test
    public void testThat_TextBook_CanBeSave(){
        TextBook userOne = new TextBook();
        textBook.save(userOne);
        assertEquals(1,textBook.count());
    }
    @Test
    public void testThat_multiple_TextBook_CanBeSave(){
        TextBook userOne = new TextBook();
        TextBook userTwo = new TextBook();
        TextBook userThree = new TextBook();
        textBook.save(userOne);
        textBook.save(userTwo);
        textBook.save(userThree);
        assertEquals(3,textBook.count());
    }


}