package day15_JDBC;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class PreparedStatementDemo1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FileInputStream file = new FileInputStream("jdbc.prop");
		Properties props = new Properties();
		props.load(file);
		
		String driver = (String) props.get("Driver"); 
		String url = (String) props.get("Url");
		String uid = (String) props.get("Uid");
		String pass = (String) props.get("Pass");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, uid, pass);
		PreparedStatement pst = con.prepareStatement("select * from emp");
		
		ResultSet rs =  pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		System.out.println("\nparameterised command");
		//parameterised command
		PreparedStatement pst1 = con.prepareStatement("select * from emp where emp_salary > ? and emp_name like ?");
		System.out.println("Enter salary and name : ");
		pst1.setDouble(1, sc.nextDouble());
		pst1.setString(2, sc.next());
		
		ResultSet rs1 = pst1.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
		}
		
		
	}

}
