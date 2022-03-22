package com.shaker;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car jaguar = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
