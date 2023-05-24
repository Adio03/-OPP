package chaptertwo;

public class MinimumAndMaximumNumber {
    public static int CheckMaxNumInArray(int [] arrayValue) {
        int maximumNumber = 0;
        for (int index = 0; index < arrayValue.length; index++) {
            if (maximumNumber < arrayValue[index])  maximumNumber = arrayValue[index];
        }
         return maximumNumber;
        }

        public static int CheckMinNumInArray(int [] arrayValue){
        int minimumNumber =1000;
            for (int index = 0; index < arrayValue.length; index++) {
                if(arrayValue[index] < minimumNumber) minimumNumber = arrayValue[index];

            }
            return minimumNumber;
        }

    public static void main(String[] args) {
        int [] arraysValues = {3,56,7,89,9,2,};
        System.out.println("the minimum value is: " + MinimumAndMaximumNumber.CheckMinNumInArray(arraysValues));
        System.out.println("the maximum value is: " + MinimumAndMaximumNumber.CheckMaxNumInArray(arraysValues));
    }






    }