package nflsrc;

	import java.util.ArrayList;
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.Label;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.ScrollPane;
	import javafx.scene.control.TextField;
	import javafx.scene.control.ToggleGroup;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
	import javafx.scene.text.Font;
	import javafx.stage.Stage;
	

	public class Main extends Application
	{	
	
		private final static Font defaultFont = new Font("Arial", 12);
		private final static Font defaultHeadingFont = new Font("Arial Bold", 12);
		
		private final static String stringButtonName = "Name";
		private final static String stringButtonPosition = "Position";
		private final static String stringButtonCollege = "Team";
		private final static String stringButtonIsDrafted = "Drafted";
		private final static String stringSortAscending = " " + (char)11015;
		private final static String stringSortDescending = " " + (char)11014;
		

		private static String positionFilter = "";
		private static String searchFilter = "";
	
		private static GridPane gridPane = new GridPane();
		private static HBox headerBox = new HBox();
		private static HBox footerBox = new HBox();
		private static VBox vBox = new VBox();
		
		public static void main(String[] args)
		{
			launch(args);
		}

		private String stringButtonTeam;
			
		@Override
		public void start(Stage stage)
		{
		
			stage.setTitle("NFL Draft");
			
		
			stage.setResizable(false);
	
			VBox vBoxTitle = new VBox();
			
			Scene scene = new Scene(vBoxTitle, 480, 640);
			
		
			VBox titleScreen = new VBox();
			
			
			Image image = new Image("NFLDraft.png");
			ImageView imageTitle = new ImageView();
			imageTitle.setImage(image);
			
			titleScreen.getChildren().addAll(imageTitle);
			titleScreen.setAlignment(Pos.CENTER);
			
			
			Button buttonEnterDraft = new Button("Enter Draft");
			buttonEnterDraft.setFont(defaultHeadingFont);
			
			buttonEnterDraft.setOnAction(event ->
			{
			createGrid(stage);
			});
			
			vBoxTitle.getChildren().addAll(titleScreen, buttonEnterDraft);
			vBoxTitle.setSpacing(10);
			vBoxTitle.setAlignment(Pos.CENTER);
			
			updateScene(stage, scene);
		}
	

		private void createGrid(Stage stage)
		{
	
			PlayerManager players = new PlayerManager();
			
			Scene scene = new Scene(vBox, 480, 640);
			
			ChoiceBox<String> choiceBoxPosition = new ChoiceBox<>();
			choiceBoxPosition.getItems().add("All Players");
			choiceBoxPosition.getItems().add("Quarterback");
			choiceBoxPosition.getItems().add("Halfback");
			choiceBoxPosition.getItems().add("Fullback");
			choiceBoxPosition.getItems().add("Wide Receiver");
			choiceBoxPosition.getItems().add("Tight End");
			choiceBoxPosition.getItems().add("Offensive Tackle");
			choiceBoxPosition.getItems().add("Guard");
			choiceBoxPosition.getItems().add("Center");
			choiceBoxPosition.getItems().add("Defensive End");
			choiceBoxPosition.getItems().add("Defensive Tackle");
			choiceBoxPosition.getItems().add("Inside Linebacker");
			choiceBoxPosition.getItems().add("Outside Linebacker");
			choiceBoxPosition.getItems().add("Cornerback");
			choiceBoxPosition.getItems().add("Free Safety");
			choiceBoxPosition.getItems().add("Strong Safety");
			choiceBoxPosition.getItems().add("Kicker");
			choiceBoxPosition.getItems().add("Punter");
			choiceBoxPosition.setValue("All Players");
			Button buttonPositionFilter = new Button("Filter");
			
			// Used to separate search and position filter
			Label headerWhiteSpace = new Label(" ");
			
			TextField textFieldSearch = new TextField();
			textFieldSearch.setMaxWidth(130);
			textFieldSearch.setPromptText("Search by name");
			Button buttonSearch = new Button("Search");
			Button buttonClear = new Button("Clear");
			
			headerBox.getChildren().addAll(choiceBoxPosition, buttonPositionFilter, headerWhiteSpace, textFieldSearch, buttonSearch, buttonClear);
			headerBox.setAlignment(Pos.CENTER);
			headerBox.setSpacing(10);
			headerBox.setPadding(new Insets(10, 10, 10, 10));
			
			ScrollPane playerScrollPane = new ScrollPane();
			playerScrollPane.setPrefHeight(640);
			playerScrollPane.setContent(gridPane);
			playerScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
			playerScrollPane.setFitToHeight(true);
			playerScrollPane.setVmax(480);
			playerScrollPane.setFitToWidth(true);
			playerScrollPane.setFitToHeight(true);
			
			footerBox.setAlignment(Pos.CENTER);
			footerBox.setSpacing(30);
			footerBox.setPadding(new Insets(10, 10, 10, 10));
			
			gridPane.setHgap(10);
			gridPane.setVgap(2);
			gridPane.setPadding(new Insets(10, 10, 10, 10));
	
			Button buttonName = new Button(stringButtonName);
			Button buttonPosition = new Button(stringButtonPosition);
			Button buttonTeam = new Button(stringButtonTeam);
			Button buttonIsDrafted = new Button(stringButtonIsDrafted);
	

			buttonName.setFont(defaultHeadingFont);
			buttonPosition.setFont(defaultHeadingFont);
			buttonTeam.setFont(defaultHeadingFont);
			buttonIsDrafted.setFont(defaultHeadingFont);
	

			gridPane.add(buttonName, 1, 0);
			gridPane.add(buttonPosition, 2, 0);
			gridPane.add(buttonTeam, 3, 0);
			gridPane.add(buttonIsDrafted, 4, 0);
				
	
			vBox.getChildren().addAll(headerBox, playerScrollPane, footerBox);
			
			buttonPositionFilter.setOnAction(event ->
			{
				positionFilter = choiceBoxPosition.getValue().toString();
				
				if (positionFilter == "All Players")
				{
					positionFilter = "";
				}
				
				displayPlayers(stage, gridPane, players, scene);
			});
			
		
			buttonSearch.setOnAction(event ->
			{
	
				searchFilter = textFieldSearch.getText().toLowerCase();
	

				displayPlayers(stage, gridPane, players, scene);
			});
			
			buttonClear.setOnAction(event ->
			{
				textFieldSearch.setText("");
				searchFilter = "";
	

				displayPlayers(stage, gridPane, players, scene);
			});
			
					buttonName.setOnAction(event ->
			{
				if (players.getIsSortedAscending())
				{
					players.sortByNameDescending();
	

					buttonPosition.setText(stringButtonPosition);
					buttonTeam.setText(stringButtonTeam);
					buttonIsDrafted.setText(stringButtonIsDrafted);
					buttonName.setText(stringButtonName + stringSortDescending);
				}
				else
				{
					players.sortByNameAscending();
					
					buttonPosition.setText(stringButtonPosition);
					buttonTeam.setText(stringButtonTeam);
					buttonIsDrafted.setText(stringButtonIsDrafted);
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
					buttonIsDrafted.setText(stringButtonIsDrafted);
					buttonPosition.setText(stringButtonPosition + stringSortDescending);
				}
				else
				{
					players.sortByPositionAscending();
					
					buttonName.setText(stringButtonName);
					buttonTeam.setText(stringButtonTeam);
					buttonIsDrafted.setText(stringButtonIsDrafted);
					buttonPosition.setText(stringButtonPosition + stringSortAscending);
				}
				
				displayPlayers(stage, gridPane, players, scene);
			});
	
			buttonTeam.setOnAction(event ->
			{
				if (players.getIsSortedAscending())
				{
					players.sortByIsDraftedDescending();
					
					buttonName.setText(stringButtonName);
					buttonPosition.setText(stringButtonPosition);
					buttonIsDrafted.setText(stringButtonIsDrafted);
					buttonTeam.setText(stringButtonTeam + stringSortDescending);
				}
				else
				{
					players.sortByTeamAscending();
					
					buttonName.setText(stringButtonName);
					buttonPosition.setText(stringButtonPosition);
					buttonIsDrafted.setText(stringButtonIsDrafted);
					buttonTeam.setText(stringButtonTeam + stringSortAscending);
				}
				
				displayPlayers(stage, gridPane, players, scene);
			});
			
			buttonIsDrafted.setOnAction(event ->
			{
				if (players.getIsSortedAscending())
				{
					players.sortByIsDraftedDescending();
					
					buttonName.setText(stringButtonName);
					buttonPosition.setText(stringButtonPosition);
					buttonTeam.setText(stringButtonTeam);
					buttonIsDrafted.setText(stringButtonIsDrafted+ stringSortDescending);
				}
				else
				{
					players.sortByIsDraftedAscending();
					
					buttonName.setText(stringButtonName);
					buttonPosition.setText(stringButtonPosition);
					buttonTeam.setText(stringButtonTeam);
					buttonIsDrafted.setText(stringButtonIsDrafted + stringSortAscending);
				}
				
				displayPlayers(stage, gridPane, players, scene);
			});
			
		
			displayPlayers(stage, gridPane, players, scene);
		}
		
		private void updateScene(Stage stage, Scene scene)
		{
			stage.setScene(scene);
			stage.show();
		}
		
		private void displayPlayers(Stage stage, GridPane gridPane, PlayerManager players, Scene scene)
		{		
			GridPane tempGridPane = new GridPane();
			int column = 1;
			tempGridPane.add(gridPane.getChildren().get(0), column++, 0);
			tempGridPane.add(gridPane.getChildren().get(0), column++, 0);
			tempGridPane.add(gridPane.getChildren().get(0), column++, 0);
			tempGridPane.add(gridPane.getChildren().get(0), column++, 0);
			
			gridPane.getChildren().clear();
			
			column = 1;

			gridPane.add(tempGridPane.getChildren().get(0), column++, 0);
			gridPane.add(tempGridPane.getChildren().get(0), column++, 0);
			gridPane.add(tempGridPane.getChildren().get(0), column++, 0);
			gridPane.add(tempGridPane.getChildren().get(0), column++, 0);
			

			final ToggleGroup group = new ToggleGroup();
			
	
			ArrayList<RadioButton> radioButtons = new ArrayList<>();
			
			// Arrays
			ArrayList<Label> columnName = new ArrayList<>();
			ArrayList<Label> columnPosition = new ArrayList<>();
			ArrayList<Label> columnTeam = new ArrayList<>();
			ArrayList<Label> columnIsDrafted = new ArrayList<>();
			
			int numberPlayersSkipped = 0;
		
			for (int i = 0; i < players.getNumberOfPlayers(); i++)
			{
		
				if (players.getPlayerInfo(i).getPosition().contains(positionFilter)
						&& players.getPlayerInfo(i).getFullName().toLowerCase().contains(searchFilter))
				{
					{
						radioButtons.add(new RadioButton());
						radioButtons.get(i - numberPlayersSkipped).setToggleGroup(group);
	

						radioButtons.get(i - numberPlayersSkipped).setId("" + players.getPlayerInfo(i).getPlayerID());
	

						columnName.add(new Label(players.getPlayerInfo(i).getFullName()));
						columnPosition.add(new Label(players.getPlayerInfo(i).getPosition()));
						columnTeam.add(new Label(players.getPlayerInfo(i).getTeam()));
						columnIsDrafted.add(new Label("" + players.getPlayerInfo(i).getIsDraftedString()));
	

						columnName.get(i - numberPlayersSkipped).setFont(defaultFont);
						columnPosition.get(i - numberPlayersSkipped).setFont(defaultFont);
						columnTeam.get(i - numberPlayersSkipped).setFont(defaultFont);
						columnIsDrafted.get(i - numberPlayersSkipped).setFont(defaultFont);
	

						gridPane.add(radioButtons.get(i - numberPlayersSkipped), 0, i + 1 - numberPlayersSkipped);
						gridPane.add(columnName.get(i - numberPlayersSkipped), 1, i + 1 - numberPlayersSkipped);
						gridPane.add(columnPosition.get(i - numberPlayersSkipped), 2, i + 1 - numberPlayersSkipped);
						gridPane.add(columnTeam.get(i - numberPlayersSkipped), 3, i + 1 - numberPlayersSkipped);
						gridPane.add(columnIsDrafted.get(i - numberPlayersSkipped), 4, i + 1 - numberPlayersSkipped);
					}
				}
				else
				{
					numberPlayersSkipped++;
				}
			}
				
			Button buttonDraftPlayer = new Button("Draft Player");
			buttonDraftPlayer.setFont(defaultHeadingFont);
			buttonDraftPlayer.setOnAction(event ->
			{
				try
				{
	
					RadioButton selectedRadio = (RadioButton)group.getSelectedToggle();
					int selectedPlayerID = Integer.parseInt(selectedRadio.getId());
	

					if (!players.getPlayerInfoByID(selectedPlayerID).getIsDrafted())
					{
						players.getPlayerInfoByID(selectedPlayerID).celebrate();
	
						players.getPlayerInfoByID(selectedPlayerID).setIsDrafted(true);
					}
					else
					{
						DialogBox.displayDialogBox("Warning",
								players.getPlayerInfoByID(selectedPlayerID).getFullName() + " has already been drafted.");
					}
	

					displayPlayers(stage, gridPane, players, scene);
				}
				catch (Exception e)
				{

					DialogBox.displayDialogBox("Warning", "No player selected.  Please select a player before drafting.");
					return;
				}
			});
			
			Button buttonRemovePlayer = new Button("Remove Player");
			buttonRemovePlayer.setFont(defaultHeadingFont);
			buttonRemovePlayer.setOnAction(event ->
			{
				try
				{
		
					RadioButton selectedRadio = (RadioButton)group.getSelectedToggle();
					int selectedPlayerID = Integer.parseInt(selectedRadio.getId());
	

					if (players.getPlayerInfoByID(selectedPlayerID).getIsDrafted())
					{
	
						players.getPlayerInfoByID(selectedPlayerID).setIsDrafted(false);
					}
					else
					{
						DialogBox.displayDialogBox("Warning", players.getPlayerInfoByID(selectedPlayerID).getFullName()
								+ " is not on the roster and cannot be removed.");
					}
	

					displayPlayers(stage, gridPane, players, scene);
				}
				catch (Exception e)
				{
	
					DialogBox.displayDialogBox("Warning", "No player selected.  Please select a player before removing.");
					return;
				}
			});
			
			Button buttonPlayerCard = new Button("Player Card");
			buttonPlayerCard.setFont(defaultHeadingFont);
			buttonPlayerCard.setOnAction(event ->
			{
	

				try
				{
		
					RadioButton selectedRadio = (RadioButton)group.getSelectedToggle();
					int selectedPlayerID = Integer.parseInt(selectedRadio.getId());
					String type = players.getPlayerInfoByID(selectedPlayerID).getPlayerType();
					
					switch (type)
					{
					case "Offense":
						PlayerCard.displayOffensivePlayerCard(players.getOffensivePlayerInfoByID(selectedPlayerID));
						break;
					case "Defense":
						PlayerCard.displayDefensivePlayerCard(players.getDefensivePlayerInfoByID(selectedPlayerID));
						break;
					case "Special Teams":
						PlayerCard.displaySpecialTeamsPlayerCard(players.getSpecialTeamsPlayerInfoByID(selectedPlayerID));
						break;
					default:
						PlayerCard.displayOffensivePlayerCard(players.getOffensivePlayerInfoByID(selectedPlayerID));
						break;
					}
				}
				catch (Exception e)
				{
					DialogBox.displayDialogBox("Warning", "No player selected.  Please select a player before opening a player card.");
					return;
				}
			});
			
		
			Button buttonEndDraft = new Button("End Draft");
			buttonEndDraft.setFont(defaultHeadingFont);
			buttonEndDraft.setOnAction(event ->
			{
				TeamReview.displayTeamReview(players);
			});
			
	
			footerBox.getChildren().clear();
			footerBox.getChildren().addAll(buttonDraftPlayer, buttonRemovePlayer, buttonPlayerCard, buttonEndDraft);
	

	
			updateScene(stage, scene);
		}
	}

