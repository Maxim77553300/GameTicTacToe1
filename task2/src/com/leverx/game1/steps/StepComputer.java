package com.leverx.game1.steps;

import java.util.Random;

public class StepComputer implements NextStep{
    Random random = new Random();
    @Override
    public char[][] nextStep(char[][] arr,String index) {
        int i = random.nextInt(3);
        System.out.println(i);
        int j = random.nextInt(3);
        System.out.println(j);
        if(index != null) {
           arr[i][j] = 'X';
        }
        return arr;

    }
}
