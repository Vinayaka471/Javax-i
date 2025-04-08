package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.planet.Jupitar;
import com.xworkz.juice.fiftyfold.planet.Jupitar;
import com.xworkz.juice.fiftyfold.planet.Planet;
import com.xworkz.juice.fiftyfold.planet.Venus;

public class PlanettRunner {
    public static void main(String[] args) {
        Planet planet = new Jupitar();
        planet.orbitsSun();
        planet.hasGravity();
        planet.hasAtmosphere();
        planet.supportsLife();
        planet.hasOceans();

        System.out.println("-----------");

        Jupitar earth = new Jupitar();
        earth.orbitsSun();
        earth.hasGravity();
        earth.hasAtmosphere();
        earth.supportsLife();
        earth.hasOceans();


        System.out.println("-----------------");
        Venus venus=new Venus();
        venus.Bright(planet);
    }
}
