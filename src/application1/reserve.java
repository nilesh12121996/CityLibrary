package application1;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class reserve  {
	
	public AnchorPane re_start() {
		try
{	
			TreeTableView<reserve> tb = new TreeTableView<reserve>();
			tb.setLayoutX(34.0);
			tb.setLayoutY(128.0);
			tb.setPrefHeight(358.0);
			tb.setPrefWidth(393.0);
			TreeTableColumn<reserve,String> tc1=new TreeTableColumn<>("Name of the Book");
			tc1.setPrefWidth(160.0);
			TreeTableColumn<reserve, String> tc2=new TreeTableColumn<>("When Reserved");
			tc2.setPrefWidth(128.0);
			TreeTableColumn<reserve, String> tc3=new TreeTableColumn<>("Status");
			tc3.setPrefWidth(105.0);
			tb.getColumns().addAll(tc1,tc2,tc3);
			Font f3 = new Font(21);
			Font f2 = new Font(33);
			Font f4 = new Font(18);
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(34.0);
			lb2.setLayoutY(90.0);
			lb2.setText("List of Reserved Book");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(552.0);
			lb1.setLayoutY(24.0);
			lb1.setText("Reader");
			Button b6 = new Button();
			b6.setFont(f4);
			b6.setLayoutX(60.0);
			b6.setLayoutY(522.0);
			b6.setText("Checkout");
			SplitPane sp = new SplitPane();
			//sp.setLayoutX(-7.0);
			sp.setPrefSize(825, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,tb);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			return ap1;
}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}	
}
}


	

