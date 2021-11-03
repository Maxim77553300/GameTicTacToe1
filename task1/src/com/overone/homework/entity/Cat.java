package com.overone.homework.entity;

import java.sql.SQLOutput;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating!");
    }
}
