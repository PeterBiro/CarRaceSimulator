package com.CarRace;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    /*************
     * constants *
     *************/
    static final int raceRounds = 50;
    static final int chanceOfRain = 30;


    /*
    Generating weather conditions for the whole race
     */
    static ArrayList<Boolean> isRaining = new ArrayList<Boolean>() {{
        Random rand = new Random();
        for (int i = 0; i <raceRounds ; i++) {
            add(rand.nextInt(100) < chanceOfRain);
        }
    }};


    //30% chance of rain every hour
    /*
    createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
    simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
    printRaceResults() // prints each vehicle's name, distance traveled ant type.
    */

    public static void main(String[] args) {

        //createVehicles(); // creates 10 cars, 10 trucks and 10 motorcycles
        //simulateRace(); // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        //printRaceResults(); // prints each vehicle's name, distance traveled ant type.

    }
}
