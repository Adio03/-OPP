package Account;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;



    public class AccountTest {

        @Test
        public void depositCash1() {
            Account adioAccount = new Account();
            adioAccount.deposit(2000);
            assertEquals(2000, adioAccount.getBalance());
        }

        @Test
        public void depositCash2() {
            Account adioAccount = new Account();
            adioAccount.deposit(-2000);
            assertEquals(0, adioAccount.getBalance());
        }

        @Test
        public void withdrawCash1() {
            Account adioAccount = new Account();
            adioAccount.deposit(5000);
            adioAccount.withdrawal(2000);
            assertEquals(3000, adioAccount.getBalance());
        }

        @Test
        public void withdrawCash2() {
            Account adioAccount = new Account();
            adioAccount.deposit(5000);
            adioAccount.withdrawal(10000);
            assertEquals(5000, adioAccount.getBalance());

        }
        @Test
        public void withdrawCash3() {
            Account adioAccount = new Account();
            adioAccount.deposit(5000);
            adioAccount.withdrawal(-5000);
            assertEquals(5000, adioAccount.getBalance());
        }




    }