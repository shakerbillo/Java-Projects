package com.shaker;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int [] myIntegers =  getIntegers(10);
    int[] sorted = sortIntegers(myIntegers);
    printArray(sorted);

    }
    public static int[] getIntegers(int size){
        int [] array = new int[size];
        System.out.println("Enter " + size + " integer :\r");
        for(int i=0; i<array.length; i++){
            array[i]= scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Enter " + i + " contents " + array[i]);
        }
    }
        public static int[] sortIntegers(int[] array){
            int[] sortedArray =  new int[array.length];
            for(int i=0; i<array.length; i++){
                sortedArray[i] = array[i];
            }
//            int [] sortedArray = Arrays.copyOf(array, array.length); // another way to write the function above after the sortIntegers method.

            boolean swap = true;
            int get;

            while(swap){
                swap = false;
                for(int i=0; i<sortedArray.length-1; i++){
                    if(sortedArray[i] < sortedArray[i+1]){
                        get = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = get;
                        swap = true;
                    }

                }
            }

        return sortedArray;
}
}


