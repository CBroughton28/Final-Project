public class Main
{

	public static void main(String[] args)
	{
	
		NFLPlayer[] NFLPlayersArray = PlayerManager.CreatePlayers();

		System.out.println("Total number of players in the draft: " + NFLPlayersArray.length);

		System.out.println("\r\n" + NFLPlayersArray[1].FirstName + " " + NFLPlayersArray[1].LastName);
		System.out.println("Position: " + NFLPlayersArray[1].Position);
		System.out.println("Team: " + NFLPlayersArray[1].Team);
		System.out.println("Height: " + NFLPlayersArray[1].Height);
		System.out.println("Weight: " + NFLPlayersArray[1].Weight);
		
		System.out.println("\r\nStats for " + NFLPlayersArray[1].SeasonStatsList.get(0).genericStats.YearNumber + " season:");
		System.out.println("Games Played: " + NFLPlayersArray[1].SeasonStatsList.get(0).genericStats.GamesPlayed);
		System.out.println("Games Started: " + NFLPlayersArray[1].SeasonStatsList.get(0).genericStats.GamesStarted);
	
		System.out.println("Completions: "
				+ NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingCompletions);
		System.out.println("Attempts: " + NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingAttempts);
		System.out.println("Completion %: "
				+ NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingCompletionPercentage * 100);
		System.out.println("Yards: " + NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingYards);
		System.out.println("Touchdowns: " + NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingTouchdowns);
		System.out.println("Interceptions: "
				+ NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.PassingInterceptions);
		System.out.println("QB Rating: " + NFLPlayersArray[1].SeasonStatsList.get(0).offensiveStats.QuarterbackRating);
		
	
		System.out.println("\r\nStats for " + NFLPlayersArray[1].SeasonStatsList.get(1).genericStats.YearNumber + " season:");
		System.out.println("Games Played: " + NFLPlayersArray[1].SeasonStatsList.get(1).genericStats.GamesPlayed);
		System.out.println("Games Started: " + NFLPlayersArray[1].SeasonStatsList.get(1).genericStats.GamesStarted);

		System.out.println("Completions: "
				+ NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingCompletions);
		System.out.println("Attempts: " + NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingAttempts);
		System.out.println("Completion %: "
				+ NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingCompletionPercentage * 100);
		System.out.println("Yards: " + NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingYards);
		System.out.println("Touchdowns: " + NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingTouchdowns);
		System.out.println("Interceptions: "
				+ NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.PassingInterceptions);
		System.out.println("QB Rating: " + NFLPlayersArray[1].SeasonStatsList.get(1).offensiveStats.QuarterbackRating);
	}
}