package EbuKzyPackage;

import java.util.Arrays;

public class Append {
    public static void main(String[] args) {
        StringBuffer input = new StringBuffer();
        char[] abc= new char[] {'A','B','C','D'};
        input.append(abc);
        System.out.println(Arrays.toString(abc));
        System.out.println("after appending =" + input);

    }
}