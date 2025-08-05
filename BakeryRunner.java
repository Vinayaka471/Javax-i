class BakeryRunner{
	public static void main(String[] args){
		String itemName="Bread";
		int quantity=47;
		Bakery.buy(itemName,quantity);
		
		boolean open=true;
		Bakery.open(open);
		
		boolean close=false;
		Bakery.close(close);
		
		String owner="name";
		Bakery.owner(owner);
		
		String cashier="name";
		Bakery.cashier(cashier);
	}
}