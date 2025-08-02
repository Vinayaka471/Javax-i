public class Holi{
	String colorType;
    String origin;
    String purpose;
    String celebrationMonth;
    int participantCount;
    String traditionalFood;

    
    public Holi() {}

 
    public Holi(String colorType) {
        this.colorType = colorType;
    }

    public Holi(String colorType, String origin) {
        this.colorType = colorType;
        this.origin = origin;
    }


    public Holi(String colorType, String origin, String purpose) {
        this.colorType = colorType;
        this.origin = origin;
        this.purpose = purpose;
    }


    public Holi(String colorType, String origin, String purpose, String celebrationMonth) {
        this.colorType = colorType;
        this.origin = origin;
        this.purpose = purpose;
        this.celebrationMonth = celebrationMonth;
    }

 
    public Holi(String colorType, String origin, String purpose, String celebrationMonth, int participantCount) {
        this.colorType = colorType;
        this.origin = origin;
        this.purpose = purpose;
        this.celebrationMonth = celebrationMonth;
        this.participantCount = participantCount;
    }

   
    public Holi(String colorType, String origin, String purpose, String celebrationMonth, int participantCount, String traditionalFood) {
        this.colorType = colorType;
        this.origin = origin;
        this.purpose = purpose;
        this.celebrationMonth = celebrationMonth;
        this.participantCount = participantCount;
        this.traditionalFood = traditionalFood;
    }

    public void display() {
        System.out.println("Holi colorType"+colorType);
		System.out.println("=======================");
		System.out.println("Holi origin"+origin);
		System.out.println("Holi purpose:"+purpose);
		System.out.println("Holil celebrationMonth"+celebrationMonth);
		System.out.println("Holi participantCount"+participantCount);
		System.out.println("Holi traditionalFood:"+traditionalFood);
    }

}