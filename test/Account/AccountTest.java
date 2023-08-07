package Account;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;



    public class AccountTest {
        Account account = new Account("Adewale","Olaolu","08022334455","1234");

        @Test
        public void testToSetFirstNameTest(){
            account.setFirstName("Olawale");
            String expected = "Olawale";
            assertEquals(expected,account.getFirstName());
        }
        @Test
        public void testToSetLastNameTest(){
            account.setLastName("Olaniyi");
            String expected = "Olaniyi";
            assertEquals(expected,account.getLastName());

        }
        @Test
        public void testToAddPhoneNumberTest(){
            account.setPhoneNumber("07049182688");
            String expected = "07049182688";
            assertEquals(expected,account.getPhoneNumber());
        }
        @Test
        public void testToConfirmAccountNumber(){
            account.setAccountNumber("07022334455");
            String expected = "07022334455";
            assertEquals(expected,account.getAccountNumber());
        }
        @Test
        public void testForInputOfPinTest(){
            account.setPin("1234");
            String expected ="1234";
            assertEquals(expected,account.confirmPin());
        }

      @Test
        public void test_That_iCan_Deposit_To_Account(){
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected,account.checkBalance("1234"));
        }
        @Test
        public void testThat_ICan_Not_Deposit_Amount_In_BankTest(){
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected,account.checkBalance("1234"));
            assertThrows(IllegalArgumentException.class,() -> { account.deposit(-5_000);});
        }
        @Test
        public void test_That_I_Withdraw_From_AccountTest(){
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected,account.checkBalance("1234"));
            account.withdrawal(5_000,"1234");
            double expects = 5_000;
            assertEquals(expects,account.checkBalance("1234"));
        }
        @Test
        public void test_That_I_Can_Not_Withdraw_MoreThan_What_I_Have_In_Account_Test() {
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected, account.checkBalance("1234"));
            assertThrows(IllegalArgumentException.class, () ->
                account.withdrawal(15_000.00, "1234"));

        }
        @Test
        public void test_That_I_Can_Not_Withdraw_Negative_Amount_Test(){
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected, account.checkBalance("1234"));
            assertThrows(IllegalArgumentException.class, () ->
                account.withdrawal(-5_000.00, "1234"));
    }
        @Test
        public void test_That_I_Can_Not_Withdraw_WrongPin_Amount_Test(){
            account.deposit(10_000.00);
            double expected = 10_000.00;
            assertEquals(expected, account.checkBalance("1234"));
            assertThrows(IllegalArgumentException.class, () ->
                    account.withdrawal(-5_000.00, "2234"));
        }






    }