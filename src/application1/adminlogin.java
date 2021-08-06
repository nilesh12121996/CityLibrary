package application1;
	

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class adminlogin  {
	public AnchorPane admin_login(Stage st) {
		try {
			citylibdbcon cldb=new citylibdbcon();
			Connection con=cldb.DBConnection();
			Statement state=con.createStatement();
			Font f4 = new Font(19);
			Button b5 = new Button();
			b5.setLayoutX(128.0);
			b5.setLayoutY(277.0);
			b5.setPrefSize(207, 49);
			b5.setText("Login");
			PasswordField pwd = new PasswordField();
			pwd.setLayoutX(262);
			pwd.setLayoutY(207);
			TextField txt = new TextField();
			txt.setFont(f4);
			txt.setLayoutX(262.0);
			txt.setLayoutY(149.0);
			Font f5 = new Font(19);
			Font f3 = new Font(19);
			Font f2 = new Font(33);
			Label lb3 = new Label();
			lb3.setFont(f5);
			lb3.setLayoutX(128.0);
			lb3.setLayoutY(208.0);
			lb3.setText("Password");
			Label lb2 = new Label();
			lb2.setFont(f3);
			lb2.setLayoutX(128.0);
			lb2.setLayoutY(150.0);
			lb2.setText("User ID");
			Label lb1 = new Label();
			lb1.setFont(f2);
			lb1.setLayoutX(552.0);
			lb1.setLayoutY(24.0);
			lb1.setText("Administration Login");
			Label err = new Label();
			err.setFont(f3);
			err.setLayoutX(128.0);
			err.setLayoutY(340.0);
			err.setTextFill(Color.RED);
			err.setText("");
			SplitPane sp = new SplitPane();
			sp.setLayoutX(-7.0);
			sp.setPrefSize(1033, 646);
			AnchorPane ap1 = new AnchorPane();
			ap1.getChildren().addAll(sp,lb1,lb2,lb3,b5,txt,pwd,err);
			ap1.minHeight(0);
			ap1.minWidth(0);
			ap1.setLayoutX(204.0);
			//ap1.setLayoutY(-3.0);
			ap1.setPrefSize(825, 646);
			Adminmain am=new Adminmain();
			b5.addEventHandler(MouseEvent.MOUSE_PRESSED,
					(event) ->  {
					// TODO Auto-generated method stub
						if (txt.getText().trim().isEmpty() || pwd.getText().trim().isEmpty())
						{
							if(txt.getText().trim().isEmpty())
								err.setText("Please enter admin id");
							else
								err.setText("Please enter admin password");
						}
						else
						{
							if (txt.getText().matches("-?([1-9][0-9]*)?")) {
							try {
								ResultSet rs=state.executeQuery("select adminid, password from admin_login where adminid ='"+txt.getText()+"'");
								if(rs.next())
								{
									Integer pass=rs.getInt(2);
									System.out.print("password :"+pass+"\t");
									if(pass==Integer.parseInt(pwd.getText()))
										{st.close();
										 am.admain(st);}
									else
										err.setText("Password is incorrect");
								}
								else
								{
									err.setText("Admin Id not there in database");
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}}
							else
							{
									err.setText("Admin Id should be numeric");
					
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
