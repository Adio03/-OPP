//package NokiaPhone;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Questionaire {
//    private  String name;
//    private final Scanner input = new Scanner(System.in);
//    private final String[] questions = new String[20];
//    private int a, b;
//
//    public  String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//
//        this.name = name;
//    }
//
//    public Scanner getInput() {
//        return input;
//    }
//
//    public String []getQuestions() {
//       return questions;
//    }
//
//    public void question() {
//        String response = " ";
//        String[] questionToCheck = {"1. A. expend energy, enjoy groups \n B. conserve energy, enjoy one-on-one",
//                "2.     A. interpret literally \n B. look for meaning and possibilities",
//                "3. A. logical, thinking, questioning \n  B. empathetic, feeling, accommodating",
//                "4. A. organized, orderly \n B.flexible, adaptable",
//                "5. A. more outgoing, think out loud \n B. more reserved, think to yourself",
//                "6. A. practical, realistic, experiential\n B. imaginative, innovative, theoretical",
//                "7. A. candid, straight forward, frank or b. tactful, kind, encouraging",
//                "8. A. plan, schedule \n B. unplanned, spontaneous",
//                "9. A. seek many tasks, public activities, interaction with others\n B. seek private, solitary activities with quiet to concentrate",
//                "10. A. standard, usual, conventional\n B. different, novel, unique",
//                "11. A. firm, tend to criticize, hold the line\n B. gentle, tend to appreciate, conciliate",
//                "12. A. regulated, structured\n B. easygoing, “live” and “let live",
//                "13. A. external, communicative, express yourself \nB. internal, reticent, keep to yourself",
//                "14. A. focus on here-and-now \n B. look to the future, global perspective, big picture",
//                "15. A. tough-minded, just\n B. tender-hearted, merciful",
//                "16. A. preparation, plan ahead \n B. go with the flow, adapt as you go",
//                "17. A. active, initiate \n B. reflective, deliberate",
//                "18. A. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical",
//                "19. A. matter of fact, issue-oriented \n B. sensitive, people-oriented, compassionate",
//                "20. A. control, govern \n B. latitude, freedom"
//        };
//    }
//
//
//        String []answer ={ };
//        String [] question1_5 = {"1. A. expend energy, enjoy groups \n B. conserve energy, enjoy one-on-one",
//                "2.     A. interpret literally \n B. look for meaning and possibilities",
//                "3. A. logical, thinking, questioning \n  B. empathetic, feeling, accommodating",
//                "4. A. organized, orderly \n B.flexible, adaptable",
//                "5. A. more outgoing, think out loud \n B. more reserved, think to yourself"};
//        String[] question6_10 = {"6. A. practical, realistic, experiential\n B. imaginative, innovative, theoretical",
//                "7. A. candid, straight forward, frank or b. tactful, kind, encouraging",
//                "8. A. plan, schedule \n B. unplanned, spontaneous",
//                "9. A. seek many tasks, public activities, interaction with others\n B. seek private, solitary activities with quiet to concentrate",
//                "10. A. standard, usual, conventional\n B. different, novel, unique",};
//        String[] question11_15 = {"11. A. firm, tend to criticize, hold the line\n B. gentle, tend to appreciate, conciliate",
//                "12. A. regulated, structured\n B. easygoing, “live” and “let live",
//                "13. A. external, communicative, express yourself \nB. internal, reticent, keep to yourself",
//                "14. A. focus on here-and-now \n B. look to the future, global perspective, big picture",
//                "15. A. tough-minded, just\n B. tender-hearted, merciful",};
//        String[] question16_20 = {
//                "16. A. preparation, plan ahead \n B. go with the flow, adapt as you go",
//                "17. A. active, initiate \n B. reflective, deliberate",
//                "18. A. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical",
//                "19. A. matter of fact, issue-oriented \n B. sensitive, people-oriented, compassionate",
//                "20. A. control, govern \n B. latitude, freedom"};
//
//
//
//    public void validateInput(String answwer, String[] question) {
//        for (String qs : question) {
//            System.out.println(qs);
//            answer = input.nextLine();
//            while (!(answer.equals("A") || answer.equals("B"))) {
//                System.out.println("Invalid input you are to enter (A OR B) ");
//                answer = input.nextLine();
//            }
//        }
//    }
//
//    public void checkingForAAndB(String answer, String[] question) {
//        validateInput(answer, question);
//
////        String[] answers = {"A", "B", "A", "B"};
//        String[] answers = new String[4];
//        answers[0] = Arrays.toString(question1_5);
//        answers[1] = Arrays.toString(question6_10);
//        answers[2] = Arrays.toString(question11_15);
//        answers[3] = Arrays.toString(question16_20);
//        for (int i = 0; i < question1_5.length; i++) {
//            if ()
//
//        }
//    }
//        public static void iterate(String[] question, String[] answer){
//        StringBuilder sb = new StringBuilder();
//            for (int i = 0; i <question.length ; i++) {
//                if ()
//
//
//            }
//        }
//        public static String getOptions() {
//
//        }
//        StringBuilder personality = new StringBuilder();
//
//        if (answers[0].equals("A")) {
//            personality.append("I");
//
//        } else {
//            personality.append("E");
//
//        }
//
//        if (answers[1].equals("A")) {
//            personality.append("S");
//            a++;
//        } else {
//            personality.append("N");
//            b ++;
//        }
//        if (answers[2].equals("A")) {
//            personality.append("T");
//            a++;
//        } else {
//            personality.append("F");
//            b++;
//        }
//
//        if (answers[3].equals("A")) {
//            personality.append("J");;
//            a++;
//        } else {
//            personality.append("P");
//            b++;
//        }
//
//        if (a > b){
//
//        }
//
//
//        System.out.println("Your personality type is: " + personality);
//
//    }
//
//    public static void main(String[] args) {
//        Questionaire questionaire = new Questionaire();
//        questionaire.question6_10();
//    }
//
//}



