package com.leverx.freeman.steps;

import com.leverx.freeman.entity.Computer;
import com.leverx.freeman.entity.Player;
import com.leverx.freeman.entity.User;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StepPlayersImpl implements StepPlayers {


    @Override
    public char[][] doStep(char[][] arr, int[] index, List<Player> players) {

        if (players.get(0).getClass() == User.class && players.get(1).getClass() == Computer.class) {
            arr = nextStepUser(arr, index, players.get(0));
            arr = nextStepComputer(arr, index, players.get(1));

        } else if (players.get(0).getClass() == Computer.class) {
            arr = nextStepComputer(arr, index, players.get(0));
            arr = nextStepComputer(arr, index, players.get(1));
        } else if (players.get(0).getClass() == User.class && players.get(1).getClass() == User.class) {

            if (Starter.count == 0) {
                arr = nextStepUser(arr, index, players.get(0));
            } else {
                arr = nextStepUser(arr, index, players.get(1));
            }
        }


        return arr;
    }


    private char[][] nextStepUser(char[][] arr, int[] index, Player player) {

        int i = index[0];

        int j = index[1];

        char x = player.getView().charAt(0);

        boolean flag = true;

        while (flag) {

            if (arr[i][j] == '0' || arr[i][j] == 'X') {
                System.out.println("This place is occupied,please enter another coordinate!");
                Scanner scanner = new Scanner(System.in);
                String a = scanner.nextLine();
                i = Integer.parseInt(a.substring(0, 1));
                j = Integer.parseInt(a.substring(1, 2));

            }

            if (arr[i][j] == '|') {
                arr[i][j] = x;
                flag = false;
            }


        }


        return arr;
    }


    public char[][] nextStepComputer(char[][] arr, int[] index, Player player) {

        Random random = new Random();

        boolean flag = true;


        int i = random.nextInt(3);

        int j = random.nextInt(3);

        while (flag) {

            if (arr[i][j] == '0' || arr[i][j] == 'X') {
                System.out.println("PC This place is occupied!! Please, enter new coordinate!");
                i = random.nextInt(3);
                j = random.nextInt(3);
            }
            if (arr[i][j] == '|') {
                arr[i][j] = player.getView().charAt(0);
                flag = false;
            }
        }


        return arr;

    }
}
