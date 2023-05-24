package Chapter5;

import Account.Account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("vicky");
        System.out.println(("before changeAccountName::" + account));
        changeAccountName(account);
        System.out.println("after changeAccount::" + account);

    }
    private static void changeAccountName( Account account){
        account.setName("david");


    }

}
