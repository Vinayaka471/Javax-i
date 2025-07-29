class laptop{
	void start() 
	{
		System.out.println("Laptop is starting...");
		}
    void shutdown()
	{
		System.out.println("Laptop is shutting down..."); 
		}
    void openLid()
	{ 
		System.out.println("Lid opened."); 
		}
    void closeLid() 
	{
		System.out.println("Lid closed."); 
		}
    void showBattery() 
	{ 
		System.out.println("Battery is at 80%.");
		}
	public static void main(String[] args)
	{
		Accessories acc = new Accessories();
		laptop lp = new laptop();
		System.out.println("Laptop Accessories!");
		acc.mouse();
		acc.keyboard();
		acc.USB();
		acc.Storage();
		acc.processor();
		lp.start();
		lp.shutdown();
		lp.openLid();
		lp.closeLid();
		lp.showBattery();
	}
}
class Accessories{
	void mouse()
	{
		System.out.println("Mouse is connected.");
		
	}
	void keyboard()
	{
		System.out.println("Keyboard is connected.");
	}
	void USB()
	{
		System.out.println("USB is connected.");
	}
	void Storage()
	{
		System.out.println("Laptop Storage.");
	}
	void processor()
	{
		System.out.println("Laptop Processor is RYZEN 5.");
	}
}