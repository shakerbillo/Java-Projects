package com.shaker;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



    }
    private static int readIntegers(){
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.close();
        return capacity;
    }


    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
       int[] array = new int[number];
       for(int i=0; i<array.length; i++){
           int value = scanner.nextInt();;
           scanner.nextLine();
           array[i] = value;
       }
       return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
