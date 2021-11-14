package com.leverx.freeman.entity;

public class Computer implements Player {

    private String view;

    private String aliasName;

    private boolean win;

    public Computer(String name) {
        this.view = name;
    }

    public Computer(String name, String aliasName) {
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

    @Override
    public boolean isWin() {
        return win;
    }

    @Override
    public void setWin(boolean win) {
        this.win = win;
    }
}
