package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.planet.Jupitar;
import com.xworkz.juice.fiftyfold.planet.Planet;

public class PlanetRunner {
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
    }
}
