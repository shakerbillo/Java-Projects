package com.shaker;

public class Main {

    public static void main(String[] args) {
//	 SomeClass one = new SomeClass("One");
//     SomeClass two = new SomeClass("Two");
//     SomeClass three = new SomeClass("Three");
//
//     System.out.println(one.getInstanceNumber());
//     System.out.println(two.getInstanceNumber());
//     System.out.println(three.getInstanceNumber());
//
//
//        System.out.println(Math.PI);
////        Math m = new Math()
//
//        int pw = 92334567;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(12345);
//        password.letMeIn(232323);
//        password.letMeIn(9090909);
//        password.letMeIn(5757575);
//        password.letMeIn(92334567);

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

    }
}
