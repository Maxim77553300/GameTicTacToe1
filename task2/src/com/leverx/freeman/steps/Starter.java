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
    protected static int count = 0;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void methodStart() {
        try {

            List<Player> listPlayers = choicePlayer();
            StepPlayers stepPlayers = new StepPlayersImpl();
            starterFill.fill = new FillMatrixImpl();
            int i = 1;
            starterFill.fill.fillMatrix(arr);

            while (!checkWin.win) {
                showMatrix = new ShowMatrix();

                if (listPlayers.get(0).getClass() == User.class && listPlayers.get(1).getClass() == Computer.class) {
                    index = inputNumber();
                    stepPlayers.doStep(arr, index, listPlayers);
                }

                if (listPlayers.get(0).getClass() == Computer.class) {
                    stepPlayers.doStep(arr, index, listPlayers);
                    showMatrix.fillMatrix(arr);
                    stepPlayers.doStep(arr, index, listPlayers);
                }

                if (listPlayers.get(0).getClass() == User.class && listPlayers.get(1).getClass() == User.class) {
                    index = inputNumber();
                    stepPlayers.doStep(arr, index, listPlayers);
                    count++;
                    index = inputNumber();
                    stepPlayers.doStep(arr, index, listPlayers);
                    count = 0;
                }

                showMatrix.fillMatrix(arr);

                outputWinner(listPlayers);


            }
        } catch (IndexOutOfBoundsException | IOException e) {
            methodStart();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int[] inputNumber() {

        String a = null;
        int[] coordinate = new int[2];

        try {
            a = bufferedReader.readLine();

            if (a != null || a.length() < 2 || isNumber(a)) {

                coordinate[0] = Integer.parseInt(a.substring(0, 1));
                coordinate[1] = Integer.parseInt(a.substring(1, 2));

            } else {
                throw new MyException(Output.error1);
            }
            return coordinate;

        } catch (IOException | MyException e) {
            inputNumber();
            e.getMessage();
        }

        return coordinate;

    }

    public List<Player> choicePlayer() throws IOException {

        List<Player> list = new ArrayList<>(2);
        List<String> names = new ArrayList<>(2);
        System.out.println(Output.choice);
        String a = bufferedReader.readLine();
        names = inputAliasName(bufferedReader);

        switch (a) {
            case "1":

                list.add(new User("0", names.get(0)));
                list.add(new Computer("X", names.get(1)));
                System.out.println(Output.HvsC);
                break;
            case "2":

                list.add(new Computer("0", names.get(0)));
                list.add(new Computer("X", names.get(1)));
                System.out.println(Output.CvsC);
                break;
            case "3":
                list.add(new User("0", names.get(0)));
                list.add(new User("X", names.get(1)));
                System.out.println(Output.HvsH);
                break;
            default:
                System.out.println(Output.error1);
                break;
        }

        return list;
    }

    public List<String> inputAliasName(BufferedReader bufferedReader) throws IOException {

        List<String> list = new ArrayList<>(2);

        System.out.println(Output.name1);
        String name1 = bufferedReader.readLine();
        list.add(name1);

        System.out.println(Output.name2);
        String name2 = bufferedReader.readLine();
        list.add(name2);


        return list;

    }

    private void outputWinner(List<Player> listPlayers){
        if (checkWin.checkWinForYou(arr, listPlayers.get(0))) {
            System.out.println(listPlayers.get(0).getAliasName());
        } else if (checkWin.checkWinForYou(arr, listPlayers.get(1)) && !checkWin.checkWinForYou(arr, listPlayers.get(0))) {
            System.out.println(listPlayers.get(1).getAliasName());
        }
    }


}
