package com.leverx.freeman.entity;

import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.steps.StepPlayer;

import java.io.IOException;

public class User implements Player{

    StepPlayer stepPlayer = new StepPlayer();

    @Override
    public void move(char[][] arr,int[] step) throws MyException {
        stepPlayer.nextStep(arr,step);
    }
}
