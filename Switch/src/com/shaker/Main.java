package com.shaker;


public class Main {

    public static void main(String[] args) {
	int value = 3;
	if(value ==1){
        System.out.println("Value was 1");
    }else if (value == 2){
        System.out.println("Value was 2");
    }else{
        System.out.println("Was not 1 or 2");
    }
	int switchValue = 3;
	switch (switchValue){
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was a 3, or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;
        default:
            System.out.println("Was not 1, 2, 3, 4, or 5");
            break;
    }
        char charValue = 'K';
	switch (charValue){
        case 'A':
            System.out.println("Values was A");
            break;
        case 'B' :
            System.out.println("Value was B");
            break;
        case 'C' :
            System.out.println("value was C");
            break;
        case 'D' :
            System.out.println("Value was D");
            break;
        case 'E' :
            System.out.println("Value was E");
            break;
        case 'F': case 'G': case 'H': case 'I': case 'J': case 'K':
            System.out.println("Value was " + charValue);
            break;
        default:
            System.out.println("Value not found");
            break;
    }
    String month = "September";
	switch (month){
        case "January": case "February": case "March": case "April": case "May": case "June": case "July":
        case "August": case "September": case "October": case "November": case "December":
            System.out.println("Month is " + month);
            break;
        default:
            System.out.println("Not sure");
            break;
    }

    }



}
