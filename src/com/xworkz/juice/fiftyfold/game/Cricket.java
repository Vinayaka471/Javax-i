package com.xworkz.juice.fiftyfold.game;

public class Cricket {
    public void Batting(Game game){
        System.out.println("Batting running in Cricket");
        game.duration();
        game.opponent();
        game.play();
        game.winner();
        game.strategy();
        if(game instanceof Chess){
            System.out.println("Game is instance of Chess");
            Chess chess=(Chess)game;
        }
    }
}
