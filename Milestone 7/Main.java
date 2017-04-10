package src;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application
{	

	private static final String args = null;
	private static Font defaultFont = new Font("New Times Roman", 12);
	private static Font defaultHeadingFont = new Font("New Times Roman Bold", 12);
	

	private static String stringButtonName = "Name";
	private static String stringButtonPosition = "Position";
	private static String stringButtonTeam = "Team";
	private static String stringSortAscending = " " + (char)11015;
	private static String stringSortDescending = " " + (char)11014;
	
	{
		launch(args);
	}
		
	public void start(Stage stage)
	{
	
		stage.setTitle("NFL Draft Simulator");
		
		createGrid(stage);
	}
	
	private void createGrid(Stage stage)
	{
	
		PlayerManager players = new PlayerManager();
		
		GridPane gridPane = new GridPane();


		gridPane.setHgap(10);
		gridPane.setVgap(5);
		gridPane.setPadding(new Insets(10, 10, 10, 10));


		Button buttonName = new Button(stringButtonName);
		Button buttonPosition = new Button(stringButtonPosition);
		Button buttonTeam = new Button(stringButtonTeam);

		buttonName.setFont(defaultHeadingFont);
		buttonPosition.setFont(defaultHeadingFont);
		buttonTeam.setFont(defaultHeadingFont);


		gridPane.add(buttonName, 0, 0);
		gridPane.add(buttonPosition, 1, 0);
		gridPane.add(buttonTeam, 2, 0);

		
		Scene scene = new Scene(gridPane, 640, 640);
		
		buttonName.setOnAction(event ->
		{
			if (players.getIsSortedAscending())
			{
				players.sortByNameDescending();


				buttonPosition.setText(stringButtonPosition);
				buttonTeam.setText(stringButtonTeam);
				buttonName.setText(stringButtonName + stringSortDescending);
			}
			else
			{
				players.sortByNameAscending();
				
				buttonPosition.setText(stringButtonPosition);
				buttonTeam.setText(stringButtonTeam);
				buttonName.setText(stringButtonName + stringSortAscending);
	
			}
			
			displayPlayers(stage, gridPane, players, scene);
		});


		buttonPosition.setOnAction(event ->
		{
			if (players.getIsSortedAscending())
			{
				players.sortByPositionDescending();	
				
				buttonName.setText(stringButtonName);
				buttonTeam.setText(stringButtonTeam);
				buttonPosition.setText(stringButtonPosition + stringSortDescending);
			}
			else
			{
				players.sortByPositionAscending();
				
				buttonName.setText(stringButtonName);
				buttonTeam.setText(stringButtonTeam);
				buttonPosition.setText(stringButtonPosition + stringSortAscending);
	
			}
			
			displayPlayers(stage, gridPane, players, scene);
		});


		buttonTeam.setOnAction(event ->
		{
			if (players.getIsSortedAscending())
			{
				players.sortByTeamDescending();
				
				buttonName.setText(stringButtonName);
				buttonPosition.setText(stringButtonPosition);
				buttonTeam.setText(stringButtonTeam + stringSortDescending);

			}
			else
			{
				players.sortByTeamAscending();
				
				buttonName.setText(stringButtonName);
				buttonPosition.setText(stringButtonPosition);
				buttonTeam.setText(stringButtonTeam + stringSortAscending);
		
			}
			
			displayPlayers(stage, gridPane, players, scene);
		});
		
	
		displayPlayers(stage, gridPane, players, scene);
	}
	
	private void displayPlayers(Stage stage, GridPane gridPane, PlayerManager players, Scene scene)
	{
		GridPane tempGridPane = new GridPane();
		tempGridPane.add(gridPane.getChildren().get(0), 0, 0);
		tempGridPane.add(gridPane.getChildren().get(0), 1, 0);
		tempGridPane.add(gridPane.getChildren().get(0), 2, 0);
		
		gridPane.getChildren().clear();
		
		gridPane.add(tempGridPane.getChildren().get(0), 0, 0);
		gridPane.add(tempGridPane.getChildren().get(0), 1, 0);
		gridPane.add(tempGridPane.getChildren().get(0), 2, 0);
		
		for (int i = 0; i < players.getNumberOfPlayers(); i++)
		{
			Label currentRowColumn1 = new Label(players.getPlayerInfo(i).getFullName());
			Label currentRowColumn2 = new Label(players.getPlayerInfo(i).getPosition());
			Label currentRowColumn3 = new Label(players.getPlayerInfo(i).getTeam());


			currentRowColumn1.setFont(defaultFont);
			currentRowColumn2.setFont(defaultFont);
			currentRowColumn3.setFont(defaultFont);


			gridPane.add(currentRowColumn1, 0, i + 1);
			gridPane.add(currentRowColumn2, 1, i + 1);
			gridPane.add(currentRowColumn3, 2, i + 1);
		}

		stage.setScene(scene);
		stage.show();
	}
	{	
PlayerManager players = new PlayerManager();

System.out.println("Number of offensive players in the draft: " + players.getNumberOfOffensivePlayers());
System.out.println("Number of defensive players in the draft: " + players.getNumberOfDefensivePlayers());
System.out.println("Number of special teams players in the draft: " + players.getNumberOfSpecialTeamsPlayers());
System.out.println("Total number of players in the draft: " + players.getNumberOfPlayers());

System.out.println("\r\n" + players.getOffensivePlayer(1).getFullName());
System.out.println("Position: " + players.getOffensivePlayer(1).getPosition());
System.out.println("Team: " + players.getOffensivePlayer(1).getTeam());
System.out.println("Number: " + players.getOffensivePlayer(1).getNumber());
System.out.println("Height: " + players.getOffensivePlayer(1).getHeight());
System.out.println("Weight: " + players.getOffensivePlayer(1).getWeight());


System.out.println("\r\nType: " + players.getOffensivePlayer(1).getPlayerType());


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
{
}

}
}