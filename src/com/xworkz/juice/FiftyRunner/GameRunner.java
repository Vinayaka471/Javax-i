package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.game.Chess;
import com.xworkz.juice.fiftyfold.game.Cricket;
import com.xworkz.juice.fiftyfold.game.Game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Chess();
        game.play();
        game.strategy();
        game.opponent();
        game.winner();
        game.duration();

        System.out.println("-----------");

        Chess chess = new Chess();
        chess.play();
        chess.strategy();
        chess.opponent();
        chess.winner();
        chess.duration();

        System.out.println("------------------");
        Cricket cricket=new Cricket();
        cricket.Batting(game);
    }
}
