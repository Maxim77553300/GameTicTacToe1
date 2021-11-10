package com.leverx.freeman.steps;


import com.leverx.freeman.exceptions.MyException;

import java.io.IOException;
import java.util.ResourceBundle;

public class StepPlayer implements NextStep {

    private ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    private String error2 = bundle.getString("error2");

    @Override
    public char[][] nextStep(char[][] arr, int[] index) throws MyException {

        int i = index[0];

        int j = index[1];

        if (arr[i][j] == '|') {
            arr[i][j] = '0';
        } else {
            System.out.println(error2);
//            Starter starter = new Starter();
//            starter.inputNumber();

        }

        return arr;
    }
}
