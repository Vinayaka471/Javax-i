class SubRegionalPostOffice{
	public static void deliver(String customername,String address){
		System.out.println(" customername "+customername+" address "+address);
		
		
		RegionalPostOffice.deliver(customername,address);
		System.out.println(" "+customername+" "+ address);
		
		
	}
}