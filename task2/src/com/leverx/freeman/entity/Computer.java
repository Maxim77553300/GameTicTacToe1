package com.leverx.freeman.entity;

public class Computer implements Player {

    private String name;

    private String aliasName;

    public Computer(String name) {
        this.name = name;
    }

    public Computer(String name, String aliasName) {
        this.name = name;
        this.aliasName = aliasName;
    }

    @Override
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
