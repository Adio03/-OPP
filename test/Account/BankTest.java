package Account;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank bank = new Bank();

    @Test
    public void thatIHaveAConstructorTest() {
        assertNotNull(bank);
    }

    @Test
    public void testThatICanCreateAccountTest() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
    }
    @Test
    public void testToGenerateAccountNumberTest() {
        String expected = bank.generateAccountNumber("07049182688");
        assertEquals(expected, bank.generateAccountNumber(expected));
    }

    @Test
    public void testToDepositToAccountThroughBank() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455", 10_000);
        int amountExpected = 10_000;
        assertEquals(amountExpected, bank.checkAccountBalanceInBank("7022334455", "1234"));

    }
    @Test
    public void test_That_Negative_Amount_Can_Not_Deposit_Test() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        assertThrows(IllegalArgumentException.class, () ->
                bank.depositToAccount("7022334455", -10_000));
    }
    @Test
    public void test_That_Amount_Should_Not_Be_Deposit_If_The_AccountNumber_Is_Incorrect_Test() {
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        assertThrows(IllegalArgumentException.class, () ->
                bank.depositToAccount("7022334422", 10_000));
    }
    @Test
    public void test_Test_That_I_Can_Withdraw_From_Account_Test(){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455",10_000.00);
        double expects = 10_000.00;
        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
        bank.withdrawFromAccount("7022334455","1234",5_000.00);
        double expect = 5_000.00;
        assertEquals(expect,bank.checkAccountBalanceInBank("7022334455", "1234"));
    }
    @Test
    public void test_Test_That_Negative_Amount_CanNotBe_Withdraw_From_Account_Test(){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455",10_000.00);
        double expects = 10_000.00;
        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
        assertThrows(IllegalArgumentException.class,() -> bank.withdrawFromAccount("7022334455","1234",-5_000.00));
    }
    @Test
    public void test_Test_That_Amount_GreaterThan_Balance_CanNotBe_Withdraw_From_Account_Test(){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455",10_000.00);
        double expects = 10_000.00;
        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
        assertThrows(IllegalArgumentException.class,() -> bank.withdrawFromAccount("7022334455","1234",20_000.00));
    }
    @Test
    public void test_Test_That__Amount_CanNotBe_Withdraw_if_Pin_is_Not_Correct_From_Account_Test(){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455",10_000.00);
        double expects = 10_000.00;
        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
        assertThrows(IllegalArgumentException.class,() -> bank.withdrawFromAccount("7022334455","2234",5_000.00));
    }
    @Test
    public void test_Test_That__Amount_CanNotBe_Withdraw_if_AccountNumber_is_Not_Correct_From_Account_Test(){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setFirstName("olayemi");
        accountDTO.setLastName("olawale");
        accountDTO.setPhoneNumber("07022334455");
        accountDTO.setPins("1234");
        bank.createNewAccounts(accountDTO);
        int expected = 1;
        assertEquals(expected, bank.getTotalAccountsInBank());
        bank.depositToAccount("7022334455",10_000.00);
        double expects = 10_000.00;
        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
        assertThrows(IllegalArgumentException.class,() -> bank.withdrawFromAccount("7022367455","2234",5_000.00));
    }
//    @Test
//    public void testThatMoney_CanBeTransFer_In_The_Bank_Test(){
//        bank.createNewAccounts("olayemi", "olawale", "07022334455", "1234");
//        int expected = 1;
//        assertEquals(expected, bank.getTotalAccountsInBank());
//        bank.depositToAccount("7022334455",10_000.00);
//        double expects = 10_000.00;
//        assertEquals(expects,bank.checkAccountBalanceInBank("7022334455", "1234"));
//        bank.transferFundInTheBank("olayemi", "olawale", "07022334455", "1234",4_000.00,"babatunde","Ace","8033445566");
//        double expect = 6_000.00;
//        assertEquals(expect,bank.checkAccountBalanceInBank("7022334455","1234"));
//
//    }







}





