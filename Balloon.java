public class Balloon{
	public String color;
	public String size;
	public boolean isInflated;
	public String material;
	public int capacity;
	public String shape;
	
	public Balloon(){
		
	}
	public Balloon(String color){
		this.color=color;
	}
	public Balloon(String color,String size){
		this.color=color;
		this.size=size;
	}
	public Balloon(String color,String size,boolean isInflated){
		this.color=color;
		this.size=size;
		this.isInflated=isInflated;
	}
	public Balloon(String color,String size,boolean isInflated,String material){
		this.color=color;
		this.size=size;
		this.isInflated=isInflated;
		this.material=material;
	}
	public Balloon(String color,String size,boolean isInflated,String material,int capacity){
		this.color=color;
		this.size=size;
		this.isInflated=isInflated;
		this.material=material;
		this.capacity=capacity;
	}
	public Balloon(String color,String size,boolean isInflated,String material,int capacity,String shape){
		this.color=color;
		this.size=size;
		this.isInflated=isInflated;
		this.material=material;
		this.capacity=capacity;
		this.shape=shape;
	}
	public void display(){
		System.out.println("Balloon color:"+color);
		System.out.println("======================");
		System.out.println("Balloon size:"+size);
		System.out.println("Balloon isInflated:"+isInflated);
		System.out.println("Balloon material:"+material);
		System.out.println("Balloon capacity:"+capacity);
		System.out.println("Balloon shape:"+shape);
	}
	
}