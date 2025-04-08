package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.sports.Football;
import com.xworkz.juice.fiftyfold.sports.Kabaddi;
import com.xworkz.juice.fiftyfold.sports.Sports;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sport = new Football();
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        System.out.println("-----------");

        Football football = new Football();
        football.play();
        football.rules();
        football.competition();
        football.team();
        football.training();

        Kabaddi kabaddi=new Kabaddi();
        kabaddi.Raid(sport);
    }
}
