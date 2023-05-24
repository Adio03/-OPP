package ClassExecise;

public class VariableSwap{
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int c = a;
         a = b ;
         b = a;

        System.out.println(a);
        System.out.println(c);
    }

}