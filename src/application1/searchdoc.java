package application1;
	

import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;


public class searchdoc  {
	public AnchorPane searchpane() {
		try {
			Font f4 = new Font(19);
			Button b5 = new Button();
			b5.setLayoutX(325.0);
			b5.setLayoutY(155.0);
			b5.setText("Search");
			TreeTableView<searchdoc> tb = new TreeTableView<searchdoc>();
			tb.setLayoutX(77.0);
			tb.setLayoutY(268.0);
			tb.setPrefHeight(200.0);
			tb.setPrefWidth(413.0);
			TreeTableColumn<searchdoc,String> tc1=new TreeTableColumn<>("ID");
			tc1.setPrefWidth(75.0);
			TreeTableColumn<searchdoc, String> tc2=new TreeTableColumn<>("Title");
			tc2.setPrefWidth(75.0);
			TreeTableColumn<searchdoc, String> tc3=new TreeTableColumn<>("Status");
			tc3.setPrefWidth(75.0);
			tb.getColumns().addAll(tc1,tc2,tc3);
			TextField txt = new TextField();
			txt.setFont(f4);
			txt.setLayoutX(77.0);
			txt.setLayoutY(149.0);
			txt.setPromptText("Search by Document");
			Font f3 = new Font(19);
			Font f2 = new Font(33);
			Label lb3 = new Label();
			lb3.setFont(f3);
			lb3.setLayoutX(77.0);
			lb3.setLayoutY(216.0);
			lb3.setText("Results of &quot;&quot;");
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(77.0);
			lb2.setLayoutY(103.0);
			lb2.setText("Search a Document");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(481.0);
			lb1.setLayoutY(22.0);
			lb1.setText("Administration");
			SplitPane sp = new SplitPane();
			sp.setLayoutX(-7.0);
			sp.setPrefSize(1033, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,lb3,b5,txt,tb);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			return ap1;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	}
