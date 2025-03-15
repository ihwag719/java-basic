package oop1.ex;

import static java.lang.Math.abs;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.desposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: " + account.balance);
    }
}
