package com.leverx.freeman.fill;

public class FillMatrixImpl implements FillMatrix {

    @Override
    public void fillMatrix(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '|';
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
