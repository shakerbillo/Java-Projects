package com.shaker;

public class Main {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        int mySum = myByte + myInt + myShort;

        long myLong = 50000 + (mySum * 10);
        System.out.println(myLong);
    }
}
