package com.shaker;

public class Main {

    public static void main(String[] args) {
	Point first = new Point(7,9);
    Point second = new Point(5, 8);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());
    }
}
