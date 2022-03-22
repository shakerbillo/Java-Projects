package com.shaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int row = 1;
        int col = 1;

        while (row <= number) {
            col = 1;
            while (col <= number) {
                if (col == 1 || col == number || row == 1 || row == number || row == col || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            row++;
            System.out.println();
        }
    }
}

