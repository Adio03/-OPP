package listInterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ListInterFaceTest {
    ListInterFace listInterFace = new ListInterFace();

    @Test
    void testThatListInterfaceExist(){
        assertNotNull(listInterFace);
    }
    @Test
    void testToCheckIfIsEmpty() {
        assertTrue(listInterFace.isEmpty());
    }
    @Test
  public  void testThatICanAddToCounter(){
      listInterFace.add(2);
      listInterFace.add(2);
      listInterFace.add(2);
      listInterFace.add(2);
      listInterFace.add(1);
      int expected = 5;
      assertEquals(expected,listInterFace.size());
    }
    @Test
    public void testThatICanRemoveWithIndex(){
        listInterFace.add(2);
        listInterFace.add(2);
        listInterFace.add(2);
       int checkTheElements =listInterFace.remove(0);
        assertEquals(checkTheElements,listInterFace.size());

    }

    @Test
    public void tesThatICanRemoveValueWithIndexAndElement() {
        listInterFace.add(10);
        listInterFace.add(15);
        listInterFace.add(5);
        listInterFace.add(11);
        listInterFace.add(2);
        listInterFace.add(5);
       int expected = listInterFace.removeElement(10);
       assertEquals(expected,listInterFace.size());
//       there's a bug in this method

    }


}


