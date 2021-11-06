package com.leverx.game1.fill;

public class ShowMatrix implements FillMatrix {

    @Override
    public void fillMatrix(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--Make your step, please--");
    }
}

