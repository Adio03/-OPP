package ClassExecise;

public class FizzBuzz {
        public static void main(String[] args) {
            int num = 0;

            for (; num < 100; num++) {
//                int counter = 0;
//                for (; counter < 1; counter++) ;

                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("fizz buzz");
                } else if (num % 3 == 0) {
                    System.out.println("fizz");
                } else if (num % 5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(num);
                }
//        int number = 10;
//        switch (number) {
////            case 3 -> System.out.println("number is three");
//            case 5 -> System.out.println("number is 4");
////            case 6 -> System.out.println("number is 6");
////            default -> System.out.println("incorrect");
////        }


            }
        }


}
