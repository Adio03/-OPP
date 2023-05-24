import NokiaPhone.Static;

public class DivisibleBy3 {
    public static int divisionOfNumber(int number){
        int valueCollected=0;
        int index= 0;
        for (; index < number; index++) {
            if (index % 3 == 0){
                valueCollected = index;
                System.out.println(valueCollected);
            }
        }
       return  valueCollected;
    }

    public static void main(String[] args) {
        System.out.println(divisionOfNumber(20));

    }


}
