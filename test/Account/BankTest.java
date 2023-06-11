package Account;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    Bank bank = new Bank("tim","jon","07049182688","sabo road");

    @Test
    public void thatIHaveAConstructorTest(){
        assertNotNull(bank);
    }
    @Test
    public void thatICanHaveAccountTest(){
        Account account = bank.createNewAccounts("tim","jon","07049182688");
       int expected= bank.getTotalAccountsInBank();
        assertEquals(expected, account);

    }

}



