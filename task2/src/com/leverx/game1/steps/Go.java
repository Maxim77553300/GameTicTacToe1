package com.leverx.game1.steps;

import com.leverx.game1.MyException;

import java.io.IOException;

public class Go {

    public NextStep nextStepGo;

    public void go(char[][] arr,String step) throws MyException, IOException {
        nextStepGo.nextStep(arr,step);
    }
}
