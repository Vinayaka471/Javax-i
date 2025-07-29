class MNC{
	void hireEmployee() 
	{
		System.out.println("Hiring an employee."); 
		}
    void fireEmployee() 
	{ 
		System.out.println("Firing an employee."); 
		}
    void launchProduct() 
	{
		System.out.println("Launching a new product."); 
		}
    void conductMeeting() 
	{
		System.out.println("Conducting a business meeting."); 
		}
    void reportRevenue() 
	{ 
		System.out.println("Reporting annual revenue."); 
		}
	public static void main(String[] args)
	{
		department dept = new department();
		MNC mnc = new MNC();
		System.out.println("Different Types of Deperment in the MNC Company:");
		dept.processPayroll();
		dept.counductingTranning();
		dept.manageBenefits();
		dept. handelRecrutment();
		dept.organizesEvents();
		mnc.hireEmployee();
		mnc.fireEmployee();
		mnc.launchProduct();
		mnc.conductMeeting();
		mnc.reportRevenue();
	}
	}
	class department{
	int processPayroll()
	{
		System.out.println("Processing Payroll.");
		return 0;
	}
	void counductingTranning()
	{
		System.out.println("Counducting Tranning Session. ");
	}
	void manageBenefits(){
		System.out.println("Managing Employee Benefits.");
	}
	int handelRecrutment(){
		System.out.println("Handling Recrutments Process.");
		return 0;
	}
	void organizesEvents(){
		System.out.println("Organizing the corporates events.");
	}
	
}