package com.leverx.freeman;

import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.steps.Starter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Starter starter = new Starter();

        try {
            starter.methodStart();
        } catch (MyException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


