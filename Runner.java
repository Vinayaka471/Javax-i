class Runner{
	public static void main(String[] args){
		Display display = new Display;
		Shop shop = new Shop;
		
		shop.Market(display);
		shop.Market(null);
	}
}