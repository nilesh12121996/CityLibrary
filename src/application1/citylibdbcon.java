package application1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class citylibdbcon {
	public Connection DBConnection() throws ClassNotFoundException {
		Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/city library project", "root", "12345");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
	}
}
