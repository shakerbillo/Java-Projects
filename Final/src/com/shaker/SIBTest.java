package com.shaker;

public class SIBTest { // Static Initialization Block Test
    public static final String owner;

    static {
        owner = "emmanuel";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }
    static {
        System.out.println("2nd initialization block called");
    }
    public void someMethod(){
        System.out.println("someMethod called");
    }
}
