package ClassExecise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseTest {
    @Test
    public void checKIfIHaveAMethodIntArray(){
        int [] newArray = new int[1000];
        int[] actual = ArrayExercise.checkInt(newArray);
        assertEquals(actual[2], 3);


    }


}