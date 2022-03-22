package com.shaker;

public class Main {

    public static void main(String[] args) {
       Carpet carpet = new Carpet(5.5);
       Floor floor = new Floor(4.68, 7.0);
       Calculator calculator =  new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet = new Carpet(7.5);
        floor = new Floor(9.3, 6.6);
        calculator =  new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

    }
}
