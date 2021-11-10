package com.leverx.freeman.steps;

import com.leverx.freeman.entity.Computer;
import com.leverx.freeman.entity.Player;
import com.leverx.freeman.entity.User;
import com.leverx.freeman.exceptions.MyException;
import com.leverx.freeman.fill.FillMatrix;
import com.leverx.freeman.fill.FillMatrixImpl;
import com.leverx.freeman.fill.ShowMatrix;
import com.leverx.freeman.fill.StarterFill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Starter {


    private ResourceBundle bundle = ResourceBundle.getBundle("com.leverx.freeman.resources.messages");
    private String error1 = bundle.getString("error1");
    private StarterFill starterFill = new StarterFill();
    private CheckWin checkWin = new CheckWin();
    private FillMatrix showMatrix;
    private Go step = new Go();
    private char[][] arr = new char[3][3];
    private int[] index = null;

    public void methodStart() throws MyException, IOException {


        starterFill.fill = new FillMatrixImpl();

        int i = 1;

        do {
            starterFill.fill.fillMatrix(arr);
            i--;
        } while (i == 1);

        while (checkWin.win == false) {

            step.nextStepGo = new StepPlayer();

            index = inputNumber();
            showMatrix = new ShowMatrix();

            step.go(arr, index);

            step.nextStepGo = new StepComputer();
            step.go(arr, index);
            showMatrix.fillMatrix(arr);

            checkWin.checkWinForYou(arr);
        }

    }

    public int[] inputNumber() throws MyException {
        String a = null;
        int[] coordinate = new int[2];

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            a = bufferedReader.readLine();

            if (a != null || a.length() < 2 || isNumber(a) == true) {

                coordinate[0] = Integer.parseInt(a.substring(0, 1));
                coordinate[1] = Integer.parseInt(a.substring(1, 2));

            } else {
                throw new MyException(error1);
            }
            return coordinate;

        } catch (IOException | MyException e) {
            e.getMessage();
        }

        return coordinate;

    }

    public List<Player> choicePlayer() {
        List<Player> list = new ArrayList<>(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, make your choice Type: 1 - Game Human vs Computer \n 2 - Game Computer vs Computer \n 3 - Game Human vs Human");
        String a = scanner.nextLine();

        switch (a){
            case "1" :
            list.add(new User());
            list.add(new Computer());
            break;
            case "2" :
            list.add(new Computer());
            list.add(new Computer());
            break;
            case "3" :
            list.add(new User());
            list.add(new User());
            break;
            default:
                System.out.println(error1);
                break;
        }
        return list;
    }
}
