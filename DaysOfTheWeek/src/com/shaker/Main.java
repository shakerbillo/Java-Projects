package com.shaker;

public class Main {

    public static void main(String[] args) {
        printDaysOfTheWeek(-1);
        printDaysOfTheWeek(0);
        printDaysOfTheWeek(1);
        printDaysOfTheWeek(2);
        printDaysOfTheWeek(3);
        printDaysOfTheWeek(4);
        printDaysOfTheWeek(5);
        printDaysOfTheWeek(6);
        printDaysOfTheWeek(8);

    }
    public static void printDaysOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        if (day == 0){
            System.out.println("Sunday");
        } else if ( day == 1){
            System.out.println("Monday ");
        } else if ( day == 2){
            System.out.println("Tuesday ");
        } else if ( day == 3){
            System.out.println("Wednesday");
        } else if ( day == 4){
            System.out.println("Thursday");
        } else if ( day == 5){
            System.out.println("Friday");
        } else if ( day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}

