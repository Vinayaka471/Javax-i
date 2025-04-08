package com.xworkz.juice.fiftyfold.MusicInstrument;

public class Flute {
    public void Melody(MusicInstrument musicInstrument){
        System.out.println("Sound running in Flute");
        musicInstrument.sound();
        musicInstrument.brand();
        musicInstrument.maintenance();
        musicInstrument.play();
        musicInstrument.type();
        if(musicInstrument instanceof Guitar){
            System.out.println("MusicInstrument is instance of Guitar");
            Guitar guitar=(Guitar)musicInstrument;
        }
    }
}
