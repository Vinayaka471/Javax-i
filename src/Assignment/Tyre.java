package Assignment;

public class Tyre extends Rubber {
    @Override
    public void expand(){
        System.out.println("expand running in Tyre");
    }
    public void compress(){
        System.out.println("Compress running in Tyre");
    }
}
