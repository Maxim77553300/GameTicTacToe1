package com.leverx.freeman.entity;

public class User implements Player {

    private String name;

    private String aliasName;

    public User(String name, String aliasName) {
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

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName1() {
        return getName();
    }
}
