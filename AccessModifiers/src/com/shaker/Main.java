package com.shaker;

public class Main {

    public static void main(String[] args) {
	 Account emmanuelsAccount = new Account("Emmanuel");
     emmanuelsAccount.deposit(2500);
     emmanuelsAccount.withdraw(300);
     emmanuelsAccount.withdraw(-500);
     emmanuelsAccount.deposit(-200);
     emmanuelsAccount.calculateBalance();
//     emmanuelsAccount.balance = 7000;

        System.out.println("Balance on account is " + emmanuelsAccount.getBalance());
//        emmanuelsAccount.transactions.add(4800);
//        emmanuelsAccount.calculateBalance();
    }
}
