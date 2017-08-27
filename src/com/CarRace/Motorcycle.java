package com.CarRace;

import java.util.ArrayList;
import java.util.Random;

public class Motorcycle {

    static ArrayList<Integer> nameNumber = new ArrayList<>();

    int speed = 100;
    String name;
    int distanceTravelled = 0;

    public Motorcycle(){
        name = "Motorcycle " + Integer.toString(nameNumber.size()+1);
        nameNumber.add(nameNumber.size());
    }

    public void moveForAnHour(Boolean isRaining){

        int speedReduce = 0;
        if (isRaining) {
            Random rnd = new Random();
            speedReduce = rnd.nextInt(46)+5;
        }

        distanceTravelled += speed-speedReduce;
    }
}

