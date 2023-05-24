package ClassExecise;

public class ArraySamples {
    public static void main(String[] args) {
        int [] array = new int[10];
        // insert element into the array
        for (int index = 0; index < array.length; index++) {
            array[index] += index +1;

        }

            

        System.out.println( toString(array));
    }
    private  static String toString(int[] array){
        String arrayRepresentation = "[";
        for (int index = 0; index < array.length ; index++) {
            if (index != array.length -1) arrayRepresentation += array[index] + ",";
            else arrayRepresentation += array[index];

        }
        arrayRepresentation += "]";
        return arrayRepresentation;
    }
}
