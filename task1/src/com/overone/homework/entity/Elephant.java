package com.overone.homework.entity;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Elephant " + getName() + "is eating!");
    }
}
