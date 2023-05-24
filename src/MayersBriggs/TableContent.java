package MayersBriggs;

import java.util.Arrays;
import java.util.Scanner;



public class TableContent {
    private static String name;
    private final Scanner input = new Scanner(System.in);
    private final String [] questions = new String[20];

    public static String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public Scanner getInput() {
        return input;
    }
    public String[] getQuestions() {

        return questions;
    }
    public static void question() {
        String answer = " ";
        String[] questionToCheck = {"1. a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one\n",
                "2. a. interpret literally or b. look for meaning and possibilities\n",
                "3. a. logical, thinking, questioning or b. empathetic, feeling, accommodating\n",
                "4. a. organized, orderly or b. flexible, adaptable\n",
                "5. a. more outgoing, think out loud or b. more reserved, think to yourself\n",
                "6. a. practical, realistic, experiential or b. imaginative, innovative, theoretical\n",
                "7. a. candid, straight forward, frank or b. tactful, kind, encouraging\n",
                "8. a. plan, schedule or b. unplanned, spontaneous\n",
                "9. a. seek many tasks, public activities, interaction with others\n",
                    " b. seek private, solitary activities with quiet to concentrate\n",
                "10. a. standard, usual, conventional or b. different, novel, unique\n",
                "11. a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate\n",
                "12. a. regulated, structured or b. easygoing, “live” and “let live”\n",
                "13. a. external, communicative, express yourself or b. internal, reticent, keep to yourself\n",
                "14. a. focus on here-and-now or b. look to the future, global perspective, “big picture”\n",
                "15. a. tough-minded, just or b. tender-hearted, merciful\n",
                "16. a. preparation, plan ahead or b. go with the flow, adapt as you go\n",
                "17. a. active, initiate or b. reflective, deliberate\n",
                "18. a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical\n",
                "19. a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate\n",
                "20. a. control, govern or b. latitude, freedom"};
        System.out.println(Arrays.toString(questionToCheck));
    }
    public static void question1_5(String[] arr){
        String answer =" ";
        String[] question1_5 = {"1. a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one\n",
                "2. a. interpret literally or b. look for meaning and possibilities\n",
                "3. a. logical, thinking, questioning or b. empathetic, feeling, accommodating\n",
                "4. a. organized, orderly or b. flexible, adaptable\n",
                "5. a. more outgoing, think out loud or b. more reserved, think to yourself\n",};


        }
        public static void  question6_7(){
        String answer = " ";
        String [] question6_10 = { "6. a. practical, realistic, experiential or b. imaginative, innovative, theoretical\n",
                "7. a. candid, straight forward, frank or b. tactful, kind, encouraging\n",
                "8. a. plan, schedule or b. unplanned, spontaneous\n",
                "9. a. seek many tasks, public activities, interaction with others , b. seek private, solitary activities with quiet to concentrate\n",
                "10. a. standard, usual, conventional or b. different, novel, unique\n"};

        }
        public  void question11_10(){
        String answer = " ";
        String [] question11_15 = { "11. a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate\n",
                "12. a. regulated, structured or b. easygoing, “live” and “let live”\n",
                "13. a. external, communicative, express yourself or b. internal, reticent, keep to yourself\n",
                "14. a. focus on here-and-now or b. look to the future, global perspective, “big picture”\n",
                "15. a. tough-minded, just or b. tender-hearted, merciful\n"};

            validateInput(answer,question11_15);
           checkingForAAndB(answer,question11_15);


        }
        public  void question16_20(){
        String answer = "";
        String [] question16_20 = {
                "16. a. preparation, plan ahead or b. go with the flow, adapt as you go\n",
                "17. a. active, initiate or b. reflective, deliberate\n",
                "18. a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical\n",
                "19. a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate\n",
                "20. a. control, govern or b. latitude, freedom"};
            validateInput(answer,question16_20);
            checkingForAAndB(answer,question16_20);
        }
        public String validateInput(String answer, String[] question){
            return answer;
        }
    public String checkingForAAndB(String answer, String[] question) {
        answer = validateInput(answer,question);

        String[] answers = {"A","B", "A","B"};
        StringBuilder personality = new StringBuilder();

        if(answers[0].equals("A")) {
            personality.append("I");
        } else {
            personality.append("E");
        }

        if(answers[1].equals("A")) {
            personality.append("S");
        } else {
            personality.append("N");
        }

        if(answers[2].equals("A")) {
            personality.append("T");
        } else {
            personality.append("F");
        }

        if(answers[3].equals("A")) {
            personality.append("J");
        } else {
            personality.append("P");
        }

        System.out.println("Your personality type is: " + personality);

        return answer;

    }



    }






