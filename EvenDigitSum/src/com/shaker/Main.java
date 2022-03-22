package com.shaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
    }
        int sum = 0;
        int remainder = 0;
        while (number > 0){
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder:0;
            number/=10;

        }
        return sum;
    }
}



//    public static int getEvenDigitSum(int number) {
//        if (number < 0) return -1;
//        int sum = 0;
//        while (number != 0) {
//            sum += (number % 2 == 0) ? (number % 10) : 0;
//            number /= 10;
//        }
//        return sum;
//    }