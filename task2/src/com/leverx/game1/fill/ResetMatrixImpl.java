package com.leverx.game1.fill;

import com.leverx.game1.fill.FillMatrix;

public class ResetMatrixImpl implements FillMatrix {
    @Override
    public void fillMatrix(char[][] array) {

        for(int i=0;i< array.length;i++){
            for(int j = 0;j<array.length;j++){
                array[i][j] = 'X';
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
