package ArrayPracticing;

public class StringArray {
    public static void main(String[] args) {

        String [] array= {"adio","mark","wale","ola","olu"};
//        for (int index = 0; index < array.length; index++) {
//            System.out.println(array[index]);
//        }
        for(String name: array){
            System.out.println(name);
        }
    }
}
