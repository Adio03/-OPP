package MyPDfPratice;

import ClassExecise.StarSnacks1;

public class Bowling {
    public static void main(String[] args) {

        System.out.println(add(1,2,5,7,9,7));
        System.out.println(add(19,3,4,5,6,7,2,1));

    }
    public static int add(int ...number){
        int total = 0;
        for(int num : number){
            total += num;
        }

       return total;
    }
    public static double add(double ...number){
        int total=0;
        for(double num : number){
            total += num;
        }

        return total;
    }


    }

