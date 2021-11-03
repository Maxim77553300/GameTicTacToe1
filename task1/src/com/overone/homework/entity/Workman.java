package com.overone.homework.entity;

import java.util.Date;

public class Workman extends ServiceHuman {

    public Workman(String name, int i) {
        super(name);
    }

    @Override
    public void work(Animal animal) {

        if (!animal.isHungry()) {
            animal.eat();
        } else {
            System.out.println(animal.getName() + " isn't hungry");
        }


    }

}
