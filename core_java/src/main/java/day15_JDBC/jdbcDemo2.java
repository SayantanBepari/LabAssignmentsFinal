package day15_JDBC;
import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		FileInputStream file = new FileInputStream("jdbc.prop");
		Properties props = new Properties();
		props.load(file);
		
		String driver = (String) props.get("Driver");
		String url = (String) props.get("Url");
		String uid = (String) props.get("Uid");
		String pass = (String) props.get("Pass");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
	}

}
