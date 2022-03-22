package com.shaker;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall(7, 8);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-2.7);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());


    }
}
