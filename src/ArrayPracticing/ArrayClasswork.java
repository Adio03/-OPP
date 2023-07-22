package ArrayPracticing;

import java.util.Arrays;

public class ArrayClasswork {
    public static void main(String[] args) {
       String name = "Olawale";
//       name= String.valueOf(Integer.parseInt(String.valueOf(name.charAt(6))));
       name = String.valueOf(Integer.parseInt(name));
        System.out.println("name ::" + name);
        int [] array = {10,78,97,110,67,35};
        boolean check = true;
        int holder = 0;
        while (check){
            check = false;
            for (int index = 0; index < array.length -1; index++) {
                if(array[index] < array[index+1]){
                    holder = array[index+1];
                    array[index+1] = array[index];
                    array[index] = holder;
                    check = true;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

}
