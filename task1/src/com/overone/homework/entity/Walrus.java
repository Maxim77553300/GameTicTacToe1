package com.overone.homework.entity;

public class Walrus extends Animal {
    public Walrus(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("Walrus " + getName() + "is eating!");
    }
}
