
import java.util.ArrayList;		

public class NFLPlayer
{
	String FirstName;
	String LastName;
	String Team;
	String Position;
	
	ArrayList<SeasonStats> SeasonStatsList = new ArrayList<SeasonStats>();

	int Height;
	
	int Weight;
	
	public NFLPlayer()
	{
		FirstName = "Generic";
		LastName = "Player";
		Team = "Team";
		Position = "None";
		Height = 0;
		Weight = 0;
	}
}
class SeasonStats
{
	OffensivePlayer offensivePlayer;
	DefensivePlayer defensivePlayer;
	SpecialTeamsPlayer specialTeamsPlayer;
}
class SeasonNumber
{
	int YearNumber;
	int GamesPlayed;
	int GamesStarted;
	
	public SeasonNumber()
	{
		YearNumber = 0;
		GamesPlayed = 0;
		GamesStarted = 0;
	}
}
class OffensivePlayer
{
	SeasonNumber SeasonNum;
	
	
	int PassingCompletions;
	int PassingAttempts;
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
	
	public OffensivePlayer()
	{
		PassingCompletions = 0;
		PassingAttempts = 0;
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
}
class DefensivePlayer
{

	SeasonNumber SeasonNum;
	
	int TotalTackles;
	int SoloTackles;
	int TackleAssists;
	
	double Sacks;
	
	int PassesDefended;
	int Interceptions;
	int InterceptionReturnYards;
	int InterceptionReturnLong;
	

	int ForcedFumbles;
	int RecoveredFumbles;
	
	int Safeties;
	
	
	public DefensivePlayer()
	{
		TotalTackles = 0;
		SoloTackles = 0;
		TackleAssists = 0;
		Sacks = 0;
		PassesDefended = 0;
		Interceptions = 0;
		InterceptionReturnYards = 0;
		InterceptionReturnLong = 0;
		ForcedFumbles = 0;
		RecoveredFumbles = 0;
		Safeties = 0;
	}
}
class SpecialTeamsPlayer
{

	SeasonNumber SeasonNum;
	
	int FieldGoalsAttempted;
	int FieldGoalsMade;
	int FieldGoalLongMade;
	int FieldGoalsBlocked;
	
	int TotalPunts;
	int PuntYardsGross;
	
	double PuntYardsGrossAverage;
	int PuntYardsNet;
	double PuntYardsNetAverage;
	int PuntYardLong;
	int PuntTouchbacks;
	int PuntsInside20;
	int PuntsBlocked;
	int PuntReturnYardsAgainst;
	
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
	
	public SpecialTeamsPlayer()
	{
		FieldGoalsAttempted = 0;
		FieldGoalsMade = 0;
		FieldGoalLongMade = 0;
		FieldGoalsBlocked = 0;
		TotalPunts = 0;
		PuntYardsGross = 0;
		PuntYardsGrossAverage = 0;
		PuntYardsNet = 0;
		PuntYardsNetAverage = 0;
		PuntYardLong = 0;
		PuntTouchbacks = 0;
		PuntsInside20 = 0;
		PuntsBlocked = 0;
		PuntReturnYardsAgainst = 0;
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
}
