package com.leverx.game1;

import com.leverx.game1.fill.FillMatrix;
import com.leverx.game1.fill.FillMatrixImpl;
import com.leverx.game1.fill.ShowMatrix;
import com.leverx.game1.fill.StarterFill;
import com.leverx.game1.steps.CheckWin;
import com.leverx.game1.steps.Go;
import com.leverx.game1.steps.StepComputer;
import com.leverx.game1.steps.StepPlayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static StarterFill starterFill = new StarterFill();
    private static CheckWin checkWin = new CheckWin();
    private static FillMatrix showMatrix;
    private static Go step = new Go();
    private static Go step1 = new Go();
    private static char[][] arr = new char[3][3];
    private static String index = null;


    public static void main(String[] args) {

        try {
            methodStart();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void methodStart() throws MyException, IOException {

        starterFill.fill = new FillMatrixImpl();

        int i = 1;

        while (checkWin.win == false) {

            if (i == 1) {
                starterFill.fill.fillMatrix(arr);
            } else {
                step.nextStepGo = new StepPlayer();

                index = inputNumber();
                showMatrix = new ShowMatrix();

                step.go(arr, index);

                step.nextStepGo = new StepComputer();
                step.go(arr, index);
                showMatrix.fillMatrix(arr);
            }
            i++;
            checkWin.checkWinForYou(arr);
        }

    }

    public static String inputNumber() throws MyException {
        String a = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            a = bufferedReader.readLine();

            if (a == null || a.length() > 2) {
                throw new MyException("Error!! Try again!");
            }
        } catch (IOException | MyException e) {
            e.getMessage();
        }
        return a;

    }


}


