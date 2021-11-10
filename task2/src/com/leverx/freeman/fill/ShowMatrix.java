package com.leverx.freeman.fill;

import java.util.ResourceBundle;

public class ShowMatrix implements FillMatrix {
    private ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    private String step = bundle.getString("step");
    @Override
    public void fillMatrix(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
      //  System.out.println(step);
    }
}

