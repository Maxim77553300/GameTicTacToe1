package com.leverx.game1.steps;


import com.leverx.game1.MyException;

import java.io.IOException;

public class StepPlayer implements NextStep {


    @Override
    public char[][] nextStep(char[][] arr, String index) throws IOException, MyException {

        int i = Integer.parseInt(index.substring(0, 1));

        int j = Integer.parseInt(index.substring(1, 2));
        if (arr[i][j] == '|') {
            arr[i][j] = '0';
        } else {
            throw new MyException("Error! This place is occupated");

        }

        return arr;
    }
}
