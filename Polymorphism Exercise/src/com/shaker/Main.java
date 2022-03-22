package com.shaker;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinders = cylinder;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name) {
        super(cylinder, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + "-> startEngine()";
    }
    public String accelerate(){
        return getClass().getSimpleName() + "-> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + "-> startEngine()";
    }
    public String accelerate(){
        return getClass().getSimpleName() + "-> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName() + "-> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinder, String name) {
        super(cylinder, name);
    }
    public String startEngine(){
        return getClass().getSimpleName() + "-> startEngine()";
    }
    public String accelerate(){
        return getClass().getSimpleName() + "-> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName() + "-> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(8, "Base car");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden holden = new Holden(8, "Base car");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        Ford ford = new Ford(8, "Base car");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

}
