package myTestProject;
public class practicing {
    public static void main(String[] args) {
        System.out.println(fruitSelection("apple"));
        System.out.println(fruitSelection("mango"));
        System.out.println(fruitSelection("orange"));
        System.out.println(fruitSelection("Grapes"));
    }


    public static String fruitSelection(String fruit){
        switch (fruit) {
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("a sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit");
        }
        return  fruit;
    }
    }