package com.overone.homework.entity;

public class VetDoctor extends ServiceHuman {

    public VetDoctor(String name) {
        super(name);
    }

    @Override
    public void work(Animal animal) {
        if (!animal.isHealth()) {
            System.out.println("Doctor cured " + animal.getName());
            animal.setHealth(true);
        } else {
            System.out.println(animal.getName() + " is healthy");
        }
    }
}
