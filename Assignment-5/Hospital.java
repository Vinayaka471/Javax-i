class Hospital{
	public static void checkup(String patientname,int age,long mobile,String email,String sicknes){
		System.out.println("Enter patient");
		System.out.println(patientname);
		System.out.println(age);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(sicknes);
		
		Doctor.treatment(patientname,age);
	}
}