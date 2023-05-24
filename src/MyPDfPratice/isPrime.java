package MyPDfPratice;



public class isPrime {
    public static void main(String[] args) {
      final int NUMBER_OF_PRIME = 50;
      final int NUMBER_OF_PRIME_PER_LINE = 10;
      int count = 0;
      int number = 2;
        System.out.println("the first 50 prime number are \n");
        while(count < NUMBER_OF_PRIME){
            boolean isPrime = true;
            for (int index = 2; index <= number / 2 ; index++) {
                if(number % index == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                if (count % NUMBER_OF_PRIME_PER_LINE == 0){
                    System.out.println(number);
                }
                else
                    System.out.println(number + " ");
            }
        }
    }
}
