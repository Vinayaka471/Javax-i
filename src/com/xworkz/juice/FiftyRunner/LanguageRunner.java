package com.xworkz.juice.FiftyRunner;


import com.xworkz.juice.fiftyfold.Codinglanguage.HTML;
import com.xworkz.juice.fiftyfold.Codinglanguage.Codinglanguage;

public class LanguageRunner {
    public static void main(String[] args) {
        Codinglanguage lang = new HTML();
        lang.speak();
        lang.write();
        lang.communicate();
        lang.grammar();
        lang.origin();

        System.out.println("-----------");
        HTML java=new HTML();
        java.speak();
        java.write();
        java.communicate();
        java.grammar();
        java.origin();


    }
}
