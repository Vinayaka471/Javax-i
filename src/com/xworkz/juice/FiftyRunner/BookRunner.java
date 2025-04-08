package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Publication.*;
import com.xworkz.juice.fiftyfold.Publication.Publication;

public class BookRunner {
    public static void main(String[] args) {
        Publication book = new Volume();
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        System.out.println("-----------");

        Volume novel = new Volume();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();

        System.out.println("---------------------");
        Notes notes=new Notes();
        notes.Chapter(book);

    }
}
