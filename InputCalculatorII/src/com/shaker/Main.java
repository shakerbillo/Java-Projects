package com.shaker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){

            boolean isAntInt = scanner.hasNextInt();

            if(isAntInt){
                int number = scanner.nextInt();

                sum += number;
                count++;

            }else{
                break;
            }
        }

        System.out.println("SUM = " + sum + "AVG = " + Math.round((double) sum/count));

       scanner.close();

    }
}
