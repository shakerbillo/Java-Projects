package com.shaker;

class Car{
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;

    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
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
}

class Jaguar extends Car{
    public Jaguar(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Jaguar -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Jaguar -> accelerate()";
    }

    @Override
    public String brake() {
        return "Jaguar -> brake()";
    }
}
class Lamborghini extends Car{
    public Lamborghini(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Lamborghini -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lamborghini -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lamborghini -> brake()";
    }
}

class Mercedes extends Car{
    public Mercedes(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}



public class Main {

    public static void main(String[] args) {
	Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Jaguar jaguar = new Jaguar(4, " F-Pace ");
        System.out.println(jaguar.startEngine());
        System.out.println(jaguar.brake());
        System.out.println(jaguar.brake());

        Lamborghini lamborghini = new Lamborghini(4, " AVENTADOR LP 780-4 ULTIMAE ");
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.brake());
        System.out.println(lamborghini.brake());

        Mercedes mercedes = new Mercedes(6, " Mercedes-AMG G 63 ");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.brake());
        System.out.println(mercedes.brake());
    }

}


