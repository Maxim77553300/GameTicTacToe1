package com.leverx.freeman.steps;

import com.leverx.freeman.exceptions.MyException;

import java.io.IOException;

public interface NextStep {

    char[][] nextStep(char[][] arr, String step) throws MyException, IOException;
}
