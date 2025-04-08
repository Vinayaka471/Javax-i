package com.xworkz.juice.fiftyfold.Publication;

public class Notes {
    public void Chapter(Publication publication){
        System.out.println("Chapter running of Notes");
        publication.genre();
        publication.pages();
        publication.publish();
        publication.read();
        publication.write();
        if(publication instanceof Volume){
            System.out.println("Publication is instance of Volume");
            Volume volume=(Volume)publication;
        }
    }
}
