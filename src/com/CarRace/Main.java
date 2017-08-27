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
    static ArrayList<Truck> trucksList = new ArrayList<>();
    static ArrayList<Car> carsList = new ArrayList<>();

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

        //creating trucks
        for (int i = 0; i < 10; i++) {
            Truck tmpTruck = new Truck();
            trucksList.add(tmpTruck);
        }

        //creating cars
        for (int i = 0; i < 10 ; i++) {
            Car tmpCar = new Car();
            carsList.add(tmpCar);
        }
    }

    public static void simulateRace() {

        for (int i = 0; i < raceRounds ; i++) {

            for (Motorcycle bike: motorcyclesList) {
                bike.moveForAnHour(isRaining.get(i));
            }

            for (Truck truck: trucksList) {
                truck.moveForAnHour();
            }

            if (isRaining.get(i)) Car.setSpeedLimit(70);
                else Car.setSpeedLimit(110);
            for (Car car: carsList) {

                car.moveForAnHour();
            }
        }
    }

    public static void printRaceResults() {

        for (Motorcycle bike:motorcyclesList) {
            System.out.println("The motorcycle: '" + bike.name + "' got " + bike.distanceTravelled +" km far");
        }

        for (Truck truck:trucksList) {
            System.out.println("The truck: '" + truck.name + "' got " + truck.distanceTravelled +" km far");
        }

        for (Car car:carsList) {
            System.out.println("The car: '" + car.name + "' got " + car.distanceTravelled +" km far");
        }
    }

    public static void main(String[] args) {
        //Main app = new Main(); Melyiknek van értelme? static vagy app.createVehicles();
        createVehicles();
        simulateRace();
        printRaceResults();

    }
}

