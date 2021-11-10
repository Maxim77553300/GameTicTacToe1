package com.leverx.freeman.steps;

import com.leverx.freeman.entity.Player;
import com.leverx.freeman.entity.User;

import java.util.List;
import java.util.Random;

public class StepPlayersImpl implements StepPlayers {


    @Override
    public char[][] doStep(char[][] arr, int[] index, List<Player> players) {

        if (players.get(0).getClass() == User.class) {
            arr = nextStepUser(arr, index, players.get(0));

        } else {
            arr = nextStepComputer(arr, index, players.get(0));
        }
        arr = nextStepComputer(arr, index, players.get(1));

        return arr;
    }


    private char[][] nextStepUser(char[][] arr, int[] index, Player player) {

        int i = index[0];

        int j = index[1];

        if (arr[i][j] == '|') {
            arr[i][j] = '0';
        }

        return arr;
    }


    public char[][] nextStepComputer(char[][] arr, int[] index, Player player) {

        Random random = new Random();

        int i = random.nextInt(3);

        int j = random.nextInt(3);

        if (arr[i][j] == '|') {
            arr[i][j] = 'X';
        }
//        else {
//
//        }
        return arr;

    }
}
