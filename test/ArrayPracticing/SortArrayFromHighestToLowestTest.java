package ArrayPracticing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SortArrayFromHighestToLowestTest {
    SortArrayFromHighestToLowest arrayFromHighestToLowest = new SortArrayFromHighestToLowest();

    @Test
    public void testToSortArrayFromHighestToLowestTest(){
        int [] arraysToSort = {1,5,6,8,9,4,7,70};
        int[] arrayToCheck = arrayFromHighestToLowest.sortedArray(arraysToSort);
        int [] expected = {70,9,8,7,6,5,4,1};
        assertEquals(Arrays.toString(expected),Arrays.toString(arrayToCheck));

    }
}
