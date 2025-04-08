package com.xworkz.juice.fiftyfold.tool;

public class Spanner {
    public void Steel(Tool tool){
        System.out.println("Steel running in Spanner");
        tool.durability();
        tool.grip();
        tool.use();
        tool.material();
        if(tool instanceof Hammer){
            System.out.println("Tool is instance of Spanner");
            Hammer hammer=(Hammer)tool;

        }

    }
}
