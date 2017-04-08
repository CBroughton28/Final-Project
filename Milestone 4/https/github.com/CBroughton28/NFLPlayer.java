import java.util.ArrayList;

	public class NFLPlayer
	{
		
		private String FirstName;
		private String LastName;
		private String Team;
		private String Position;
	

		private int Height;
		private int Weight;

		ArrayList<SeasonStats> SeasonStatsList = new ArrayList<SeasonStats>();
	
		private boolean IsDrafted;
		private String team;
		private String firstName;
		private String lastName;
		private String position;
		private int height;
		private int weight;
	

		public NFLPlayer()
		{
			FirstName = "Generic";
			LastName = "Player";
			Team = "None";
			Position = "None";
			Height = 0;
			Weight = 0;
			IsDrafted = false;
		{
		}
		FirstName = firstName;
		LastName = lastName;
		Team = team;
		Position = position;
		Height = height;
		Weight = weight;
		}
		
		

		public NFLPlayer(String firstName, String lastName, String college, String position, int height, int weight,
				double fortyYardDash, int benchPressReps, double verticalJump, int broadJump, double threeConeDrill,
				double shuttleRun) {
		}
	


		public void setFirstName(String FirstName)
		{
			FirstName = firstName;
		}
	

		public void setLastName(String LastName){
		{
			LastName = lastName; }
		}
		
		public void setTeam(String team)
		{
			Team = team;
		}
		
		public void setPosition(String position)
		{
			Position = position;
		}
		
		public void setHeight(int height)
		{
			Height = height;
		}
		
		public void setWeight(int weight)
		{
			Weight = weight;
		}
		
		
		public NFLPlayer(String string, String string2, String string3, String string4, int i, int j, int k) {

		}


		public void setIsDrafted(boolean isDrafted)
		{
			IsDrafted = isDrafted;
		}
		

		public String getFirstName()
		{
			return FirstName;
		}
	

		public String getLastName()
		{
			return LastName;
		}
		
		public String getFullName()
		{
			return FirstName + " " + LastName;
		}
		
		public String getTeam()
		{
			return Team;
		}
		
		public String getPosition()
		{
			return Position;
		}
		
		public int getHeight()
		{
			return Height;
		}
		
		public int getWeight()
		{
			return Weight;
		}
		
		
		public boolean getIsDrafted()
		{
			return IsDrafted;
		}
	}
	

	class SeasonStats
	{
		GenericStats genericStats;
		OffensiveStats offensiveStats;
		DefensiveStats defensiveStats;
		SpecialTeamsStats specialTeamsStats;
	}
	

	class GenericStats
	{
		
		private int YearNumber;
		private int GamesPlayed;
		private int GamesStarted;
	
		public GenericStats()
		{
			YearNumber = 0;
			GamesPlayed = 0;
			GamesStarted = 0;
		}

		public GenericStats(int yearNumber, int gamesPlayed, int gamesStarted)
		{
			YearNumber = yearNumber;
			GamesPlayed = gamesPlayed;
			GamesStarted = gamesStarted;
		}
		

		public void setYearNumber(int yearNumber)
		{
			YearNumber = yearNumber;
		}
		
		public void setGamesPlayed(int gamesPlayed)
		{
			GamesPlayed = gamesPlayed;
		}
		
		public void setGamesStarted(int gamesStarted)
		{
			GamesStarted = gamesStarted;
		}
		
	
		public int getYearNumber()
		{
			return YearNumber;
		}
		
		public int getGamesPlayed()
		{
			return GamesPlayed;
		}
		
		public int getGamesStarted()
		{
			return GamesStarted;
		}
	}
	

	class OffensiveStats
	{
	
		private int PassingCompletions;
		private int PassingAttempts;
											
		private int PassingYards;
	
		private int PassingTouchdowns;
		private int PassingInterceptions;
		private int SacksTaken;
		private int SackYards;
		
		double QuarterbackRating;
		
		private int RushingAttempts;
		private int RushingYards;
		private int RushingYardsLong; 
		private int RushingTouchdowns;
		double RushingYardsAverage; 
		private int Fumbles;
		private int FumblesLost;
	

		
		private int Receptions;
		private int ReceivingYards;
		private int ReceivingTouchdowns;
		double ReceivingYardsAverage;
		@SuppressWarnings("unused")
		private int PassingCompletionPercentage;
		@SuppressWarnings("unused")
		private int PassingYardsPerAttempt;
	

		public OffensiveStats()
		{
			PassingCompletions = 0;
			PassingAttempts = 0;
			PassingCompletionPercentage = 0;
			PassingYards = 0;
			PassingYardsPerAttempt = 0;
			PassingTouchdowns = 0;
			PassingInterceptions = 0;
			SacksTaken = 0;
			SackYards = 0;
			QuarterbackRating = 0;
			RushingAttempts = 0;
			RushingYards = 0;
			RushingYardsLong = 0;
			RushingTouchdowns = 0;
			RushingYardsAverage = 0;
			Fumbles = 0;
			FumblesLost = 0;
			Receptions = 0;
			ReceivingYards = 0;
			ReceivingTouchdowns = 0;
			ReceivingYardsAverage = 0;
		}
	

		public OffensiveStats(int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
				int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
				int rushingYardsLong, int rushingTouchdowns, int fumbles, int fumblesLost, int receptions,
				int receivingYards, int receivingTouchdowns)
		{
			PassingCompletions = passingCompletions;
			PassingAttempts = passingAttempts;
			PassingCompletionPercentage = (int) ((double)PassingCompletions / PassingAttempts);
			PassingYards = passingYards;
			PassingYardsPerAttempt = (int) ((double)PassingYards / PassingAttempts);
			PassingTouchdowns = passingTouchdowns;
			PassingInterceptions = passingInterceptions;
			SacksTaken = sacksTaken;
			SackYards = sackYards;
			QuarterbackRating = calculateQuarterbackRating(PassingCompletions, PassingAttempts, PassingTouchdowns,
			PassingInterceptions, PassingYards);
			RushingAttempts = rushingAttempts;
			RushingYards = rushingYards;
			RushingYardsLong = rushingYardsLong;
			RushingTouchdowns = rushingTouchdowns;
			RushingYardsAverage = (double)RushingYards / (double)RushingAttempts;
			Fumbles = fumbles;
			FumblesLost = fumblesLost;
			Receptions = receptions;
			ReceivingYards = receivingYards;
			ReceivingTouchdowns = receivingTouchdowns;
			ReceivingYardsAverage = (double)ReceivingYards / (double)Receptions;
		}
	

		public OffensiveStats(int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
				int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
				int rushingYardsLong, int rushingTouchdowns, int fumbles, int fumblesLost)
		{
			PassingCompletions = passingCompletions;
			PassingAttempts = passingAttempts;
			PassingCompletionPercentage = (int) ((double)PassingCompletions / PassingAttempts);
			PassingYards = passingYards;
			PassingYardsPerAttempt = (int) ((double)PassingYards / PassingAttempts);
			PassingTouchdowns = passingTouchdowns;
			PassingInterceptions = passingInterceptions;
			SacksTaken = sacksTaken;
			SackYards = sackYards;
			RushingAttempts = rushingAttempts;
			RushingYards = rushingYards;
			RushingYardsLong = rushingYardsLong;
			RushingTouchdowns = rushingTouchdowns;
			RushingYardsAverage = (double)RushingYards / (double)RushingAttempts;
			Fumbles = fumbles;
			FumblesLost = fumblesLost;
		}
	

		public OffensiveStats(int rushingAttempts, int rushingYards, int rushingYardsLong, int rushingTouchdowns,
				int fumbles, int fumblesLost, int receptions, int receivingYards, int receivingTouchdowns)
		{
			RushingAttempts = rushingAttempts;
			RushingYards = rushingYards;
			RushingYardsLong = rushingYardsLong;
			RushingTouchdowns = rushingTouchdowns;
			RushingYardsAverage = (double)RushingYards / (double)RushingAttempts;
			Fumbles = fumbles;
			FumblesLost = fumblesLost;
			Receptions = receptions;
			ReceivingYards = receivingYards;
			ReceivingTouchdowns = receivingTouchdowns;
			ReceivingYardsAverage = (double)ReceivingYards / (double)Receptions;
		}
	
		public OffensiveStats(int fumbles, int fumblesLost, int receptions, int receivingYards, int receivingTouchdowns)
		{
			Fumbles = fumbles;
			FumblesLost = fumblesLost;
			Receptions = receptions;
			ReceivingYards = receivingYards;
			ReceivingTouchdowns = receivingTouchdowns;
			ReceivingYardsAverage = (double)ReceivingYards / (double)Receptions;
		}
	
		public void setPassingCompletions(int passingCompletions)
		{
			PassingCompletions = passingCompletions;
		}
		
		public void setPassingAttempts(int passingAttempts)
		{
			PassingAttempts = passingAttempts;
		}
		
		public void setPassingYards(int passingYards)
		{
			PassingYards = passingYards;
		}
		
		public void setPassingTouchdowns(int passingTouchdowns)
		{
			PassingTouchdowns = passingTouchdowns;
		}
		
		public void setPassingInterceptions(int passingInterceptions)
		{
			PassingInterceptions = passingInterceptions;
		}
		
		public void setSacksTaken(int sacksTaken)
		{
			SacksTaken = sacksTaken;
		}
		
		public void setSackYards(int sackYards)
		{
			SackYards = sackYards;
		}
		
		public void setRushingAttempts(int rushingAttempts)
		{
			RushingAttempts = rushingAttempts;
		}
		
		public void setRushingYards(int rushingYards)
		{
			RushingYards = rushingYards;
		}
		
		public void setRushingYardsLong(int rushingYardsLong)
		{
			RushingYardsLong = rushingYardsLong;
		}
		
		public void setRushingTouchdowns(int rushingTouchdowns)
		{
			RushingTouchdowns = rushingTouchdowns;
		}
		
		public void setFumbles(int fumbles)
		{
			Fumbles = fumbles;
		}
		
		public void setFumblesLost(int fumblesLost)
		{
			FumblesLost = fumblesLost;
		}
		
		public void setReceptions(int receptions)
		{
			Receptions = receptions;
		}
		
		public void setReceivingYards(int receivingYards)
		{
			ReceivingYards = receivingYards;
		}
		
		public void setReceivingTouchdowns(int receivingTouchdowns)
		{
			ReceivingTouchdowns = receivingTouchdowns;
		}
		
		
		public int getPassingCompletions()
		{
			return PassingCompletions;
		}
		
		public int getPassingAttempts()
		{
			return PassingAttempts;
		}
		
		public int getPassingYards()
		{
			return PassingYards;
		}
		
		public int getPassingTouchdowns()
		{
			return PassingTouchdowns;
		}
		
		public int getPassingInterceptions()
		{
			return PassingInterceptions;
		}
		
		public int getSacksTaken()
		{
			return SacksTaken;
		}
		
		public int getSackYards()
		{
			return SackYards;
		}
		
		public int getRushingAttempts()
		{
			return RushingAttempts;
		}
		
		public int getRushingYards()
		{
			return RushingYards;
		}
		
		public int getRushingYardsLong()
		{
			return RushingYardsLong;
		}
		
		public int getRushingTouchdowns()
		{
			return RushingTouchdowns;
		}
		
		public int getFumbles()
		{
			return Fumbles;
		}
		
		public int getFumblesLost()
		{
			return FumblesLost;
		}
		
		public int getReceptions()
		{
			return Receptions;
		}
		
		public int getReceivingYards()
		{
			return ReceivingYards;
		}
		
		public int getReceivingTouchdowns()
		{
			return ReceivingTouchdowns;
		}
		
	
		public double getPassingCompletionPercentage()
		{
			double PassingCompletionPercentage = ((double)PassingCompletions / PassingAttempts) * 100;
			return PassingCompletionPercentage;
		}
		
		public double getPassingYardsPerAttempt()
		{
			double PassingYardsPerAttempt = (double)PassingYards / PassingAttempts;
			return PassingYardsPerAttempt;
		}
		
		public double getQuarterbackRating()
		{
			double QuarterbackRating = calculateQuarterbackRating(PassingCompletions, PassingAttempts, PassingTouchdowns,
					PassingInterceptions, PassingYards);
			return QuarterbackRating;
		}
		
		public double getRushingYardsAverage()
		{
			double RushingYardsAverage = (double)RushingYards / (double)RushingAttempts;
			return RushingYardsAverage;
		}
		
		public double getReceivingYardsAverage()
		{
			double ReceivingYardsAverage = (double)ReceivingYards / (double)Receptions;
			return ReceivingYardsAverage;
		}
		
		private double calculateQuarterbackRating(int completions, int attempts, int touchdowns, int interceptions,
				int yards)
		{

			double a = ((double)completions / attempts) * 100;
			double b = ((double)touchdowns / attempts) * 100;
			double c = ((double)interceptions / attempts) * 100;
			double d = (double)yards / attempts;
	

			double quarterbackRating = a + (3.3 * b) - (2 * c) + (8.4 * d);
	

			return quarterbackRating;
		}
	}
	

	class DefensiveStats
	{
	
		private int SoloTackles;
		private int TackleAssists;
		@SuppressWarnings("unused")
		private int TotalTackles;
		private double Sacks;
	
		private int PassesDefended;
		private int Interceptions;
		private int InterceptionReturnYards;
		private int InterceptionReturnLong;
		private int InterceptionTouchdowns;
	
		private int ForcedFumbles;
		private int RecoveredFumbles;
		private int FumbleTouchdowns;
	
		private int Safeties;
	
		public DefensiveStats()
		{
			SoloTackles = 0;
			TackleAssists = 0;
			setTotalTackles(0);
			Sacks = 0;
			PassesDefended = 0;
			Interceptions = 0;
			InterceptionReturnYards = 0;
			InterceptionReturnLong = 0;
			InterceptionTouchdowns = 0;
			ForcedFumbles = 0;
			RecoveredFumbles = 0;
			FumbleTouchdowns = 0;
			Safeties = 0;
		}
	
		public DefensiveStats(int soloTackles, int tackleAssists, int sacks, int passesDefended, int interceptions,
				int interceptionReturnYards, int interceptionReturnLong, int interceptionTouchdowns, int forcedFumbles,
				int recoveredFumbles, int fumbleTouchdowns, int safeties)
		{
			SoloTackles = soloTackles;
			TackleAssists = tackleAssists;
			setTotalTackles(SoloTackles + TackleAssists);
			Sacks = sacks;
			PassesDefended = passesDefended;
			Interceptions = interceptions;
			InterceptionReturnYards = interceptionReturnYards;
			InterceptionReturnLong = interceptionReturnLong;
			InterceptionTouchdowns = interceptionTouchdowns;
			ForcedFumbles = forcedFumbles;
			RecoveredFumbles = recoveredFumbles;
			FumbleTouchdowns = fumbleTouchdowns;
			Safeties = safeties;
		}
		
	
		public void setSoloTackles(int soloTackles)
		{
			SoloTackles = soloTackles;
		}
	

		public void setTackleAssists(int tackleAssists)
		{
			TackleAssists = tackleAssists;
		}
	

		public void setSacks(double sacks)
		{
			Sacks = sacks;
		}
	

		public void setPassesDefended(int passesDefended)
		{
			PassesDefended = passesDefended;
		}
	

		public void setInterceptions(int interceptions)
		{
			Interceptions = interceptions;
		}
	

		public void setInterceptionReturnYards(int interceptionReturnYards)
		{
			InterceptionReturnYards = interceptionReturnYards;
		}
	

		public void setInterceptionReturnLong(int interceptionReturnLong)
		{
			InterceptionReturnLong = interceptionReturnLong;
		}
	

		public void setInterceptionTouchdowns(int interceptionTouchdowns)
		{
			InterceptionTouchdowns = interceptionTouchdowns;
		}
	

		public void setForcedFumbles(int forcedFumbles)
		{
			ForcedFumbles = forcedFumbles;
		}
	

		public void setFumbleTouchdowns(int fumbleTouchdowns)
		{
			FumbleTouchdowns = fumbleTouchdowns;
		}
	

		public void setRecoveredFumbles(int recoveredFumbles)
		{
			RecoveredFumbles = recoveredFumbles;
		}
	

		public void setSafeties(int safeties)
		{
			Safeties = safeties;
		}
		
		public int getSoloTackles()
		{
			return SoloTackles;
		}
		
		public int getTackleAssists()
		{
			return TackleAssists;
		}
		
		public double getSacks()
		{
			return Sacks;
		}
		
		public int getPassesDefended()
		{
			return PassesDefended;
		}
		
		public int getInterceptions()
		{
			return Interceptions;
		}
		
		public int getInterceptionReturnYards()
		{
			return InterceptionReturnYards;
		}
		
		public int getInterceptionReturnLong()
		{
			return InterceptionReturnLong;
		}
		
		public int getInterceptionTouchdowns()
		{
			return InterceptionTouchdowns;
		}
		
		public int getForcedFumbles()
		{
			return ForcedFumbles;
		}
		
		public int getFumbleTouchdowns()
		{
			return FumbleTouchdowns;
		}
		
		public int getRecoveredFumbles()
		{
			return RecoveredFumbles;
		}
		
		public int getSafeties()
		{
			return Safeties;
		}
		
		
		public int getTotalTackles()
		{
			int TotalTackles = SoloTackles + TackleAssists;
			return TotalTackles;
		}

		public void setTotalTackles(int totalTackles) {
			TotalTackles = totalTackles;
		}
		
	}
	

	class SpecialTeamsStats
	{
		
		private int FieldGoalsAttempted;
		private int FieldGoalsMade;
		private int FieldGoalLongMade;
		private int FieldGoalsBlocked;
	

		
		private int TotalPunts;
		private int PuntYardsGross;
		double PuntYardsGrossAverage;
		private int PuntReturnYardsAgainst;
								
		private int PuntTouchbacks;
	
		double PuntYardsNetAverage;
		int PuntYardsLong;
		int PuntsInside20; 
		int PuntsBlocked;
	
		private int KickoffReturns;
		private int KickoffReturnYards;
		double KickoffReturnYardsAverage;
		private int KickoffReturnYardsLong;
		private int KickoffReturnTouchdowns;
		private int KickoffReturnFumbles;
		private int KickoffReturnFairCatches;
	
		private int PuntReturns;
		private int PuntReturnYards;
		double PuntReturnYardsAverage;
		private int PuntReturnYardsLong;
		private int PuntReturnTouchdowns;
		private int PuntReturnFumbles;
		private int PuntReturnFairCatches;
		private int PuntYardsNet;
	
		public SpecialTeamsStats()
		{
			FieldGoalsAttempted = 0;
			FieldGoalsMade = 0;
			FieldGoalLongMade = 0;
			FieldGoalsBlocked = 0;
			TotalPunts = 0;
			PuntYardsGross = 0;
			PuntYardsGrossAverage = 0;
			PuntReturnYardsAgainst = 0;
			PuntTouchbacks = 0;
			PuntYardsNet = 0;
			PuntYardsNetAverage = 0;
			PuntYardsLong = 0;
			PuntsInside20 = 0;
			PuntsBlocked = 0;
			KickoffReturns = 0;
			KickoffReturnYards = 0;
			KickoffReturnYardsAverage = 0;
			KickoffReturnYardsLong = 0;
			KickoffReturnTouchdowns = 0;
			KickoffReturnFumbles = 0;
			KickoffReturnFairCatches = 0;
			PuntReturns = 0;
			PuntReturnYards = 0;
			PuntReturnYardsAverage = 0;
			PuntReturnYardsLong = 0;
			PuntReturnTouchdowns = 0;
			PuntReturnFumbles = 0;
			PuntReturnFairCatches = 0;
		}
	
		public SpecialTeamsStats(int fieldGoalsAttempted, int fieldGoalsMade, int fieldGoalLongMade, int fieldGoalsBlocked,
				int totalPunts, int puntYardsGross, int puntReturnYardsAgainst, int puntTouchbacks, int puntYardsLong,
				int puntsInside20, int puntsBlocked, int kickoffReturns, int kickoffReturnYards,
				int kickoffReturnYardsLong, int kickoffReturnTouchdowns, int kickoffReturnFumbles,
				int kickoffReturnFairCatches, int puntReturns, int puntReturnYards, int puntReturnYardsLong,
				int puntReturnTouchdowns, int puntReturnFumbles, int puntReturnFairCatches)
		{
			FieldGoalsAttempted = fieldGoalsAttempted;
			FieldGoalsMade = fieldGoalsMade;
			FieldGoalLongMade = fieldGoalLongMade;
			FieldGoalsBlocked = fieldGoalsBlocked;
			TotalPunts = totalPunts;
			PuntYardsGross = puntYardsGross;
			PuntYardsGrossAverage = (double)PuntYardsGross / TotalPunts;
			PuntReturnYardsAgainst = puntReturnYardsAgainst;
			PuntTouchbacks = puntTouchbacks;
			PuntYardsNet = PuntYardsGross - PuntReturnYardsAgainst - (PuntTouchbacks * 20);
			PuntYardsNetAverage = (double)PuntYardsNet / totalPunts;
			PuntYardsLong = puntYardsLong;
			PuntsInside20 = puntsInside20;
			PuntsBlocked = puntsBlocked;
			KickoffReturns = kickoffReturns;
			KickoffReturnYards = kickoffReturnYards;
			KickoffReturnYardsAverage = (double)KickoffReturnYards / KickoffReturns;
			KickoffReturnYardsLong = kickoffReturnYardsLong;
			KickoffReturnTouchdowns = kickoffReturnTouchdowns;
			KickoffReturnFumbles = kickoffReturnFumbles;
			KickoffReturnFairCatches = kickoffReturnFairCatches;
			PuntReturns = puntReturns;
			PuntReturnYards = puntReturnYards;
			PuntReturnYardsAverage = (double)PuntReturnYards / PuntReturns;
			PuntReturnYardsLong = puntReturnYardsLong;
			PuntReturnTouchdowns = puntReturnTouchdowns;
			PuntReturnFumbles = puntReturnFumbles;
			PuntReturnFairCatches = puntReturnFairCatches;
		}
	
		public SpecialTeamsStats(int fieldGoalsAttempted, int fieldGoalsMade, int fieldGoalLongMade, int fieldGoalsBlocked)
		{
			FieldGoalsAttempted = fieldGoalsAttempted;
			FieldGoalsMade = fieldGoalsMade;
			FieldGoalLongMade = fieldGoalLongMade;
			FieldGoalsBlocked = fieldGoalsBlocked;
		}
	
		public SpecialTeamsStats(int totalPunts, int puntYardsGross, int puntReturnYardsAgainst, int puntTouchbacks,
				int puntYardsLong, int puntsInside20, int puntsBlocked)
		{
			TotalPunts = totalPunts;
			PuntYardsGross = puntYardsGross;
			PuntYardsGrossAverage = (double)PuntYardsGross / TotalPunts;
			PuntReturnYardsAgainst = puntReturnYardsAgainst;
			PuntTouchbacks = puntTouchbacks;
			PuntYardsNet = PuntYardsGross - PuntReturnYardsAgainst - (PuntTouchbacks * 20);
			PuntYardsNetAverage = (double)PuntYardsNet / totalPunts;
			PuntYardsLong = puntYardsLong;
			PuntsInside20 = puntsInside20;
			PuntsBlocked = puntsBlocked;
		}
	
		public SpecialTeamsStats(int kickoffReturns, int kickoffReturnYards, int kickoffReturnYardsLong,
				int kickoffReturnTouchdowns, int kickoffReturnFumbles, int kickoffReturnFairCatches, int puntReturns,
				int puntReturnYards, int puntReturnYardsLong, int puntReturnTouchdowns, int puntReturnFumbles,
				int puntReturnFairCatches)
		{
			KickoffReturns = kickoffReturns;
			KickoffReturnYards = kickoffReturnYards;
			KickoffReturnYardsAverage = (double)KickoffReturnYards / KickoffReturns;
			KickoffReturnYardsLong = kickoffReturnYardsLong;
			KickoffReturnTouchdowns = kickoffReturnTouchdowns;
			KickoffReturnFumbles = kickoffReturnFumbles;
			KickoffReturnFairCatches = kickoffReturnFairCatches;
			PuntReturns = puntReturns;
			PuntReturnYards = puntReturnYards;
			PuntReturnYardsAverage = (double)PuntReturnYards / PuntReturns;
			PuntReturnYardsLong = puntReturnYardsLong;
			PuntReturnTouchdowns = puntReturnTouchdowns;
			PuntReturnFumbles = puntReturnFumbles;
			PuntReturnFairCatches = puntReturnFairCatches;
		}
	
		public void setFieldGoalsAttempted(int fieldGoalsAttempted)
		{
			FieldGoalsAttempted = fieldGoalsAttempted;
		}
	

		public void setFieldGoalsMade(int fieldGoalsMade)
		{
			FieldGoalsMade = fieldGoalsMade;
		}
	

		public void setFieldGoalLongMade(int fieldGoalLongMade)
		{
			FieldGoalLongMade = fieldGoalLongMade;
		}
		
		public void setFieldGoalsBlocked(int fieldGoalsBlocked)
		{
			FieldGoalsBlocked = fieldGoalsBlocked;
		}
		
		public void setTotalPunts(int totalPunts)
		{
			TotalPunts = totalPunts;
		}
		
		public void setPuntYardsGross(int puntYardsGross)
		{
			PuntYardsGross = puntYardsGross;
		}
		
		public void setPuntReturnYardsAgainst(int puntReturnYardsAgainst)
		{
			PuntReturnYardsAgainst = puntReturnYardsAgainst;
		}
		
		public void setPuntTouchbacks(int puntTouchbacks)
		{
			PuntTouchbacks = puntTouchbacks;
		}
		
		public void setPuntYardsLong(int puntYardsLong)
		{
			PuntYardsLong = puntYardsLong;
		}
		
		public void setPuntsInside20(int puntsInside20)
		{
			PuntsInside20 = puntsInside20;
		}
		
		public void setPuntsBlocked(int puntsBlocked)
		{
			PuntsBlocked = puntsBlocked;
		}
		
		public void setKickoffReturns(int kickoffReturns)
		{
			KickoffReturns = kickoffReturns;
		}
		
		public void setKickoffReturnYards(int kickoffReturnYards)
		{
			KickoffReturnYards = kickoffReturnYards;
		}
		
		public void setKickoffReturnYardsLong(int kickoffReturnYardsLong)
		{
			KickoffReturnYardsLong = kickoffReturnYardsLong;
		}
		
		public void setKickoffReturnTouchdowns(int kickoffReturnTouchdowns)
		{
			KickoffReturnTouchdowns = kickoffReturnTouchdowns;
		}
		
		public void setKickoffReturnFumbles(int kickoffReturnFumbles)
		{
			KickoffReturnFumbles = kickoffReturnFumbles;
		}
		
		public void setKickoffReturnFairCatches(int kickoffReturnFairCatches)
		{
			KickoffReturnFairCatches = kickoffReturnFairCatches;
		}
		
		public void setPuntReturns(int puntReturns)
		{
			PuntReturns = puntReturns;
		}
		
		public void setPuntReturnYards(int puntReturnYards)
		{
			PuntReturnYards = puntReturnYards;
		}
		
		public void setPuntReturnYardsLong(int puntReturnYardsLong)
		{
			PuntReturnYardsLong = puntReturnYardsLong;
		}
		
		public void setPuntReturnTouchdowns(int puntReturnTouchdowns)
		{
			PuntReturnTouchdowns = puntReturnTouchdowns;
		}
		
		public void setPuntReturnFumbles(int puntReturnFumbles)
		{
			PuntReturnFumbles = puntReturnFumbles;
		}
		
		public void setPuntReturnFairCatches(int puntReturnFairCatches)
		{
			PuntReturnFairCatches = puntReturnFairCatches;
		}
		
		public int getFieldGoalsAttempted()
		{
			return FieldGoalsAttempted;
		}
	

		public int getFieldGoalsMade()
		{
			return FieldGoalsMade;
		}
	

		public int getFieldGoalLongMade()
		{
			return FieldGoalLongMade;
		}
		
		public int getFieldGoalsBlocked()
		{
			return FieldGoalsBlocked;
		}
		
		public int getTotalPunts()
		{
			return TotalPunts;
		}
		
		public int getPuntYardsGross()
		{
			return PuntYardsGross;
		}
		
		public int getPuntReturnYardsAgainst()
		{
			return PuntReturnYardsAgainst;
		}
		
		public int getPuntTouchbacks()
		{
			return PuntTouchbacks;
		}
		
		public int getPuntYardsLong()
		{
			return PuntYardsLong;
		}
		
		public int getPuntsInside20()
		{
			return PuntsInside20;
		}
		
		public int getPuntsBlocked()
		{
			return PuntsBlocked;
		}
		
		public int getKickoffReturns()
		{
			return KickoffReturns;
		}
		
		public int getKickoffReturnYards()
		{
			return KickoffReturnYards;
		}
		
		public int getKickoffReturnYardsLong()
		{
			return KickoffReturnYardsLong;
		}
		
		public int getKickoffReturnTouchdowns()
		{
			return KickoffReturnTouchdowns;
		}
		
		public int getKickoffReturnFumbles()
		{
			return KickoffReturnFumbles;
		}
		
		public int getKickoffReturnFairCatches()
		{
			return KickoffReturnFairCatches;
		}
		
		public int getPuntReturns()
		{
			return PuntReturns;
		}
		
		public int getPuntReturnYards()
		{
			return PuntReturnYards;
		}
		
		public int getPuntReturnYardsLong()
		{
			return PuntReturnYardsLong;
		}
		
		public int getPuntReturnTouchdowns()
		{
			return PuntReturnTouchdowns;
		}
		
		public int getPuntReturnFumbles()
		{
			return PuntReturnFumbles;
		}
		
		public int getPuntReturnFairCatches()
		{
			return PuntReturnFairCatches;
		}
		
		
		public double getPuntYardsGrossAverage()
		{
			double PuntYardsGrossAverage = (double)PuntYardsGross / TotalPunts;
			return PuntYardsGrossAverage;
		}
		
		public int getPuntYardsNet()
		{
			int PuntYardsNet = PuntYardsGross - PuntReturnYardsAgainst - (PuntTouchbacks * 20);
			return PuntYardsNet;
		}
		
		public double getPuntYardsNetAverage()
		{
			double PuntYardsNetAverage =  (double)getPuntYardsNet() / TotalPunts;
			return PuntYardsNetAverage;
		}
		
		public double getKickoffReturnYardsAverage()
		{
			double KickoffReturnYardsAverage = (double)KickoffReturnYards / KickoffReturns;
			return KickoffReturnYardsAverage;
		}
		
		public double getPuntReturnYardsAverage()
		{
			double PuntReturnYardsAverage = (double)PuntReturnYards / PuntReturns;
			return PuntReturnYardsAverage;
		}
	}
