package com.leverx.game1.steps;

import com.leverx.game1.MyException;

import java.io.IOException;

public interface NextStep {

    char[][] nextStep(char[][] arr, String step) throws MyException, IOException;
}
