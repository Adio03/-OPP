package ChapterFour;

public class Binary {
    public static void main(String[] args) {
        String num = "1110";
        int convertToInt = Integer.parseInt(num);
        int sum = 0;
        int reminder;
        for (int index = 0; index < convertToInt; index++) {
            if(index == 0){
                reminder = convertToInt % 10;
                sum += reminder * Math.pow(2,index);
            }
            if  (index> 0){
                convertToInt =convertToInt / 10;
                reminder = convertToInt % 10;
                sum = (int) ((int) reminder * Math.pow(2,index));
            }

        } System.out.println( sum);

    }
}
