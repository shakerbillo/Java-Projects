package com.shaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSharedDigit(int x, int y ){
        if (x >= 10 && x <=99 && y >= 10 && y <= 99){
            int num1first = x/10;
            int num1last = x%10;
            int num2first = y/10;
            int num2last = y%10;
            return (num1first == num2first || num1last == num2last ||  num1first == num2last || num2first == num1last);

        }
        return false;

    }
    public static boolean isValid(int num){
        return(num > 9) && (num < 1001);
    }
    public static boolean hasSameLastDigit(int x, int y, int z){
        if(isValid(x) && isValid(y) && isValid(z)){
            x %= 10;
            y %= 10;
            z %= 10;
            return (x == y || y == z || x == z );
        }
        return false;
}




    public static boolean isValid(int num){
        return (num >= 10) && (num <= 1000);
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }