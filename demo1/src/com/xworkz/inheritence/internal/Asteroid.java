package com.xworkz.inheritence.internal;

import com.xworkz.extend.AsteroidParent;

public class Asteroid extends AsteroidParent {
    void asteroidTypes() { System.out.println("Types: C-type, S-type, M-type"); }
    void nearEarthAsteroids() { System.out.println("NEAs: Potential Threat to Earth"); }
    void asteroidMissions() { System.out.println("Missions: OSIRIS-REx, Hayabusa2"); }
    void asteroidMining() { System.out.println("Mining Potential: Metals and Water"); }
    void asteroidDeflection() { System.out.println("Deflection Methods: Kinetic Impact, Gravity Tractor"); }
}
