class RCB{
	void selectPlayers() 
	{
		System.out.println("Selecting players for RCB."); 
		}
    void practice() 
	{
		System.out.println("RCB players practicing.");
		}
    void playMatch() 
	{
		System.out.println("RCB is playing a match."); 
		}
    void celebrateVictory()
	{ 
		System.out.println("RCB celebrating victory!"); 
		}
    void strategize() 
	{	
		System.out.println("RCB discussing strategy."); 
		}
	public static void main(String[] args)
	{
		TeamCoach coach = new TeamCoach();
		RCB rcb = new RCB();
		System.out.println("RCB");
		coach.motivate();
		coach.analyzeOpponents();
		coach.conductTranning();
		coach.planMatch();
		coach.reviewPerformance();
		rcb.selectPlayers();
		rcb.practice();
		rcb.playMatch();
		rcb.celebrateVictory();
		rcb.strategize();
	}
	}
	class TeamCoach{
	void motivate()
	{
		System.out.println("Coach Motivating Players:");
	}
	void analyzeOpponents(){
		System.out.println("Coach analyzing opponents.");
	}
	void conductTranning(){
		System.out.println("Couching Counducting a Tranning Session.");
	}
	void planMatch(){
		System.out.println("Coach Planning the Match strategy.");
	}
	void reviewPerformance()
	{
		System.out.println("Coach reviewimg player performance.");
	}
	}