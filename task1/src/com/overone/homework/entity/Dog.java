package com.overone.homework.entity;

public class Dog extends Animal {

    protected Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ getName()+ " is eating!");
    }
}
