public class Courier{
	public static void pickup(String item){
		System.out.println("It will running");
		
		Station.send(item);
		System.out.println(item);
	}
}