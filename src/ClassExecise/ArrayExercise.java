package ClassExecise;

    public class ArrayExercise {
        public static void main(String[] args) {
             int[] arrays = new int[10];
            for (int counter = 0; counter < arrays.length; counter++) arrays[counter] += counter +1;


            System.out.println(inputElementInArray(arrays));

        }

        private  static String inputElementInArray(int[] arrays) {
            String arrayRepresentation = "[";
            for (int index = 0; index < arrays.length; index++) {
                if (index != arrays.length - 1) arrayRepresentation += arrays[index] + ",";
                else arrayRepresentation += arrays[index];
            }
            arrayRepresentation += "]";
            return arrayRepresentation;
        }


        public static int[] checkInt(int [] arrays) {
            int[] array = new int[10];
            for (int index = 0; index < array.length; index++) {
                array[index] += index +1;


            }
            return arrays;
        }
    }
