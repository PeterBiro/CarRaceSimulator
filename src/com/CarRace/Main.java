package com.CarRace;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*************
     * constants *
     *************/
    static final int raceRounds = 50;
    static final int chanceOfRain = 30;

    static ArrayList<Motorcycle> motorcyclesList = new ArrayList<>();


    /*
    Generating weather conditions for the whole race
     */
    static ArrayList<Boolean> isRaining = new ArrayList<Boolean>() {{
        Random rand = new Random();
        for (int i = 0; i <raceRounds ; i++) {
            add(rand.nextInt(100) < chanceOfRain);
        }
    }};

    public static void createVehicles(){

        //creating motorcycles
        for (int i = 0; i < 10 ; i++) {
            Motorcycle tmpBike = new Motorcycle();
            motorcyclesList.add(tmpBike);
        }

        //
    }

    public static void simulateRace() {

        for (int i = 0; i < raceRounds ; i++) {
            for (Motorcycle bike: motorcyclesList) {
                bike.moveForAnHour(isRaining.get(i));
            }

        }
    }

    public static void printRaceResults() {

        for (Motorcycle bike:motorcyclesList) {
            System.out.println("The motorcycle: '" + bike.name + "' got " + bike.distanceTravelled +" km far");
        }
    }

    public static void main(String[] args) {
        //Main app = new Main();
        createVehicles();
        simulateRace(); // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults(); // prints each vehicle's name, distance traveled ant type.

    }
}

