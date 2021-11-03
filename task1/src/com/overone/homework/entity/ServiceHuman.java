package com.overone.homework.entity;

public abstract class ServiceHuman {
    private String name;

    public ServiceHuman(String name) {
        this.name = name;
    }

    public ServiceHuman() {

    }

    public String getName() {
        return name;
    }

    public abstract void work(Animal animal);
}
