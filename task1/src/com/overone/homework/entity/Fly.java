package com.overone.homework.entity;

public interface Fly {

    void method();

    default  void defaultMethod(){
        System.out.println("HHHHHHH");
    }

    private void method1(){

    }
}
