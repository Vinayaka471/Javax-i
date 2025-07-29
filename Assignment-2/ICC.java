class ICC
{
	void scheduleMatch() 
	{
		System.out.println("Match scheduled."); 
		}
    void announceRankings() 
	{
		System.out.println("Announcing team rankings.");
		}
    void introduceRules() 
	{ 
		System.out.println("New rules introduced."); 
		}
    void penalizeTeam() 
	{
		System.out.println("Team penalized for misconduct."); 
		}
    void rewardBestPlayer() 
	{
		System.out.println("Best player awarded."); 
		}
	public static void main(String[] args)
	{
		championship chip = new championship();
		ICC icc = new ICC();
		chip.startLeague();
		chip. conductFinal();
		chip. presentTrophy();
		chip.upadteLeaderboard();
		chip.reviewPerformance();
		icc.scheduleMatch();
		icc.announceRankings();
		icc.introduceRules();
		icc.penalizeTeam();
		icc.rewardBestPlayer();
	}
}
class championship{
	void startLeague()
	{
		System.out.println("League is Started.");
	}
	void conductFinal()
	{
		System.out.println("Final Match Conducted.");
	}
	void presentTrophy()
	{
		System.out.println("Trophy Presenr to Winner.");
	}
	void upadteLeaderboard()
	{
		System.out.println("Leaderboard Update.");
	}
	void reviewPerformance()
	{
		System.out.println("Performance Reviewed. ");
	}
}