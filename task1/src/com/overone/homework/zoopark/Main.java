package com.overone.homework.zoopark;

import com.overone.homework.entity.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Elephant elephant = new Elephant("Rob", 2);
        elephant.setHungry(false);
        elephant.setHealth(true);
        Horse horse = new Horse("Luna", 2);
        horse.setHungry(true);
        horse.setHealth(false);
        Cat cat = new Cat("Banderos", 3);
        cat.setHungry(true);
        cat.setHealth(false);
        Walrus walrus = new Walrus("Morge", 5);
        walrus.setHealth(false);
        walrus.setHungry(false);


        Animal[] animals = {elephant, horse, cat};

        Workman workman = new Workman("Sergey", 18);
        VetDoctor doctor = new VetDoctor("Aibolit");

        Zoo zoo = new Zoo(workman, animals);
        zoo.setWorkman(workman);
        zoo.setDoctor(doctor);

        zoo.workDay();


    }
}
