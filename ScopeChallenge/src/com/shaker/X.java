package com.shaker;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x=1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
 // this scope is to help understand scope is and how it works.
// creating variables and class with the same name "x" is considered as bad practices, this is only to help understand scope