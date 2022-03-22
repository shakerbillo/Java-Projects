package com.shaker;

public class Main {

    public static void main(String[] args) {
        int newScore = calculatedScore("Emmanuel", 500);
        System.out.println("New score is " + newScore);
        calculatedScore(75);
        calculatedScore();

        double centimeters = calFeetAndInchesToCenrimeters(6, 0);
        if(centimeters <0.0){
            System.out.println("Invalid feet or inches parameters");
        }
        calFeetAndInchesToCenrimeters(154);


    }

    public static int calculatedScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculatedScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculatedScore() {
        System.out.println("No player name, no player score.");
        return 0;


    }



    public static double calFeetAndInchesToCenrimeters(double feet, double inches){
        if((feet < 0) || (inches < 0 ) || (inches > 12)){
            System.out.println("Invalid feet or inches parameters");
            return -1; // This is a good wey to test validation
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " cm");
        return centimeters;

    }
    public static double calFeetAndInchesToCenrimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is ewaul to " + " feet and " + remainingInches + " inches");
        return calFeetAndInchesToCenrimeters(feet, remainingInches);
    }


}