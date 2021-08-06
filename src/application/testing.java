package application;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javafx.fxml.FXML;
public class testing {

@FXML
	public static void main(String[] args) 
	{
		/*Set<Integer> st=new HashSet<Integer>(Arrays.asList(4,6,1));
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map1 = new HashMap<String, Object>();*/
		 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/city library project", "root", "12345");
			Statement state=con.createStatement();
			ResultSet rs=state.executeQuery("select readerid from reader where readerid='900'");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colcount=rsmd.getColumnCount();
			System.out.println("colcount: "+colcount);
			while(rs.next())
			{
				for (int i = 1; i <=  colcount; i++) {
					System.out.print(rs.getString(i)+"\t");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
