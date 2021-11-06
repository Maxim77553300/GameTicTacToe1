package com.leverx.game1.steps;



public class StepPlayer implements NextStep{


    @Override
    public char[][] nextStep(char[][] arr, String index) {

        if(index != null) {
            int i = Integer.parseInt(index.substring(0,1));

            int j = Integer.parseInt(index.substring(1,2));

            arr[i][j] = '0';
        }
        return arr;
    }
}
