package application1;
	


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class readerlogin  {
	
	public AnchorPane reader_login(Stage st) {
		try {
			citylibdbcon cldb=new citylibdbcon();
			Connection con=cldb.DBConnection();
			Statement state=con.createStatement();
			Font f4 = new Font(19);
			Button b5 = new Button();
			b5.setLayoutX(128.0);
			b5.setLayoutY(219.0);
			b5.setPrefSize(207, 49);
			b5.setText("Login");
			TextField txt = new TextField();
			txt.setFont(f4);
			txt.setLayoutX(262.0);
			txt.setLayoutY(149.0);
			Font f3 = new Font(19);
			Font f2 = new Font(33);
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(128.0);
			lb2.setLayoutY(150.0);
			lb2.setText("Card Number");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(552.0);
			lb1.setLayoutY(24.0);
			lb1.setText("Reader Login");
			Label err = new Label();
			err.setFont(f3);
			err.setLayoutX(128.0);
			err.setLayoutY(300.0);
			err.setTextFill(Color.RED);
			err.setText("");
			SplitPane sp = new SplitPane();
			sp.setLayoutX(-7.0);
			sp.setPrefSize(1033, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,b5,txt,err);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			Reader_Main rm=new Reader_Main();
			b5.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
						if (txt.getText().trim().isEmpty())
						{
							err.setText("Please enter card number");
						}
						else
						{
							if (txt.getText().matches("-?([1-9][0-9]*)?")) {
							try {
								ResultSet rs=state.executeQuery("select rname from reader where readerid ='"+txt.getText()+"'");
								if(rs.next())
								{
									st.close();
									System.setProperty("readername", rs.getString("rname"));
									System.setProperty("readerid", txt.getText().toString());
									rm.readermain(st);
								}
								else
								{
									err.setText("Reader Id not there in database");
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}}
							else
							{
								err.setText("Reader Id should be numeric");
							}
						}
					});
			return ap1;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
