package com.shaker;

public class Main {

    public static void main(String[] args) {
        getDaysInMonth(3, 2020);

    }
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        } else if (year % 4 == 0 && year % 100 != 0|| year % 400 == 0 ){
            return true;
        } else {
        }    return false;
    }
    public static int getDaysInMonth(int month, int year){
        if ((month < 1) || (month > 12) || (year < 1 || year > 9999)){
            return -1;
        }
        switch (month){
            case 1:
            case 12:
            case 10:
            case 8:
            case 7:
            case 3:
            case 5:
                return 31;

            case 2:
                if (isLeapYear((year)))
                return 29;
                return 28;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
               break;

        }


        return month;
    }
}


