package com.leverx.freeman.steps;

import com.leverx.freeman.entity.Player;

import java.util.List;

public interface StepPlayers {

    char[][] doStep(char[][] arr, int[] index, List<Player> players);
}
