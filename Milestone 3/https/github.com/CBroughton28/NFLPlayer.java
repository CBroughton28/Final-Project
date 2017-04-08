import java.util.ArrayList;
	
	public class NFLPlayer
	{
		
		String FirstName;
		String LastName;
		String Team;
		String Position;
	

		int Height;
		int Weight; 
		int Number;
	
		ArrayList<SeasonStats> SeasonStatsList = new ArrayList<SeasonStats>();
	
		boolean isDrafted;
		
		public NFLPlayer()
		{
			FirstName = "Generic";
			LastName = "Player";
			Team = "None";
			Position = "None";
			Height = 0;
			Weight = 0;
			Number = 0;
			isDrafted = false;
		}
	

		public NFLPlayer(String firstName, String lastName, String team, String position, int height, int weight,
				int number)
		{
			FirstName = firstName;
			LastName = lastName;
			Team = team;
			Position = position;
			Height = height;
			Weight = weight;
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
	
		int YearNumber;
		int GamesPlayed;
		int GamesStarted;
	

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
	}
	

	class OffensiveStats
	{
		
		int PassingCompletions;
		int PassingAttempts;
		double PassingCompletionPercentage; 
											
		int PassingYards;
		double PassingYardsPerAttempt; 
		int PassingTouchdowns;
		int PassingInterceptions;
		int SacksTaken;
		int SackYards;
	
		double QuarterbackRating;
	
		int RushingAttempts;
		int RushingYards;
		int RushingYardsLong;
		int RushingTouchdowns;
		double RushingYardsAverage;
		int Fumbles;
		int FumblesLost;
	
		int Receptions;
		int ReceivingYards;
		int ReceivingTouchdowns;
		double ReceivingYardsAverage;
	

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
			PassingCompletionPercentage = (double)PassingCompletions / PassingAttempts;
			PassingYards = passingYards;
			PassingYardsPerAttempt = (double)PassingYards / PassingAttempts;
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
			PassingCompletionPercentage = (double)PassingCompletions / PassingAttempts;
			PassingYards = passingYards;
			PassingYardsPerAttempt = (double)PassingYards / PassingAttempts;
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
	
		int SoloTackles;
		int TackleAssists;
		int TotalTackles; 
		double Sacks; 
	
		int PassesDefended;
		int Interceptions;
		int InterceptionReturnYards;
		int InterceptionReturnLong;
		int InterceptionTouchdowns;
	
		int ForcedFumbles;
		int RecoveredFumbles;
		int FumbleTouchdowns;
	
		int Safeties;
	
		public DefensiveStats()
		{
			SoloTackles = 0;
			TackleAssists = 0;
			TotalTackles = 0;
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
			TotalTackles = SoloTackles + TackleAssists;
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
	}
	

	class SpecialTeamsStats
	{
	
		int FieldGoalsAttempted;
		int FieldGoalsMade;
		int FieldGoalLongMade;
		int FieldGoalsBlocked;
	
		int TotalPunts;
		int PuntYardsGross;
		double PuntYardsGrossAverage; 
		int PuntReturnYardsAgainst; 
							
		int PuntTouchbacks;
		int PuntYardsNet; 
	
		double PuntYardsNetAverage;
		int PuntYardsLong; 
		int PuntsInside20; 
		int PuntsBlocked;
	
		int KickoffReturns;
		int KickoffReturnYards;
		double KickoffReturnYardsAverage;
		int KickoffReturnYardsLong;
		int KickoffReturnTouchdowns;
		int KickoffReturnFumbles;
		int KickoffReturnFairCatches;
	
		int PuntReturns;
		int PuntReturnYards;
		double PuntReturnYardsAverage;
		int PuntReturnYardsLong;
		int PuntReturnTouchdowns;
		int PuntReturnFumbles;
		int PuntReturnFairCatches;
	
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
	}
