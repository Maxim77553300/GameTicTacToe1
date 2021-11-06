package com.leverx.game1;

import com.leverx.game1.fill.FillMatrix;
import com.leverx.game1.fill.FillMatrixImpl;
import com.leverx.game1.fill.ShowMatrix;
import com.leverx.game1.fill.StarterFill;
import com.leverx.game1.steps.CheckWin;
import com.leverx.game1.steps.NextStep;
import com.leverx.game1.steps.StepComputer;
import com.leverx.game1.steps.StepPlayer;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        char[][] arr = new char[3][3];
        int i = 1;

        StarterFill starterFill = new StarterFill();
        starterFill.fill = new FillMatrixImpl();
        CheckWin checkWin = new CheckWin();

        while (i < 9) {

            NextStep nextStep = new StepPlayer();

            if(i == 1){

            starterFill.fill.fillMatrix(arr);}
            else {
                Scanner scanner = new Scanner(System.in);
                String index = scanner.nextLine();

                FillMatrix showMatrix = new ShowMatrix();

                nextStep.nextStep(arr, index);

                NextStep nextStep1 = new StepComputer();
                nextStep1.nextStep(arr, index);
                showMatrix.fillMatrix(arr);
            }
            i++;
            checkWin.checkHorizontal(arr);
            checkWin.checkVertical(arr);
            checkWin.checkDiagonal1(arr);
            checkWin.checkDiagonal2(arr);
        }
    }

}


