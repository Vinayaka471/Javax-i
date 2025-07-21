package Practice;

public class Conditional {
	public static void main(String[] args) {
		boolean isSunup=false;
		if(isSunup==true)
			System.out.println("Day");
		else
			System.out.println("Night");
		
		
		int age=17;
		if(age>=18)
			System.out.println("Can Vote");
		else
			System.out.println("Can't Vote");                    //comparision operator
		
		//int a=20;
		//int b=30;
		//if(a<40 && b<40)
		//System.out.println("both less than 40");           //logical operators
		
		int a=70;
		int b=60;
		if(a<80 || b<80)
			System.out.println("atleast one less than 80");
		
		
		boolean isadult=false;
		if( isadult==true)
			System.out.println("is Adult");
		else
			System.out.println("Not Adult");
		
		
	}
}