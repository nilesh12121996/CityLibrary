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

public class reader_search {
	String searchstr="";
	
	public AnchorPane search()
	{
		try {
		result1 rs=new result1();
		citylibdbcon cldb=new citylibdbcon();
		Connection con=cldb.DBConnection();
		Statement state=con.createStatement();
		Font f6 = new Font(33);
		Font f5 = new Font(24);
		Font f4 = new Font(18);
		Font f3 = new Font(18);
		Font f2 = new Font(18);
		Font f1 = new Font(18);
		Label lb2 = new Label();
		lb2.setFont(f6);
		lb2.setLayoutX(618.0);
		lb2.setLayoutY(33.0);
		lb2.setText("Reader");
		Label lb3 = new Label();
		lb3.setFont(f1);
		lb3.setLayoutX(50.0);
		lb3.setLayoutY(33.0);
		lb3.setTextFill(Color.ORANGERED);
		lb3.setText(System.getProperty("readername"));
		Label lb1 = new Label();
		lb1.setFont(f5);
		lb1.setLayoutX(348.0);
		lb1.setLayoutY(33.0);
		lb1.setText("Search By");
		Button b6 = new Button();
		b6.setFont(f4);
		b6.setLayoutX(288.0);
		b6.setLayoutY(322.0);
		b6.setText("Search");
		TextField txt3 = new TextField();
		txt3.setFont(f3);
		txt3.setLayoutX(288.0);
		txt3.setLayoutY(257.0);
		txt3.setPromptText("Publisher Name");
		TextField txt2 = new TextField();
		txt2.setFont(f2);
		txt2.setLayoutX(288.0);
		txt2.setLayoutY(197.0);
		txt2.setPromptText("Title");
		TextField txt1 = new TextField();
		txt1.setFont(f1);
		txt1.setLayoutX(288.0);
		txt1.setLayoutY(135.0);
		txt1.setPromptText("ID");
		txt1.addEventHandler(MouseEvent.MOUSE_EXITED,
				(event) ->  {
				// TODO Auto-generated method stub
				if(!txt1.getText().trim().isEmpty())
					{
						txt2.setEditable(false);
						txt3.setEditable(false);
					}});
		txt2.addEventHandler(MouseEvent.MOUSE_EXITED,
				(event) ->  {
				// TODO Auto-generated method stub
				if(!txt2.getText().trim().isEmpty())
					{
						txt1.setEditable(false);
						txt3.setEditable(false);
					}});
		txt3.addEventHandler(MouseEvent.MOUSE_EXITED,
				(event) ->  {
				// TODO Auto-generated method stub
				if(!txt3.getText().trim().isEmpty())
					{
						txt1.setEditable(false);
						txt2.setEditable(false);
					}});
		Label err = new Label();
		err.setFont(f3);
		err.setLayoutX(288.0);
		err.setLayoutY(380.0);
		err.setTextFill(Color.RED);
		err.setText("");
		SplitPane sp = new SplitPane();
		//sp.setLayoutX(-7.0);
		sp.setPrefSize(825, 646);
		AnchorPane ap1 = new AnchorPane();
		ap1.getChildren().addAll(sp,txt1,txt2,txt3,b6,lb1,lb2,lb3,err);
		ap1.minHeight(0);
		ap1.minWidth(0);
		ap1.setLayoutX(204.0);
		ap1.setLayoutY(-3.0);
		ap1.setPrefSize(825, 646);
		b6.addEventHandler(MouseEvent.MOUSE_PRESSED,
				(event) ->  {
				// TODO Auto-generated method stub
					try {
					ResultSet res = null;
					if(!txt1.getText().isEmpty()) {
						
							res=state.executeQuery("select docid,title,pubname,address from document d,publisher p where d.publisherid=p.publisherid and docid='"+txt1.getText()+"'");
						}
					else if(!txt2.getText().isEmpty())
					{
						try {
							res=state.executeQuery("select docid,title,pubname,address from document d,publisher p where d.publisherid=p.publisherid and title like '%"+txt2.getText()+"%'");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(!txt3.getText().isEmpty())
					{
						try {
							res=state.executeQuery("select docid,title,pubname,address from document d,publisher p where d.publisherid=p.publisherid and pubname like '%"+txt3.getText()+"%'");
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else
					{
						err.setText("Kindly enter text in one of the option to search");
					}
						
							ap1.getChildren().clear();
							ap1.getChildren().addAll(rs.read_res(res).getChildren());
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
		return ap1;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
	}
}
