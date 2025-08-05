class AutoRunner{
	public static void main(String[] args){
		System.out.println("Auto Rickshaw:");
		Auto auto = new Auto();
		auto.name = "Karnataka";
		auto.no = 47;
		auto.shape = "Triangle";
		auto.grade = 'V';
		System.out.println("auto name:"+auto.name);
		System.out.println("auto no:"+auto.no);
		System.out.println("auto shape:"+auto.shape);
		System.out.println("auto tag:"+auto.grade);
		System.out.println("+++++------****///////");
		System.out.println("*******************");
		Auto auto1 = new Auto();
		auto1.name = "Bajaj";
		auto1.no = 69;
		auto1.shape = "Rectangle";
		auto1.grade = 'S';
		System.out.println("Auto name:"+auto1.name);
		System.out.println("Auto no:"+auto1.no);
		System.out.println("Auto shape:"+auto1.shape);
		System.out.println("Auto grade:"+auto1.grade);
		System.out.println("++++++++++++++++++++++++");
		Auto auto2=new Auto();
		auto2.name="TVS";
		auto2.no=17;
		auto2.shape="Square";
		auto2.grade='L';
		System.out.println("Auto name:"+auto2.name);
		System.out.println("Auto no:"+auto2.no);
		System.out.println("Auto shape:"+auto2.shape);
		System.out.println("Auto grade:"+auto2.grade);
	}
}