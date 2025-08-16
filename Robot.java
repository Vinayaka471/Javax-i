class Clip{
	enum Clipcolor{
		RED,BLUE,ORANGE,WHITE;
	}
	Clipcolor = color;
	
	Clip(Clipcolor=color);
	this.color;
	
	void hold(){
	System.out.println("Holding"+color+"color");
	}
}