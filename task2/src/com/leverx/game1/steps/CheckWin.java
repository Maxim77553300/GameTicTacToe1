package com.leverx.game1.steps;

public class CheckWin {

    public boolean win = false;

    public boolean checkWinForYou(char[][] arr) {

        if (checkDiagonal1(arr)) {
            win = true;
        } else if (checkDiagonal2(arr)) {
            win = true;
        } else if (checkHorizontal(arr)) {
            win = true;
        } else if (checkVertical(arr)) {
            win = true;
        }
        return win;
    }

    private boolean checkDiagonal1(char[][] arr) {
        int diagonal = 1;
        int start1 = arr[0][0];
        char symbol;


        if (start1 != '|') {
            symbol = arr[0][0];
            for (int i = 1; i < 3; i++) {
                if (arr[i][i] == symbol) {
                    diagonal++;
                }
            }
            if (diagonal == 3 && symbol == '0') {
                System.out.println("You Win!!");
                return true;
            } else if (diagonal == 3 && symbol == 'X') {
                System.out.println("Computer Win!!");
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonal2(char[][] arr) {

        int diagonal = 0;
        char symbol;
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
            symbol = arr[0][count];
            for (int i = 0; i <= count; i++) {
                for (int j = count; j >= 0; j--) {
                    if (arr[i][j] == symbol) {
                        diagonal++;
                        System.out.println(diagonal + "check");
                    }
                }
            }
            if (diagonal == 3 && symbol == '0') {
                System.out.println("You Win!!");
                return true;
            } else if (diagonal == 3 && symbol == 'X') {
                System.out.println("Computer Win!!");
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
                    vertical0++;
                } else if (arr[i][j] == arr[i + 1][j] && arr[i][j] == 'X') {
                    verticalX++;
                }
            }
            if (vertical0 == 3) {
                System.out.println("You Win!!");
                return true;
            } else if (verticalX == 3) {
                System.out.println("Computer Win!!");
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
                    horizontal0++;
                } else if (arr[i][j] == arr[i][j + 1] && arr[i][j] == 'X') {
                    horizontalX++;
                }
            }
            if (horizontal0 == 3) {
                System.out.println("You Win!!");
                return true;
            } else if (horizontalX == 3) {
                System.out.println("Computer Win!!");
                return true;
            }
        }

        return false;
    }
}
