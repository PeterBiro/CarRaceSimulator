package com.CarRace;

import java.util.HashSet;
import java.util.Random;

public class Truck {

    static final int breakDownChance = 5;
    static HashSet<Integer> truckNamesSet = new HashSet<>();

    int speed = 100;
    int breakDownTurnsLeft = 0;
    String name;
    int distanceTravelled = 0;

    public Truck(){

        Random rnd = new Random();
        int tmpName = rnd.nextInt(1001);
        while (truckNamesSet.contains(tmpName)){
            tmpName = rnd.nextInt(1001);
        }

        truckNamesSet.add(tmpName);
        name = Integer.toString(tmpName);
    }

    public void moveForAnHour(){

        if (breakDownTurnsLeft>0){
            breakDownTurnsLeft--;
        }else {
            Random rnd = new Random();
            if (rnd.nextInt(100)<breakDownChance){
                breakDownTurnsLeft=1;
            }else {
                distanceTravelled += speed;
            }
        }
    }

}
