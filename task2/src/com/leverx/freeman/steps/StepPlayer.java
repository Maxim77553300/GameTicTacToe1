package com.leverx.freeman.steps;


import com.leverx.freeman.exceptions.MyException;

import java.io.IOException;
import java.util.ResourceBundle;

public class StepPlayer implements NextStep {
     private ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
     private String error2 = bundle.getString("error2");
    @Override
    public char[][] nextStep(char[][] arr, String index) throws IOException, MyException {

        int i = Integer.parseInt(index.substring(0, 1));

        int j = Integer.parseInt(index.substring(1, 2));
        if (arr[i][j] == '|') {
            arr[i][j] = '0';
        } else {
            throw new MyException(error2);

        }

        return arr;
    }
}
