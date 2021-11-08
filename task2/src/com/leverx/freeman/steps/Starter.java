package com.leverx.freeman.steps;

import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.fill.FillMatrix;
import com.leverx.freeman.fill.FillMatrixImpl;
import com.leverx.freeman.fill.ShowMatrix;
import com.leverx.freeman.fill.StarterFill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class Starter {


    private ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    private String error1 = bundle.getString("error1");
    private StarterFill starterFill = new StarterFill();
    private CheckWin checkWin = new CheckWin();
    private FillMatrix showMatrix;
    private Go step = new Go();
    private char[][] arr = new char[3][3];
    private String index = null;

    public void methodStart() throws MyException, IOException {

        starterFill.fill = new FillMatrixImpl();

        int i = 1;

        do{
            starterFill.fill.fillMatrix(arr);
             i--;
        } while (i == 1);

        while (checkWin.win == false) {

                step.nextStepGo = new StepPlayer();

                index = inputNumber();
                showMatrix = new ShowMatrix();

                step.go(arr, index);

                step.nextStepGo = new StepComputer();
                step.go(arr, index);
                showMatrix.fillMatrix(arr);

            checkWin.checkWinForYou(arr);
        }

    }

    private String inputNumber() throws MyException {
        String a = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            a = bufferedReader.readLine();

            if (a == null || a.length() > 2) {
                throw new MyException(error1);
            }
        } catch (IOException | MyException e) {
            e.getMessage();
        }
        return a;

    }
}
