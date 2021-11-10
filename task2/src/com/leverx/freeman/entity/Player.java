package com.leverx.freeman.entity;

import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.steps.NextStep;

public interface Player {

    void move(char[][] arr,int[] step) throws MyException;

}
