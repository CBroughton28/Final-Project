public class Main
	{
	

		public static void main(String[] args)
		{
		
			PlayerManager players = new PlayerManager();
			
			System.out.println("Number of offensive players in the draft: " + players.getNumberOfOffensivePlayers());
			System.out.println("Number of defensive players in the draft: " + players.getNumberOfDefensivePlayers());
			System.out.println("Number of special teams players in the draft: " + players.getNumberOfSpecialTeamsPlayers());
			System.out.println("Total number of players in the draft: " + players.getNumberOfPlayers());
	
			System.out.println("\r\n" + players.getOffensivePlayer(1).getFullName());
			System.out.println("Position: " + players.getOffensivePlayer(1).getPosition());
			System.out.println("Team: " + players.getOffensivePlayer(1).getTeam());
			System.out.println("Height: " + players.getOffensivePlayer(1).getHeight());
			System.out.println("Weight: " + players.getOffensivePlayer(1).getWeight());
					
			System.out.println("\r\nType: " + players.getOffensivePlayer(1).getPlayerType());
			System.out.println("Specialty: " + players.getOffensivePlayer(1).getPlayerSpecialty());
	

			System.out.println("\r\nStats for " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getYearNumber()
					+ " season:");
			System.out.println("Games Played: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getGamesPlayed());
			System.out.println("Games Started: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getGamesStarted());
		
			System.out.println("Completions: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingCompletions());
			System.out.println("Attempts: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingAttempts());
			System.out.println("Completion %: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingCompletionPercentage());
			System.out.println("Yards: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingYards());
			System.out
					.println("Touchdowns: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingTouchdowns());
			System.out.println("Interceptions: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(0).getPassingInterceptions());
			System.out.println("QB Rating: " + players.getOffensivePlayer(1).SeasonStatsList.get(0).getQuarterbackRating());
	


			System.out.println("\r\nStats for " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getYearNumber()
					+ " season:");
			System.out.println("Games Played: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getGamesPlayed());
			System.out.println("Games Started: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getGamesStarted());
			
			System.out.println("Completions: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingCompletions());
			System.out.println("Attempts: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingAttempts());
			System.out.println("Completion %: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingCompletionPercentage());
			System.out.println("Yards: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingYards());
			System.out
					.println("Touchdowns: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingTouchdowns());
			System.out.println("Interceptions: "
					+ players.getOffensivePlayer(1).SeasonStatsList.get(1).getPassingInterceptions());
			System.out.println("QB Rating: " + players.getOffensivePlayer(1).SeasonStatsList.get(1).getQuarterbackRating());
		}
	}
