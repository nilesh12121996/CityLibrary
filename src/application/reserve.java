package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class reserve extends Application {
	@Override
	public void start(Stage primaryStage) {
		try
{	
	
	Font f3 = new Font(21);
	Font f2 = new Font(33);
	Label lb2 = new Label();
	lb2.setFont(f3);
	lb2.setLayoutX(34.0);
	lb2.setLayoutY(90.0);
	lb2.setText("List of Issued Book");
	Label lb1 = new Label();
	lb1.setFont(f2);
	lb1.setLayoutX(552.0);
	lb1.setLayoutY(24.0);
	lb1.setText("Reader");
	Font f1 = new Font(20);
	Button b4 = new Button();
	b4.setLayoutX(-5.0);
	b4.setLayoutY(212.0);
	b4.setPrefSize(207, 49);
	b4.setText("Exit");
	Button b3 = new Button();
	b3.setLayoutX(-5.0);
	b3.setLayoutY(163.0);
	b3.setPrefSize(207, 49);
	b3.setText("Reserved");
	Button b2 = new Button();
	b2.setLayoutX(-5.0);
	b2.setLayoutY(114.0);
	b2.setPrefSize(207, 49);
	b2.setText("Return");
	Button b1 = new Button();
	b1.setLayoutX(-5.0);
	b1.setLayoutY(65.0);
	b1.setPrefSize(207, 49);
	b1.setText("Search");
	Label lb = new Label();
	lb.setFont(f1);
	lb.setLayoutX(27.0);
	lb.setLayoutY(14.0);
	lb.setText("Menu");
	Image img = new Image("\\application1\\library_img.jpg");
	AnchorPane ap2 = new AnchorPane();
	ap2.minHeight(0);
	ap2.minWidth(0);
	ap2.setPrefSize(100, 160);
	AnchorPane ap1 = new AnchorPane();
	ap1.getChildren().addAll(ap2,lb,b1,b2,b3,b4);
	ap1.minHeight(0);
	ap1.minWidth(0);
	ap1.setPrefSize(100, 160);
	SplitPane sp = new SplitPane();
	sp.setPrefSize(1026,646);
	Scene sc = new Scene(sp);
	primaryStage.setScene(sc);
	primaryStage.show();
}
	catch(Exception e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	launch(args);
}
}


	

