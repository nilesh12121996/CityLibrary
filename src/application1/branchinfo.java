package application1;
	

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.AnchorPane;

import javafx.scene.text.Font;


public class branchinfo  {
	public AnchorPane branchinfopane() {
		try {
			Button b10 = new Button();
			b10.setLayoutX(77.0);
			b10.setLayoutY(512.0);
			b10.setText("Print");
			Button b5 = new Button();
			b5.setLayoutX(251.0);
			b5.setLayoutY(149.0);
			b5.setText("Search");
			TreeTableView<branchinfo> tb = new TreeTableView<branchinfo>();
			tb.setLayoutX(77.0);
			tb.setLayoutY(268.0);
			tb.setPrefHeight(200.0);
			tb.setPrefWidth(413.0);
			TreeTableColumn<branchinfo,String> tc1=new TreeTableColumn<>("Name");
			tc1.setPrefWidth(75.0);
			TreeTableColumn<branchinfo, String> tc2=new TreeTableColumn<>("Location");
			tc2.setPrefWidth(75.0);
			tb.getColumns().addAll(tc1,tc2);
			ChoiceBox<branchinfo> cb = new ChoiceBox<branchinfo>();
			cb.setLayoutX(77);
			cb.setLayoutY(149);
			cb.setPrefWidth(150);
			Font f3 = new Font(19);
			Font f2 = new Font(33);
			Label lb4 = new Label();
			lb4.setFont(f3);
			lb4.setLayoutX(77.0);
			lb4.setLayoutY(57.0);
			lb4.setText("Branch Information");
			Label lb3 = new Label();
			lb3.setFont(f3);
			lb3.setLayoutX(77.0);
			lb3.setLayoutY(216.0);
			lb3.setText("Results of &quot;&quot;");
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(77.0);
			lb2.setLayoutY(103.0);
			lb2.setText("City");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(481.0);
			lb1.setLayoutY(22.0);
			lb1.setText("Administration");
			SplitPane sp = new SplitPane();
			sp.setLayoutX(-7.0);
			sp.setPrefSize(1033, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,lb3,b5,b10,cb,tb);
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
