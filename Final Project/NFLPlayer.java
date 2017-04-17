package nflsrc;

import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import javax.swing.AbstractAction;

public abstract class NFLPlayer implements Celebrator
{	

	protected int PlayerID;
	
	protected String FirstName;
	protected String LastName;
	protected String Team;
	protected String Position;


	protected int Height;
	protected int Weight;

	protected boolean IsDrafted;

	public Object SeasonStatsList;

	public void setPlayerID(int playerID)
	{
		PlayerID = playerID;
	}
	public String getPlayerSpecialty() {
	
		return null;
	}
	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}


	public void setLastName(String lastName)
	{
		LastName = lastName;
	}
	
	public void setCollege(String team)
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
	
	
	public void setIsDrafted(boolean isDrafted)
	{
		IsDrafted = isDrafted;
	}
	
	public int getPlayerID()
	{
		return PlayerID;
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
	
	public String getIsDraftedString()
	{
		if (IsDrafted)
		{
			return "X";
		}
		else
		{
			return "";
		}
	}
	
	public abstract String getPlayerType();
	
	
	public void celebrate()
	{
		System.out.println(this.getFullName() + " smiles for the cameras!");
	}
	
}


abstract class GenericStats
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


class OffensivePlayer extends NFLPlayer implements Celebrator
{
	private static final int numberOfCelebrations = 0;
	ArrayList<OffensiveStats> SeasonStatsList = new ArrayList<OffensiveStats>();


	public OffensivePlayer()
	{
		FirstName = "Generic";
		LastName = "Player";
		Team = "None";
		Position = "None";
		Height = 0;
		Weight = 0;
		IsDrafted = false;
	}

	public OffensivePlayer(String firstName, String lastName, String team, String position, int height, int weight)
	{
		FirstName = firstName;
		LastName = lastName;
		Team = team;
		Position = position;
		Height = height;
		Weight = weight;
	}
	
	@Override
	public String getPlayerType()
	{
		return "Offense";
	}
	
	@SuppressWarnings("unused")
	@Override
	public String getPlayerSpecialty()
	{
		int passingYards = 0;
		int passingInterceptions = 0;
		int rushingYards = 0;
		int receivingYards = 0;
		int seasonsPlayed = SeasonStatsList.size();
		int baseline = 10;
	
		for (int i = 0; i < seasonsPlayed; i ++)
		{
			passingYards += SeasonStatsList.get(i).getPassingYards();
			passingInterceptions += SeasonStatsList.get(i).getPassingInterceptions(); 
			rushingYards += SeasonStatsList.get(i).getRushingYards();
			receivingYards += SeasonStatsList.get(i).getReceivingYards();
		}
		
String celebrationText;


		switch (numberOfCelebrations)
		{
		case 0:
			celebrationText = this.getFullName() + " hugs the commissioner in excitement!";
			break;
		case 1:
			celebrationText = this.getFullName() + " begins to shed tears of joy!";
			break;
		default:
			celebrationText = this.getFullName() + " does the Heisman pose!";
			break;
		}

		System.out.println(celebrationText);
		return FirstName;
	}


}


class OffensiveStats extends GenericStats
{
	private int PassingCompletions;
	private int PassingAttempts;
	private int PassingYards;
	private int PassingTouchdowns;
	private int PassingInterceptions;
	private int SacksTaken;
	private int SackYards;

	private int RushingAttempts;
	private int RushingYards;
	private int RushingYardsLong;
	private int RushingTouchdowns;
	private int Fumbles;
	private int FumblesLost;

	private int Receptions;
	private int ReceivingYards;
	private int ReceivingYardsLong;
	private int ReceivingTouchdowns;

	public OffensiveStats()
	{
		PassingCompletions = 0;
		PassingAttempts = 0;
		PassingYards = 0;
		PassingTouchdowns = 0;
		PassingInterceptions = 0;
		SacksTaken = 0;
		SackYards = 0;
		RushingAttempts = 0;
		RushingYards = 0;
		RushingYardsLong = 0;
		RushingTouchdowns = 0;
		Fumbles = 0;
		FumblesLost = 0;
		Receptions = 0;
		ReceivingYards = 0;
		ReceivingYardsLong = 0;
		ReceivingTouchdowns = 0;
	}

	public OffensiveStats(int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
			int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
			int rushingYardsLong, int rushingTouchdowns, int fumbles, int fumblesLost, int receptions,
			int receivingYards, int receivingYardsLong, int receivingTouchdowns)
	{
		PassingCompletions = passingCompletions;
		PassingAttempts = passingAttempts;
		PassingYards = passingYards;
		PassingTouchdowns = passingTouchdowns;
		PassingInterceptions = passingInterceptions;
		SacksTaken = sacksTaken;
		SackYards = sackYards;
		RushingAttempts = rushingAttempts;
		RushingYards = rushingYards;
		RushingYardsLong = rushingYardsLong;
		RushingTouchdowns = rushingTouchdowns;
		Fumbles = fumbles;
		FumblesLost = fumblesLost;
		Receptions = receptions;
		ReceivingYards = receivingYards;
		ReceivingYardsLong = receivingYardsLong;
		ReceivingTouchdowns = receivingTouchdowns;
	}

	public OffensiveStats(int passingCompletions, int passingAttempts, int passingYards, int passingTouchdowns,
			int passingInterceptions, int sacksTaken, int sackYards, int rushingAttempts, int rushingYards,
			int rushingYardsLong, int rushingTouchdowns, int fumbles, int fumblesLost)
	{
		PassingCompletions = passingCompletions;
		PassingAttempts = passingAttempts;
		PassingYards = passingYards;
		PassingTouchdowns = passingTouchdowns;
		PassingInterceptions = passingInterceptions;
		SacksTaken = sacksTaken;
		SackYards = sackYards;
		RushingAttempts = rushingAttempts;
		RushingYards = rushingYards;
		RushingYardsLong = rushingYardsLong;
		RushingTouchdowns = rushingTouchdowns;
		Fumbles = fumbles;
		FumblesLost = fumblesLost;
	}

	public OffensiveStats(int rushingAttempts, int rushingYards, int rushingYardsLong, int rushingTouchdowns,
			int fumbles, int fumblesLost, int receptions, int receivingYards, int receivingYardsLong, int receivingTouchdowns)
	{
		RushingAttempts = rushingAttempts;
		RushingYards = rushingYards;
		RushingYardsLong = rushingYardsLong;
		RushingTouchdowns = rushingTouchdowns;
		Fumbles = fumbles;
		FumblesLost = fumblesLost;
		Receptions = receptions;
		ReceivingYards = receivingYards;
		ReceivingYardsLong = receivingYardsLong;
		ReceivingTouchdowns = receivingTouchdowns;
	}

	public OffensiveStats(int fumbles, int fumblesLost, int receptions, int receivingYards, int receivingYardsLong, int receivingTouchdowns)
	{
		Fumbles = fumbles;
		FumblesLost = fumblesLost;
		Receptions = receptions;
		ReceivingYards = receivingYards;
		ReceivingYardsLong = receivingYardsLong;
		ReceivingTouchdowns = receivingTouchdowns;
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
	
	public void setReceivingYardsLong(int receivingYardsLong)
	{
		ReceivingYardsLong = receivingYardsLong;
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
	
	public int getReceivingYardsLong()
	{
		return ReceivingYardsLong;
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


class DefensivePlayer extends NFLPlayer implements Celebrator
{
	ArrayList<DefensiveStats> SeasonStatsList = new ArrayList<DefensiveStats>();

	public DefensivePlayer()
	{
		FirstName = "Generic";
		LastName = "Player";
		Team = "None";
		Position = "None";
		Height = 0;
		Weight = 0;
		IsDrafted = false;
	}

	public DefensivePlayer(String firstName, String lastName, String team, String position, int height, int weight)
	{
		FirstName = firstName;
		LastName = lastName;
		Team = team;
		Position = position;
		Height = height;
		Weight = weight;

	}
	
	@Override
	public String getPlayerType()
	{
		return "Defense";
	}


	@SuppressWarnings("unused")
	@Override
	public String getPlayerSpecialty()
	{
		int sacks = 0;
		int interceptions = 0;
		int forcedFumbles = 0;
		int tackles = 0;
		int seasonsPlayed = SeasonStatsList.size();
		int baseline = 10;
	
		for (int i = 0; i < seasonsPlayed; i ++)
		{
			sacks += SeasonStatsList.get(i).getSacks();
			interceptions += SeasonStatsList.get(i).getInterceptions();
			forcedFumbles += SeasonStatsList.get(i).getForcedFumbles();
			tackles += SeasonStatsList.get(i).getTotalTackles();
		}

		sacks /= seasonsPlayed;
		interceptions /= seasonsPlayed;
		forcedFumbles /= seasonsPlayed;
		tackles /= seasonsPlayed;
		
		interceptions *= 2;
		forcedFumbles *= 2;
		tackles /= 5;
		return FirstName;
		
	
}


class DefensiveStats extends GenericStats
{

	private int SoloTackles;
	private int TackleAssists;
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


	public DefensiveStats(int soloTackles, int tackleAssists, double sacks, int passesDefended, int interceptions,
			int interceptionReturnYards, int interceptionReturnLong, int interceptionTouchdowns, int forcedFumbles,
			int recoveredFumbles, int fumbleTouchdowns, int safeties)
	{
		SoloTackles = soloTackles;
		TackleAssists = tackleAssists;
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
	
	// Calculated statistics
	public int getTotalTackles()
	{
		int TotalTackles = SoloTackles + TackleAssists;
		return TotalTackles;
	}
	
}


class SpecialTeamsPlayer extends NFLPlayer implements Celebrator
{
	ArrayList<SpecialTeamsStats> SeasonStatsList = new ArrayList<SpecialTeamsStats>();

	public SpecialTeamsPlayer()
	{
		FirstName = "Generic";
		LastName = "Player";
		Team = "None";
		Position = "None";
		Height = 0;
		Weight = 0;
		IsDrafted = false;
	}

	public SpecialTeamsPlayer(String firstName, String lastName, String team, String position, int height,
			int weight)
	{
		FirstName = firstName;
		LastName = lastName;
		Team = team;
		Position = position;
		Height = height;
		Weight = weight;
	}
	
	private double getCareerFieldGoalPercentage()
	{
		int seasonsPlayed = SeasonStatsList.size();
		int fieldGoalsMade = 0;
		int fieldGoalsAttempted = 0;
		
		for (int i = 0; i < seasonsPlayed; i ++)
		{
			fieldGoalsMade += SeasonStatsList.get(i).getFieldGoalsMade();
			fieldGoalsAttempted += SeasonStatsList.get(i).getFieldGoalsAttempted();
		}
		
		double fieldGoalPercentage = (double)fieldGoalsAttempted / (double)fieldGoalsMade;
		
		return fieldGoalPercentage;
	}
	
	@Override
	public String getPlayerType()
	{
		return "Special Teams";
	}
	
	@Override
	public String getPlayerSpecialty()
	{
		
		int returnYards = 0;
		double fieldGoalPercentage = getCareerFieldGoalPercentage();
		int fieldGoalLong = 0;
		int puntsInside20 = 0;
		int puntLong = 0;
		int seasonsPlayed = SeasonStatsList.size();
		int baseline = 10;
	
		for (int i = 0; i < seasonsPlayed; i ++)
		{
			returnYards += SeasonStatsList.get(i).getKickoffReturnYards();
			returnYards += SeasonStatsList.get(i).getPuntReturnYards();
			puntsInside20 += SeasonStatsList.get(i).getPuntsInside20();
			
			if (SeasonStatsList.get(i).getFieldGoalLongMade() > fieldGoalLong)
			{
				fieldGoalLong = SeasonStatsList.get(i).getFieldGoalLongMade();
			}
		
			if (SeasonStatsList.get(i).getPuntYardsLong() > puntLong)
			{
				puntLong = SeasonStatsList.get(i).getPuntYardsLong();
			}
		}
		
		

		returnYards /= seasonsPlayed;
		puntsInside20 /= seasonsPlayed;
		

		returnYards /= 50;
		fieldGoalPercentage *= 12.5;
		fieldGoalLong /= 5.5;
		puntsInside20 /= 1.5;
		puntLong /= 5.5;

		if (returnYards >= baseline)
		{
			return "Return Specialist";
		}
		else if (fieldGoalPercentage >= baseline)
		{
			return "Accurate Kicker";
		}
		else if (fieldGoalLong >= baseline)
		{
			return "Power Kicker";
		}
		else if (puntsInside20 >= baseline)
		{
			return "Accurate Punter";
		}
		else if (puntLong >= baseline)
		{
			return "Power Punter";
		}
		return FirstName;
		
	}

	public void celebrate()
	{
	
		Random random = new Random();
		int numberOfCelebrations = random.nextInt(3);
	
		String celebrationText;


		switch (numberOfCelebrations)
		{
		case 0:
			celebrationText = this.getFullName() + " can't believe he was actually drafted!";
			break;
		case 1:
			celebrationText = this.getFullName() + " texts all his friends the news!";
			break;
		default:
			celebrationText = this.getFullName() + " can't contain his excitement!";
			break;
		}

		System.out.println(celebrationText);
	}
	
}


class SpecialTeamsStats extends GenericStats
{
	private int FieldGoalsAttempted;
	private int FieldGoalsMade;
	private int FieldGoalLongMade;
	private int FieldGoalsBlocked;

	private int TotalPunts;
	private int PuntYardsGross;
	private int PuntReturnYardsAgainst; 
				
	private int PuntTouchbacks;
	int PuntYardsLong; 
	int PuntsInside20;
	int PuntsBlocked;

	private int KickoffReturns;
	private int KickoffReturnYards;
	private int KickoffReturnYardsLong;
	private int KickoffReturnTouchdowns;
	private int KickoffReturnFumbles;
	private int KickoffReturnFairCatches;

	private int PuntReturns;
	private int PuntReturnYards;
	private int PuntReturnYardsLong;
	private int PuntReturnTouchdowns;
	private int PuntReturnFumbles;
	private int PuntReturnFairCatches;

	public SpecialTeamsStats()
	{
		FieldGoalsAttempted = 0;
		FieldGoalsMade = 0;
		FieldGoalLongMade = 0;
		FieldGoalsBlocked = 0;
		TotalPunts = 0;
		PuntYardsGross = 0;
		PuntReturnYardsAgainst = 0;
		PuntTouchbacks = 0;
		PuntYardsLong = 0;
		PuntsInside20 = 0;
		PuntsBlocked = 0;
		KickoffReturns = 0;
		KickoffReturnYards = 0;
		KickoffReturnYardsLong = 0;
		KickoffReturnTouchdowns = 0;
		KickoffReturnFumbles = 0;
		KickoffReturnFairCatches = 0;
		PuntReturns = 0;
		PuntReturnYards = 0;
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
		PuntReturnYardsAgainst = puntReturnYardsAgainst;
		PuntTouchbacks = puntTouchbacks;
		PuntYardsLong = puntYardsLong;
		PuntsInside20 = puntsInside20;
		PuntsBlocked = puntsBlocked;
		KickoffReturns = kickoffReturns;
		KickoffReturnYards = kickoffReturnYards;
		KickoffReturnYardsLong = kickoffReturnYardsLong;
		KickoffReturnTouchdowns = kickoffReturnTouchdowns;
		KickoffReturnFumbles = kickoffReturnFumbles;
		KickoffReturnFairCatches = kickoffReturnFairCatches;
		PuntReturns = puntReturns;
		PuntReturnYards = puntReturnYards;
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

	public SpecialTeamsStats(int totalPunts, int puntYardsGross, int puntYardsLong,
			int puntTouchbacks, int puntsInside20, int puntsBlocked, int puntReturnYardsAgainst)
	{
		TotalPunts = totalPunts;
		PuntYardsGross = puntYardsGross;
		PuntYardsLong = puntYardsLong;
		PuntTouchbacks = puntTouchbacks;
		PuntsInside20 = puntsInside20;
		PuntsBlocked = puntsBlocked;
		PuntReturnYardsAgainst = puntReturnYardsAgainst;
	}

	public SpecialTeamsStats(int kickoffReturns, int kickoffReturnYards, int kickoffReturnYardsLong,
			int kickoffReturnTouchdowns, int kickoffReturnFumbles, int kickoffReturnFairCatches, int puntReturns,
			int puntReturnYards, int puntReturnYardsLong, int puntReturnTouchdowns, int puntReturnFumbles,
			int puntReturnFairCatches)
	{
		KickoffReturns = kickoffReturns;
		KickoffReturnYards = kickoffReturnYards;
		KickoffReturnYardsLong = kickoffReturnYardsLong;
		KickoffReturnTouchdowns = kickoffReturnTouchdowns;
		KickoffReturnFumbles = kickoffReturnFumbles;
		KickoffReturnFairCatches = kickoffReturnFairCatches;
		PuntReturns = puntReturns;
		PuntReturnYards = puntReturnYards;
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
	
	public double getFieldGoalPercentage()
	{
		double FieldGoalPercentage = (double)FieldGoalsMade / FieldGoalsAttempted;
		return FieldGoalPercentage;
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

}