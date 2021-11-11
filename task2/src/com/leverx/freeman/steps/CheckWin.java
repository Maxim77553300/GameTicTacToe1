package com.leverx.freeman.steps;

import com.leverx.freeman.entity.Player;

public class CheckWin {

    private char symbol;

    public char getSymbol() {
        return symbol;
    }

    public boolean win = false;

    Player player;

    public boolean checkWinForYou(char[][] arr) {

        if (checkDiagonal1(arr)) {
            win = true;
        } else if (checkDiagonal2(arr)) {
            win = true;
        } else if (checkHorizontal(arr)) {
            win = true;
        } else if (checkVertical(arr)) {
            win = true;
        } else if (checkNoneWin(arr)) {
            win = false;
            System.out.println(Output.draw);
            System.exit(1);
        }
        return win;
    }

    private boolean checkDiagonal1(char[][] arr) {
        int diagonal = 1;
        int start1 = arr[0][0];


        if (start1 != '|') {
            symbol = arr[0][0];
            for (int i = 1; i < 3; i++) {
                if (arr[i][i] == symbol) {
                    diagonal++;
                }
            }
            if(checkDiagonal(diagonal)){
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonal2(char[][] arr) {

        int diagonal = 0;
        char start2 = '|';
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (i == 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        start2 = arr[0][count];

        if (start2 != '|') {
            int count1 = 0;
            symbol = arr[0][count];

            while (count >= 0) {
                if (arr[count1][count] == symbol) {
                    diagonal++;

                }
                count--;
                count1++;
            }
            if(checkDiagonal(diagonal)){
                return true;
            }
        }

        return false;

    }

    private boolean checkVertical(char[][] arr) {

        int vertical0 = 1;
        int verticalX = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[i + 1][j] && arr[i][j] == '0') {
                    symbol = '0';
                    vertical0++;
                } else if (arr[i][j] == arr[i + 1][j] && arr[i][j] == 'X') {
                    symbol = 'X';
                    verticalX++;
                }
            }

           if(checkVert(vertical0, verticalX)){
               return true;
           }
        }
        return false;
    }

    private boolean checkHorizontal(char[][] arr) {
        int horizontal0 = 1;
        int horizontalX = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j] == arr[i][j + 1] && arr[i][j] == '0') {
                    symbol = '0';
                    horizontal0++;
                } else if (arr[i][j] == arr[i][j + 1] && arr[i][j] == 'X') {
                    symbol = 'X';
                    horizontalX++;
                }
            }

            if(checkVert(horizontal0, horizontalX)){
                return true;
            }
        }
        return false;
    }

    private boolean checkNoneWin(char[][] arr) {

        int horizontal = 0;

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            size += arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != '|') {
                    horizontal++;
                }
            }
        }
        if (horizontal == size) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonal(int diagonal) {
        if (diagonal == 3 && symbol == '0') {
            System.out.println(Output.youWin);
            return true;
        } else if (diagonal == 3 && symbol == 'X') {
            System.out.println(Output.youWin);
            return true;
        }
        return false;
    }

    private boolean checkVert(int vertical0, int verticalX) {
        if (vertical0 == 3) {
            System.out.println(Output.youWin);
            return true;
        } else if (verticalX == 3) {
            System.out.println(Output.youWin);
            return true;
        }
        return false;
    }
}
