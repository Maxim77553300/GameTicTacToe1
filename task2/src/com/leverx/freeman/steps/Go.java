package com.leverx.freeman.steps;

import com.leverx.freeman.exceptions.MyException;

import java.io.IOException;

public class Go {

    public NextStep nextStepGo;

    public void go(char[][] arr,String step) throws MyException, IOException {
        nextStepGo.nextStep(arr,step);
    }
}
