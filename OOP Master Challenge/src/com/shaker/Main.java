package com.shaker;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "Sausage", 14.79, "White");
    double price = hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("Tomato", 1.5);
    hamburger.addHamburgerAddition2("Lettuce", 3.8);
    hamburger.addHamburgerAddition3("Cheese", 5);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 90);
    healthyBurger.addHamburgerAddition1("Egg", 10);
    healthyBurger.addHealthAddition1("Lentils", 7);
    System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

    DeluxeBurger deluxeBurger = new DeluxeBurger();
    deluxeBurger.addHamburgerAddition3("Can't Add", 49);
    deluxeBurger.itemizeHamburger();


    }
}
