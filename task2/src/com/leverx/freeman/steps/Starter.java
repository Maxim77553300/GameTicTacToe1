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
import java.util.Scanner;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Starter {

    private StarterFill starterFill = new StarterFill();
    private CheckWin checkWin = new CheckWin();
    private FillMatrix showMatrix;
    private char[][] arr = new char[3][3];
    private int[] index = null;

    public void methodStart() throws MyException, IOException {

        List<Player> listPlayers = choicePlayer();

        StepPlayers stepPlayers = new StepPlayersImpl();

        starterFill.fill = new FillMatrixImpl();

        int i = 1;

        starterFill.fill.fillMatrix(arr);


        while (!checkWin.win) {
            showMatrix = new ShowMatrix();

            if (listPlayers.get(0).getClass() == User.class) {
                index = inputNumber();
                stepPlayers.doStep(arr, index, listPlayers);

            }

            if (listPlayers.get(0).getClass() == Computer.class) {
                stepPlayers.doStep(arr, index, listPlayers);
                showMatrix.fillMatrix(arr);
            }
            stepPlayers.doStep(arr, index, listPlayers);
            showMatrix.fillMatrix(arr);

            checkWin.checkWinForYou(arr);

        }

    }

    public int[] inputNumber() {
        String a = null;
        int[] coordinate = new int[2];

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            a = bufferedReader.readLine();

            if (a != null || a.length() < 2 || isNumber(a) == true) {

                coordinate[0] = Integer.parseInt(a.substring(0, 1));
                coordinate[1] = Integer.parseInt(a.substring(1, 2));

            } else {
                throw new MyException(Output.error1);
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
        System.out.println(Output.choice);
        String a = scanner.nextLine();

        switch (a) {
            case "1":
                list.add(new User("0"));
                list.add(new Computer("X"));
                System.out.println(Output.HvsC);
                break;
            case "2":
                list.add(new Computer("0"));
                list.add(new Computer("X"));
                System.out.println(Output.CvsC);
                break;
            case "3":
                list.add(new User("0"));
                list.add(new User("X"));
                System.out.println(Output.HvsH);
                break;
            default:
                System.out.println(Output.error1);
                break;
        }
        return list;
    }
}
