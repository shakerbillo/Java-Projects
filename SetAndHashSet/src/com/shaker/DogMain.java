package com.shaker;

public class DogMain {
    public static void main(String[] args) {
        GermanSpitz lina = new GermanSpitz("Lina");
        Dog lina2 = new Dog("Lina");

        System.out.println(lina2.equals(lina));
        System.out.println(lina.equals(lina2));
    }
}
