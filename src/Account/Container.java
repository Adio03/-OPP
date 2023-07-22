//package Account;
//
//import java.security.SecureRandom;
//
//public class Container {
//    private Account[] accounts = new Account[20];
//    private int counter;
//
//    public String createAccount(String name) {
//        SecureRandom randomNumber = new SecureRandom();
//        int generateNumber = randomNumber.nextInt(9);
//        String generatedNumberInString = String.valueOf(generateNumber);
//        Account account = new Account(generatedNumberInString, name);
//        accounts[counter] = account;
//        counter ++;
//        return generatedNumberInString;
//    }
//    public int getTotalAccountsInBank() {
//        return counter;
//    }
//
//    public String registerNewCostumer(String firstName,String lastName,String PhoneNumber) {
////        accounts[counter]
//        return null;
//    }
//
//    Bank bankAccount = new Bank();
//
//    @Test
//    public void testThatICreateANewAccountTheSizeOfMyAccountIncreaseBy1() {
//        assertEquals(0, bankAccount.getTotalAccountsInBank());
//        bankAccount.createAccount("olu");
//        assertEquals(1, bankAccount.getTotalAccountsInBank());
//    }
//    @Test
//    public void testICanRegisterANewCostumer() {
//        String costumer = bankAccount.registerNewCostumer("Bernard", "ola", "08022334455");
//        assertEquals(1, costumer);
//    }
//
//}
