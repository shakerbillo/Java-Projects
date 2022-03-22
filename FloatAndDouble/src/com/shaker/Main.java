package com.shaker;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value =" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value =" + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f /3f;
        double myDoubleValue =5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue =" + myFloatValue);
        System.out.println("MyDoubleValue =" + myDoubleValue);

        // Challenge
        int poundToKilo = 5;
        double kilo = 0.45359237;
        System.out.println(" 5 pounds converted to kilogram = " + poundToKilo * kilo );

        // or
        double kilos = poundToKilo * kilo;
        System.out.println(kilos);

        // or

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("Converted Kilogram =" + convertedKilograms);

    }
}
