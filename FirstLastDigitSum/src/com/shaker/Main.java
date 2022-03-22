package com.shaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int sumFirstAndLastDigit(int number){
       if (number <0){
           return -1;

        }
       int lastDigit = number % 10;
       while (number > 9){
           number /= 10;
       }
       return lastDigit + number;
    }
}

