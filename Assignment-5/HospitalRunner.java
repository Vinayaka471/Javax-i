class HospitalRunner{
	public static void main(String[] args){
		//patientname,age,mobile,email,sicknes
		
		String patientname="Amar";
		int age=57;
		long mobile=8463218963L;
		String email="amar@gmail.com";
		String sicknes="Covid-19";
		
		Hospital.checkup(patientname,age,mobile,email,sicknes);
	}
}