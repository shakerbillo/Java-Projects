package com.shaker;


import java.awt.image.BandCombineOp;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Shaker Billo Bank");

        bank.addBranch("Tema");

        bank.addCustomer("Tema", "Emmanuel", 1000.56);
        bank.addCustomer("Tema", "Moses", 500.53);
        bank.addCustomer("Tema", "Agyei", 600.70);

        bank.addBranch("Brno");
        bank.addCustomer("Brno", "Emmanuel", 50000.56);

        bank.addCustomerTransaction("Tema", "Emmanuel", 70000.56);
        bank.addCustomerTransaction("Tema", "Emmanuel", 705.56);
        bank.addCustomerTransaction("Tema", "Agyei", 20000.45);

        bank.listCustomers("Tema", true);
        bank.listCustomers("Brno", true);

        bank.addBranch("Prague");
        if(!bank.addCustomer("Prague", "Chloe", 1000.50)){
            System.out.println("Error Prague branch does not exist");
        }
        if(!bank.addBranch("Brno")) {
            System.out.println("Brno branch already exist");
        }
        if(!bank.addCustomer("Accra", "Nana", 700.90)) {
            System.out.println("Error Accra branch does not exist");
        }
       if(bank.addBranch("Accra")){
           System.out.println("Accra branch created");
       }
       if(!bank.addCustomerTransaction("Brno", "Reginald", 300.34)){
           System.out.println("Customer does not exist at this branch");
       }
       if(!bank.addCustomer("Tema", "Emmanuel", 4575.45)){
           System.out.println("Customer Emmanuel already exists");
       }

    }
}
