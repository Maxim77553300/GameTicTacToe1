package com.leverx.freeman.entity;

import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.steps.StepComputer;

import java.io.IOException;

public class Computer implements Player{

    StepComputer stepComputer = new StepComputer();

    @Override
    public void move(char[][] arr,int[] step) {
        stepComputer.nextStep(arr,step);
    }
}
