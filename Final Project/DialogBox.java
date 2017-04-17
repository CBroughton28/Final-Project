package nflsrc;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.awt.*;
import javax.swing.AbstractAction;	

	public class DialogBox
	{
		private static int stageWidth = 400;
		private static int stageHeight = 150;
		
		public static void displayDialogBox(String stringTitle, String stringMessage)
		{

			Stage stage = new Stage();
			
	
			stage.setTitle(stringTitle);
			
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setResizable(false);
			
			VBox vBox = new VBox();
			vBox.setAlignment(Pos.CENTER);
			
			Button buttonOK = new Button("OK");
			buttonOK.setFont(Font.font("NewTimesRoman", FontWeight.BOLD, 14));
			buttonOK.setOnAction(event ->
			{
				stage.close();
			});
	

			GridPane gridPaneButtonOK = new GridPane();
			gridPaneButtonOK.getChildren().add(buttonOK);
			gridPaneButtonOK.setPadding(new Insets(10, 10, 10, 10));
			gridPaneButtonOK.setAlignment(Pos.CENTER);
	

			Label labelMessage = new Label(stringMessage);
			labelMessage.setFont(Font.font("NewTimesRoman", FontWeight.NORMAL, 16));
			labelMessage.setTextAlignment(TextAlignment.CENTER);
			labelMessage.setWrapText(true);
	

			GridPane gridPaneText = new GridPane();
			gridPaneText.getChildren().add(labelMessage);
			gridPaneText.setPadding(new Insets(10, 10, 10, 10));
			gridPaneText.setAlignment(Pos.CENTER);
			
			vBox.getChildren().addAll(gridPaneText, gridPaneButtonOK);
			
			Scene scene = new Scene(vBox, stageWidth, stageHeight);
	
			stage.setScene(scene);
			stage.show();
		}
	}

