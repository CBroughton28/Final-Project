package nflsrc;

	import java.text.DecimalFormat;
	import java.text.NumberFormat;
	import java.util.ArrayList;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.VBox;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontWeight;
	import javafx.stage.Modality;
	import javafx.stage.Stage;
	import java.awt.*;
	import javax.swing.AbstractAction;

	public class PlayerCard
	{
		private static int stageWidth = 650;
		private static int stageHeight = 450;
		
		public static void displayOffensivePlayerCard(OffensivePlayer player)
		{
			Stage stage = new Stage();
			
			stage.setTitle("Player Card for " + player.getFullName());
	
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setResizable(false);
		
			VBox vBox = new VBox();
			
			Button buttonBack = new Button("Back");
			buttonBack.setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 14));
			buttonBack.setOnAction(event ->
			{
				stage.close();
			});
			
			GridPane gridPaneButtonBack = new GridPane();
			gridPaneButtonBack.getChildren().add(buttonBack);
			gridPaneButtonBack.setPadding(new Insets(10, 10, 10, 10));
			
			GridPane gridPaneGenericStats = createGenericStatsGrid(player);
			GridPane gridPaneOffensiveStats;
	

			switch (player.getPosition())
			{
			case "Quarterback":
				gridPaneOffensiveStats = createQBStatsGrid(player);
				break;
			case "Halfback":
				gridPaneOffensiveStats = createRBStatsGrid(player);
				break;
			case "Fullback":
				gridPaneOffensiveStats = createRBStatsGrid(player);
				break;
			case "Wide Receiver":
				gridPaneOffensiveStats = createWRStatsGrid(player);
				break;
			case "Tight End":
				gridPaneOffensiveStats = createWRStatsGrid(player);
				break;
			case "Tackle":
				gridPaneOffensiveStats = createOLStatsGrid(player);
				break;
			case "Guard":
				gridPaneOffensiveStats = createOLStatsGrid(player);
				break;
			case "Center":
				gridPaneOffensiveStats = createOLStatsGrid(player);
				break;
			default:
				gridPaneOffensiveStats = createOLStatsGrid(player);
				break;
			}
			
			vBox.getChildren().addAll(gridPaneButtonBack, gridPaneGenericStats, gridPaneOffensiveStats);
			
	
			Scene scene = new Scene(vBox, stageWidth, stageHeight);
	
			stage.setScene(scene);
			stage.show();
		}
		
		public static void displayDefensivePlayerCard(DefensivePlayer player)
		{
			Stage stage = new Stage();
			
			stage.setTitle("Player Card for " + player.getFullName());
			
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setResizable(false);
			
			VBox vBox = new VBox();
			
			Button buttonBack = new Button("Back");
			buttonBack.setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 14));
			buttonBack.setOnAction(event ->
			{
				stage.close();
			});
			
			GridPane gridPaneButtonBack = new GridPane();
			gridPaneButtonBack.getChildren().add(buttonBack);
			gridPaneButtonBack.setPadding(new Insets(10, 10, 10, 10));
			
			GridPane gridPaneGenericStats = createGenericStatsGrid(player);
			GridPane gridPaneDefensiveStats;
			
			gridPaneDefensiveStats = createDefensiveStatsGrid(player);
			
			vBox.getChildren().addAll(gridPaneButtonBack, gridPaneGenericStats, gridPaneDefensiveStats);
			
			Scene scene = new Scene(vBox, stageWidth, stageHeight);
	
			stage.setScene(scene);
			stage.show();
		}
		
		public static void displaySpecialTeamsPlayerCard(SpecialTeamsPlayer player)
		{

			Stage stage = new Stage();
					
			stage.setTitle("Player Card for " + player.getFullName());
			
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setResizable(false);
			
			VBox vBox = new VBox();
			
			Button buttonBack = new Button("Back");
			buttonBack.setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 14));
			buttonBack.setOnAction(event ->
			{
				stage.close();
			});
			
			GridPane gridPaneButtonBack = new GridPane();
			gridPaneButtonBack.getChildren().add(buttonBack);
			gridPaneButtonBack.setPadding(new Insets(10, 10, 10, 10));
			
			GridPane gridPaneGenericStats = createGenericStatsGrid(player);
			GridPane gridPaneSpecialTeamsStats;
	

			switch (player.getPosition())
			{
			case "Kicker":
				gridPaneSpecialTeamsStats = createKStatsGrid(player);
				break;
			case "Punter":
				gridPaneSpecialTeamsStats = createPStatsGrid(player);
				break;
			default:
				gridPaneSpecialTeamsStats = createPStatsGrid(player);
				break;
			}

			vBox.getChildren().addAll(gridPaneButtonBack, gridPaneGenericStats, gridPaneSpecialTeamsStats);
			
			Scene scene = new Scene(vBox, stageWidth, stageHeight);
	
			stage.setScene(scene);
			stage.show();
		}
		
		
		private static GridPane createQBStatsGrid(OffensivePlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
			
			ArrayList<Label> labels = new ArrayList<>();
			
			int currentRow = 0;
			
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
			
			currentRow++;
			
			int column = 0;
			
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("CMP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("ATT"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("PCT"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("INT"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("QBR"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			currentRow++;
			
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassingCompletions()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassingAttempts()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				DecimalFormat decimalFormat = new DecimalFormat(".#");
				labels.add(new Label("" + decimalFormat.format(player.SeasonStatsList.get(i).getPassingCompletionPercentage())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassingYards()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassingTouchdowns()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassingInterceptions()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + decimalFormat.format(player.SeasonStatsList.get(i).getQuarterbackRating())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
			
			currentRow++;
			
			return gridPane;
		}
		
		private static GridPane createRBStatsGrid(OffensivePlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
			
			ArrayList<Label> labels = new ArrayList<>();
			
			int currentRow = 0;
			
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
			
			currentRow++;
			
			int column = 0;
			
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("RSH"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("Y/A"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("LNG"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("REC"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("LNG"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			currentRow++;
	
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getRushingAttempts()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getRushingYards()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				DecimalFormat decimalFormat = new DecimalFormat(".#");
				labels.add(new Label("" + decimalFormat.format(player.SeasonStatsList.get(i).getRushingYardsAverage())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getRushingYardsLong()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getRushingTouchdowns()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceptions()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingYards()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingYardsLong()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingTouchdowns()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
			
			currentRow++;
			
			return gridPane;
		}
		
		private static GridPane createWRStatsGrid(OffensivePlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
			
			ArrayList<Label> labels = new ArrayList<>();
			
			int currentRow = 0;
			
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
			
			currentRow++;
			
			int column = 0;
			
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("REC"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("Y/C"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("LNG"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FUM"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			currentRow++;
			
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceptions()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingYards()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
	
				DecimalFormat decimalFormat = new DecimalFormat(".#");
				labels.add(new Label("" + decimalFormat.format(player.SeasonStatsList.get(i).getReceivingYardsAverage())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingYardsLong()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getReceivingTouchdowns()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getFumbles()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
			
			return gridPane;
		}
		
		private static GridPane createOLStatsGrid(OffensivePlayer player)
		{

			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	
			ArrayList<Label> labels = new ArrayList<>();
	
			int currentRow = 0;
	
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
	
			currentRow++;
	
			int column = 0;
	
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
	

			labels.add(new Label("GS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			currentRow++;
	
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;

				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
	

				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesStarted()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
	
			currentRow++;
	
			return gridPane;
		}
		
		private static GridPane createDefensiveStatsGrid(DefensivePlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	
			ArrayList<Label> labels = new ArrayList<>();
	
			int currentRow = 0;
	
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
	
			currentRow++;
	
			int column = 0;
	
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TKL"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("SOLO"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("AST"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("SCK"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FF"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FR"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("PD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("INT"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TD"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			

			currentRow++;
	
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
	

				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getTotalTackles()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getSoloTackles()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getTackleAssists()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getSacks()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getForcedFumbles()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getRecoveredFumbles()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPassesDefended()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getInterceptions()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getInterceptionReturnYards()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getInterceptionTouchdowns()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
	
			currentRow++;
	
			return gridPane;
		}
		
		private static GridPane createKStatsGrid(SpecialTeamsPlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	

			ArrayList<Label> labels = new ArrayList<>();
	
			int currentRow = 0;
	

			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
	

			currentRow++;
	

			int column = 0;
	
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FGM"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FGA"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("FG%"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("LNG"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("BLK"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
					
			currentRow++;
	
			NumberFormat percentFormat = NumberFormat.getPercentInstance();
			percentFormat.setMinimumFractionDigits(1);
			
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
	
				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getFieldGoalsMade()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getFieldGoalsAttempted()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + percentFormat.format(player.SeasonStatsList.get(i).getFieldGoalPercentage())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getFieldGoalLongMade()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getFieldGoalsBlocked()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
	
			currentRow++;
			
			return gridPane;
		}
	
		private static GridPane createPStatsGrid(SpecialTeamsPlayer player)
		{
			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	

			ArrayList<Label> labels = new ArrayList<>();
	
			int currentRow = 0;
	
			labels.add(new Label("Stats"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), 0, currentRow);
	

			currentRow++;
			
			DecimalFormat decimalFormatOne = new DecimalFormat(".#");

			int column = 0;
	
			labels.add(new Label("Year"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("GP"));
			labels.get(labels.size() - 1).setFont(Font.font("", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("P"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("YDS"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("Y/P"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("LNG"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("TB"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("IN20"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
			
			labels.add(new Label("BLK"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			gridPane.add(labels.get(labels.size() - 1), column++, currentRow);
					
			currentRow++;
	
			for (int i = 0; i < player.SeasonStatsList.size(); i++)
			{
				column = 0;
	
				labels.add(new Label("" + player.SeasonStatsList.get(i).getYearNumber()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getGamesPlayed()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getTotalPunts()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPuntYardsGross()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + decimalFormatOne.format(player.SeasonStatsList.get(i).getPuntYardsGrossAverage())));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPuntYardsLong()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPuntTouchbacks()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPuntsInside20()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
				
				labels.add(new Label("" + player.SeasonStatsList.get(i).getPuntsBlocked()));
				labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
				gridPane.add(labels.get(labels.size() - 1), column++, i + currentRow);
			}
	
			currentRow++;
	

			return gridPane;
		}
	

		private static GridPane createGenericStatsGrid(NFLPlayer player)
		{

			GridPane gridPane = new GridPane();
	
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	

			ArrayList<Label> labels = new ArrayList<>();
	

			labels.add(new Label("Details"));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 16));
			labels.add(new Label("Name: " + player.getFullName()));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
			labels.add(new Label("Position: " + player.getPosition()));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
			labels.add(new Label("Team: " + player.getTeam()));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
			labels.add(new Label("Height: " + convertHeightToString(player.getHeight())));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
			labels.add(new Label("Weight: " + player.getWeight() + " lbs."));
			labels.get(labels.size() - 1).setFont(Font.font("NewTimesRoman", 16));
	

			for (int i = 0; i < labels.size(); i++)
			{
				gridPane.add(labels.get(i), 0, i);
			}
			
			return gridPane;
		}
		
		private static String convertHeightToString(int height)
		{
			return height/12 + "'" + height%12 + "\"";
		}
	}

