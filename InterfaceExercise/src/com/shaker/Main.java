package com.shaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player emmanuel = new Player("Emmanuel", 20, 30);
        System.out.println(emmanuel.toString());
        saveObject(emmanuel);

        emmanuel.setHitPoints(10);
        System.out.println(emmanuel);
        emmanuel.setWeapon("Cutlass");
        saveObject(emmanuel);
//        loadObject(emmanuel);
        System.out.println(emmanuel);

        ISaveable freak = new Monster("Freak", 15, 35);
        System.out.println("Strength = " +((Monster) freak).getStrength());
        System.out.println(freak);
        saveObject(freak);


    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}