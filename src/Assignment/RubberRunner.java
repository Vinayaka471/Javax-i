package Assignment;

public class RubberRunner {
    public static void main(String[] args){
        Rubber rubber=new Rubber();
        rubber.expand();
        Rubber rubber1=new Tyre();
        rubber1.expand();
       // rubber1.compress();


        Tyre tyre=new Tyre();
        tyre.expand(); //implementation come from tyre
        tyre.compress(); //from tyre
        MRFTyre mrftyre=new MRFTyre();
        mrftyre.expand();
        mrftyre.compress();
        mrftyre.radial();




        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(mrftyre);
    }
}
