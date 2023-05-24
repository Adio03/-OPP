package MayersBriggs;

import java.util.Scanner;

public class Response {
    private Questions questions;
    private final Scanner input = new Scanner(System.in);


    public String validateInput(String answer, String[] question) {
        for (String qs : question) {
            System.out.println(qs);
            answer = input.nextLine();
            while (!(answer.equals("A") || answer.equals("B"))) {
                System.out.println("Invalid input you are to enter (A OR B) ");
                answer = input.nextLine();
            }
        }
        return answer;
    }
}
