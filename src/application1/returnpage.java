package application1;


import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class returnpage {
	
	public AnchorPane re_start(/*Stage primaryStage*/) {
		try
{	
			TreeTableView<returnpage> tb = new TreeTableView<returnpage>();
			tb.setLayoutX(34.0);
			tb.setLayoutY(128.0);
			tb.setPrefHeight(358.0);
			tb.setPrefWidth(410.0);
			TreeTableColumn<returnpage, String> tc2=new TreeTableColumn<>("Name of the Book");
			tc2.setPrefWidth(123.0);
			TreeTableColumn<returnpage, String> tc3=new TreeTableColumn<>("When Issued");
			tc3.setPrefWidth(105.0);
			TreeTableColumn<returnpage, String> tc4=new TreeTableColumn<>("Due Date");
			tc4.setPrefWidth(105.0);
			TreeTableColumn<returnpage, String> tc5=new TreeTableColumn<>("Fine");
			tc5.setPrefWidth(105.0);
			tb.getColumns().addAll(tc2,tc3,tc4,tc5);
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
	SplitPane sp = new SplitPane();
	//sp.setLayoutX(-7.0);
	sp.setPrefSize(825, 646);
	AnchorPane ap2 = new AnchorPane();
	ap2.getChildren().addAll(sp,tb,lb1,lb2);
	ap2.minHeight(0);
	ap2.minWidth(0);
	ap2.setLayoutX(204.0);
	ap2.setLayoutY(-3.0);
	ap2.setPrefSize(825, 646);
	return ap2;
	/*Font f1 = new Font(20);
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
	Image img = new Image("\\application1\\library_img.jpg");*/
	//ap2.setPrefSize(100, 160);
	/*AnchorPane ap1 = new AnchorPane();
	ap1.getChildren().addAll(lb,b1,b2,b3,b4);
	ap1.minHeight(0);
	ap1.minWidth(0);
	ap1.setPrefSize(380, 482);
	//ap1.setPrefSize(100, 160);
	SplitPane sp = new SplitPane();
	sp.setPrefSize(912,618);
	sp.getItems().addAll(ap1,ap2);
	Scene sc = new Scene(sp);
	Stage stage=new Stage();
	stage.setScene(sc);
	stage.show();
	stage.setOnCloseRequest(Event -> {stage.close();});*/
}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
}
}


	

