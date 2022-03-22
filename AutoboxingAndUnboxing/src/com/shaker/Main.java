package com.shaker;

import java.util.ArrayList;


class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
       String[] strArray = new String[10];
       int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Emmanuel");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(60));
        Integer integer = new Integer(60);
        Double doubleValue = new Double(12.45);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i)); // taking primitive type (Autoboxing)
        }
        for(int i=0; i<=10; i++){
            System.out.println(i + " --> " + intArrayList.get(i).intValue()); // taking it from the object repper and converting back to a primitive type (unboxing)
        }

        System.out.println("**********************************************");

        Integer myIntValue = 65; // Integer.valueOf(65);
        int myInt = myIntValue.intValue(); // myInt.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<Double>();
        for(Double dbl=0.0; dbl<=10.0; dbl +=0.5){
            myDoubleValue.add(Double.valueOf(dbl)); // Autoboxing
        }
        for(int i=0; i<myDoubleValue.size(); i++ ){
            double value = myDoubleValue.get(i).doubleValue(); // unboxing converting back to primitive type
            System.out.println(i + " --> " + value);
        }
    }
}


