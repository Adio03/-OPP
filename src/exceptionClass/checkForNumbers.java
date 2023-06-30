package exceptionClass;

public class checkForNumbers {
    public static void main(String[] args) throws AgeLessThanZeroException {
        try {
            validateName("OLAwale");
            System.out.println("Name is valid.");}
        catch (AgeLessThanZeroException name){
            System.out.println("Name validation failed: " + name.getMessage());}
            try {
                validateAge(-10);
            System.out.println("you can enter a value less than zero");
            } catch (AgeLessThanZeroException noName) {
                System.out.println("enter a valid number: " + noName.getMessage());

        }

    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
       if (age < 0)
           throw new AgeLessThanZeroException(new RuntimeException(), "you enter a wrong age digit");
    }
    private static void validateName(String name) throws AgeLessThanZeroException {
        String compare = "olawale";
        if (!name.equalsIgnoreCase(compare))
            throw new AgeLessThanZeroException(new RuntimeException(), "the name you enter does not match the name required");

    }
}
