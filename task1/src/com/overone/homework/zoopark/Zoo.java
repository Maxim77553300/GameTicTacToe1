package com.overone.homework.zoopark;

import com.overone.homework.entity.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Zoo {

    private ServiceHuman doctor;
    private Horse horse;
    private Cat cat;
    private Elephant elephant;
    private Walrus walrus;
    private Dog dog;
    private Workman workman;
    private Animal animals[] = {horse, cat, elephant, walrus, dog};

    public Zoo(Workman workman, Animal[] animals) {
        this.animals = animals;
        this.doctor = doctor;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public ServiceHuman getDoctor() {
        return doctor;
    }

    public void setDoctor(ServiceHuman doctor) {
        this.doctor = doctor;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Elephant getElephant() {
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        this.elephant = elephant;
    }

    public Walrus getWalrus() {
        return walrus;
    }

    public void setWalrus(Walrus walrus) {
        this.walrus = walrus;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Workman getWorkman() {
        return workman;
    }

    public void setWorkman(Workman workman) {
        this.workman = workman;
    }


    public void workDay() throws InterruptedException {

        System.out.println("Day has begun");
        Date date = new Date();
        SimpleDateFormat format1;
        format1 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Today is " + format1.format(date));
        System.out.println("Worker "  + workman.getName() + " is going to feed animals");
        //here will be code, worker feeding animals of ZOO
        System.out.println("The first eating in the morning:");
        for (Animal animal : animals) {

            Thread.sleep(2000);
            workman.work(animal);
        }

        Thread.sleep(2000);
        System.out.println("Doctor is going to check animals, if animal is not health, doctor will shine them");
        for (Animal animal : animals) {

            doctor.work(animal);
            Thread.sleep(2000);
        }
        System.out.println("Second eating in the evening:");
        for (Animal animal : animals) {
            Thread.sleep(2000);
            workman.work(animal);
        }
        System.out.println("Day is over");
    }

}
