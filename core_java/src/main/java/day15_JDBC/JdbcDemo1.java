package day15_JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/capg", "root", "sayantan12345");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		ResultSetMetaData rsm = rs.getMetaData();
		String colType = rsm.getColumnClassName(1);
		System.out.println(colType);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
		}
		System.out.println();

		// insert int db
		int x = st.executeUpdate("insert into emp values(119,'Rina',3180.1)");
		if (x > 0) {
			System.out.println("Update sucesfull\nNumber of rowa affected : " + x);
		} else {
			System.out.println("Something went wrong!");
		}
		ResultSet rs2 = st.executeQuery("select * from emp");
		while (rs2.next()) {
			System.out.println(rs2.getInt(1) + " " + rs2.getString(2) + " " + rs2.getDouble(3));
		}
		System.out.println();

		// delete from db
		int y = st.executeUpdate("delete from emp where emp_name='Rina'");
		if (y > 0) {
			System.out.println("Delete sucesfull\nNumber of rowa deleted : " + y);
		} else {
			System.out.println("Something went wrong!");
		}
		ResultSet rs3 = st.executeQuery("select * from emp");
		while (rs3.next()) {
			System.out.println(rs3.getInt(1) + " " + rs3.getString(2) + " " + rs3.getDouble(3));
		}
		System.out.println();

		// update db
		int z = st.executeUpdate("update emp set emp_name='b' where emp_id = 102");
		if (z > 0) {
			System.out.println("Update sucesfull\nNumber of rowa updated : " + z);
		} else {
			System.out.println("Something went wrong!");
		}
		System.out.println();

		ResultSet rs1 = st.executeQuery("select * from emp");
		System.out.println("After update : ");
		while (rs1.next()) {
			System.out.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getDouble(3));
		}
		con.close();
	}

}


/*
 * public class Demo1 {
 * 
 * /**
 * 
 * @param args
 * 
 * @throws ClassNotFoundException
 * 
 * @throws SQLException
 * 
 * @throws IOException
 * 
 * public static void main(String[] args) throws ClassNotFoundException,
 * SQLException, IOException { FileInputStream fis = new
 * FileInputStream("jdbc.prop"); Properties props = new Properties();
 * props.load(fis); String driver = (String) props.get("driver"); String url =
 * (String) props.get("url"); String uid = (String) props.get("uid"); String pwd
 * = (String) props.get("pwd"); // TODO Auto-generated method stub
 * Class.forName(driver); Connection con=
 * DriverManager.getConnection(url,uid,pwd); Statement st=con.createStatement();
 * int insertedRows =
 * st.executeUpdate("insert into emp values(16,'name15',64000)"); int
 * deletedRows = st.executeUpdate("delete from emp where ename ='xyz'");
 * System.out.println("no of rows inserted:"+insertedRows);
 * System.out.println("no.of rows deleted:"+deletedRows); // ResultSet rs
 * =st.executeQuery("select * from emp"); // ResultSetMetaData rsm =
 * rs.getMetaData(); // String colType = rsm.getColumnClassName(1); //
 * System.out.println("Datatype of firstColumn"+colType); /* while(rs.next()) {
 * System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)); }
 * con.close(); } }
 */