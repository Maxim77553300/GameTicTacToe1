package com.leverx.freeman.fill;

import com.leverx.freeman.steps.Output;

public class ShowMatrix implements FillMatrix {

    @Override
    public void fillMatrix(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println(Output.getLine());

    }
}

