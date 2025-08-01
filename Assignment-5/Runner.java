public class Runner{
	public static void main(String [] args){
		System.out.println("It is recieved");
		
		String item="Box";
		Courier.pickup(item);
		System.out.println(item);
	}
}