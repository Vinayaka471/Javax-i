class Doctor{
	public static void treatment(String patientname, int age){
		
		Nurse.assist(patientname);
		System.out.println(patientname);
		System.out.println(age);
	}
	
}