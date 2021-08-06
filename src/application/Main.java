package application;
	




import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public void settextall(String txt)
	{
		Text text= new Text(txt);
		
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			Text text= new Text("Reader Function");
			text.setFont(Font.font("Verdana",22));
			text.setFill(Color.BLUE);
			Text text1= new Text("Administrative Function");
			text1.setFont(Font.font("Verdana",22));
			text1.setFill(Color.BLUE);
			Label crdnol=new Label("Card No:");
			TextField crdnotf=new TextField();
			Label adid=new Label("ID :");
			TextField adidtf=new TextField();
			Label adpass=new Label("Password :");
			TextField adpstf=new TextField();
			Button rdlogin = new Button("login");
			Button adlogin = new Button("login");
			Button quit = new Button("Quit");
			
			//Image bckimg=new Image("\\application\\library_img.jpg");
			//ImageView imgview=new ImageView(bckimg);
			imgview.setFitHeight(600);
			imgview.setFitWidth(600);
			imgview.setPickOnBounds(true);
			imgview.setPreserveRatio(true);
			VBox vf=new VBox();
			vf.setPrefHeight(402);
			Scene scene = new Scene(gridpane, 600, 600);
			scene.setFill(imgview);
  			primaryStage.setTitle("City Library");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	public void practice()
	{
		/*GridPane gridpane = new GridPane();
		gridpane.getChildren().addAll(text,text1,crdnol,crdnotf,adid,adidtf,adpass,adpstf,rdlogin,adlogin,quit);
		gridpane.getColumnConstraints().add(new ColumnConstraints(0));
	    gridpane.getColumnConstraints().add(new ColumnConstraints(300));
		GridPane.setConstraints(text, 1, 0);
		GridPane.setConstraints(text1, 2, 0);
		GridPane.setConstraints(crdnol, 1, 3);
		GridPane.setConstraints(crdnotf, 1, 4);
		GridPane.setConstraints(adid, 2, 1);
		GridPane.setConstraints(adidtf, 2, 2);
		GridPane.setConstraints(adpass, 2, 3);
		GridPane.setConstraints(adpstf, 2, 4);
		GridPane.setConstraints(rdlogin, 1, 6);
		GridPane.setConstraints(adlogin, 2, 5);
		GridPane.setConstraints(quit, 1, 8);
		/*HBox MainMenu=new HBox();
		MainMenu.getChildren().addAll(text,text1);
		MainMenu.setSpacing(50);
		HBox crdnohb=new HBox();
		crdnohb.getChildren().addAll(crdnol,crdnotf);
		crdnohb.setSpacing(10);
		VBox crdnov= new VBox();
		crdnov.getChildren().addAll(MainMenu,crdnohb);
		crdnov.setSpacing(20);*/
	}

}
