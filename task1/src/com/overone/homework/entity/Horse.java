package com.overone.homework.entity;

public class Horse extends Animal {
    public Horse(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Horse " + getName() + " is eating!");
    }
}
