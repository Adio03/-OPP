package Snacks;

public class LargestElementInList {

    public int getElement(int[] arrayElement) {
        int largestElement=arrayElement[0];
        for (int index = 0; index < arrayElement.length; index++) {
            if (arrayElement[index] > largestElement)  largestElement = arrayElement[index];

        }
        return largestElement;
    }
}
