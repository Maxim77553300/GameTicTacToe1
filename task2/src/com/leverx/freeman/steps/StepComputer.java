package com.leverx.freeman.steps;

import java.util.Random;

public class StepComputer implements NextStep {
    Random random = new Random();

    @Override
    public char[][] nextStep(char[][] arr, int[] index) {

        int i = random.nextInt(3);

        int j = random.nextInt(3);

        if (index != null && arr[i][j] == '|') {
            arr[i][j] = 'X';
        } else {

        }
        return arr;

    }
}
