class Lalipop{
	void unwrap() 
	{
		System.out.println("Lollipop unwrapped."); 
		}
    void lick() 
	{
		System.out.println("Licking the lollipop.");
		}
    void bite()
	{ 
		System.out.println("Biting the lollipop."); 
		}
    void finish() 
	{
		System.out.println("Lollipop finished."); 
		}
    void throwStick()
	{
		System.out.println("Stick thrown in the bin.");
		}
	public static void main(String[] args)
	{
		Flovors flv = new Flovors();
		Lalipop lp = new Lalipop();
		System.out.println("Type of Lalipop flovors are Avaliable: ");
		flv.choclate();
		flv.orange();
		flv.strawberry();
		flv.mango();
		flv.apple();
		lp.unwrap();
		lp.lick();
		lp.bite();
		lp.finish();
		lp.throwStick();
		System.out.println("Thank You!");
	}
}
class Flovors{
	void choclate()
	{
		System.out.println("Choclate flavor Lalipop Avaliable. ");
	}
	void orange()
	{
		System.out.println("Orance flavor Lalipop Avaliable.");
	}
	void strawberry()
	{
		System.out.println("Strawberry Flavor Lalipop are Avaliable.");
	}
	void mango()
	{
		System.out.println("Mango Flavor Lalipop are Avaliable.");
	}
	void apple()
	{
		System.out.println("Mango Flovor Lalipop are Avaliable.");
	}
}