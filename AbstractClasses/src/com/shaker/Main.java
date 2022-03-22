package com.shaker;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Chico");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Mr. Dolittle");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Oreo");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
