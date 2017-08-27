package com.CarRace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Car {

    static final ArrayList<String> carNamePool = new ArrayList<String>(Arrays.asList("Blade",
            "Dragon","Tempest","Storm","Augury", "Grit", "Prospect", "Excursion",
            "Obsidian", "Vigor", "Sanctuary", "Deputy", "Cobra", "Evolution", "Serpent",
            "Might", "Vanish", "Supremacy","Freedom", "Ranger"));

    static HashSet<String>carNamesSet = new HashSet<>();
    static int maxSpeed = 110;

    String name;
    int distanceTravelled = 0;
    int normalSpeed;


    public Car() {

        //setting normal speed
        Random rnd = new Random();
        normalSpeed = rnd.nextInt(31)+80;

        //giving unique name
        String tmpName;
        do {
            String first = carNamePool.get(rnd.nextInt(carNamePool.size()));
            String secound = carNamePool.get(rnd.nextInt(carNamePool.size()));
            tmpName = first + " " + secound;
        }while (carNamesSet.contains(tmpName));
        name = tmpName;
    }

    public static void setSpeedLimit(int limit){
        maxSpeed = limit;
    }

    public void moveForAnHour(){
        distanceTravelled += (normalSpeed < maxSpeed) ? normalSpeed : maxSpeed;
    }
    

}
