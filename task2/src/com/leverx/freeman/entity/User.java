package com.leverx.freeman.entity;

public class User implements Player {

    private String view;

    private String aliasName;

    public User(String name) {
        this.view = name;
    }

    public User(String name, String aliasName) {
        this.view = name;
        this.aliasName = aliasName;
    }

    @Override
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String getView() {
        return view;
    }
}
