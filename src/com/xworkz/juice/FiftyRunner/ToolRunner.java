package com.xworkz.juice.FiftyRunner;

import com.xworkz.juice.fiftyfold.tool.Hammer;
import com.xworkz.juice.fiftyfold.tool.Spanner;
import com.xworkz.juice.fiftyfold.tool.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool=new Hammer();
        tool.use();
        tool.material();
        tool.grip();
        tool.durability();

        System.out.println("-----------");
        Hammer hammer = new Hammer();
        hammer.use();
        hammer.material();
        hammer.grip();
        hammer.durability();


        System.out.println("-------------------");
        Spanner spanner=new Spanner();
        spanner.Steel(tool);
    }
}
