package com.xworkz.juice.fiftyfold.planet;

public class Venus {
    public void Bright(Planet planet){
        System.out.println("Bright running in Venus");{
            planet.hasAtmosphere();
            planet.hasGravity();
            planet.hasOceans();
            planet.orbitsSun();
            planet.supportsLife();
            if(planet instanceof Jupitar){
                Jupitar jupitar=(Jupitar)planet;
            }

        }
    }
}
