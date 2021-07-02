package day15_JDBC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class Jdbc_Assignment  {
	//private static Connection con = DbConnection.connect();
	private static Connection con = DriverManager.getConnection(url);
	
	public static void main(String[] args) throws Exception {	
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the choice (1)(2)(3) or (4)");
		System.out.println("(1) to get all employees details ");
		System.out.println("(2) to get employees details by Id ");
		System.out.println("(3) to add new employee details ");
		System.out.println("(4) to delete employee by Id");
		System.out.println("(5) to update the employee details");
		int choice = Integer.parseInt(reader.readLine());
		
		switch(choice) {
		case 1:
			String query = "select * from emp";
			Statement st1 = con.createStatement();
			ResultSet rst1 = st1.executeQuery(query);
			while(rst1.next()) {
				System.out.println(rst1.getInt(1) + " " + rst1.getString(2) + " " + rst1.getDouble(3));
			}
			break;
			
		case 2:
			System.out.printf("Enter the employee Id : ");
			int id = Integer.parseInt(reader.readLine());
			String query2 = "select * from emp where eId = " + id;
			Statement st2 = con.createStatement();
			ResultSet rst2 = st2.executeQuery(query2);
			while(rst2.next()) {
				System.out.println(rst2.getInt(1) + " " + rst2.getString(2) + " " + rst2.getDouble(3));
			}
			break;
			
		case 3:
			Employee emp = new Employee();
			
			System.out.printf("Enter the Employee ID :  ");
			emp.seteId(Integer.parseInt(reader.readLine()));
			System.out.println("Enter Employee Name ");
			emp.setEname(reader.readLine());
			System.out.println("Enter Employee Salary");
			emp.setSalary(Double.parseDouble(reader.readLine()));
			
			
			String query3 = "insert into emp(eId, ename, salary) values(?,?,?)";
			PreparedStatement pst3 = con.prepareStatement(query3);
			pst3.setInt(1, emp.geteId());
			pst3.setString(2, emp.getEname());
			pst3.setDouble(3, emp.getSalary());
			
			int rst3 = pst3.executeUpdate();
			if(rst3 == 1) {
				System.out.println("1 row(s) added");
			}
			break;
		
		case 4:
			System.out.print("Enter the Emplyee Id : ");
			int eid4 = Integer.parseInt(reader.readLine()); 
			String query4 = "delete from emp where eId = ?";
			PreparedStatement pst4 = con.prepareStatement(query4);
			pst4.setInt(1, eid4);
			int rst4 = pst4.executeUpdate();
			if(rst4 == 1) {
				System.out.println("1 row(s) deleted");
			}
			break;
		case 5:
			System.out.print("Enter the Emplyee Id : ");
			int eid5 = Integer.parseInt(reader.readLine()); 
			Statement st5 = con.createStatement();
			String query51 = "select salary from emp where eId = " + eid5;
			ResultSet rst51 = st5.executeQuery(query51);
			while(rst51.next()) {
				System.out.println("Current salary : "+ rst51.getDouble(1));
			}
			System.out.print("Enter the updated salary : ");
			double salary = Double.parseDouble(reader.readLine());
			String query52 = "update emp set salary = ? where eId = ?";
			PreparedStatement pst5 = con.prepareStatement(query52);
			pst5.setDouble(1, salary);
			pst5.setInt(2, eid5);
			int rst52 = pst5.executeUpdate();
			if(rst52 == 1) {
				System.out.println("1 row(s) updated");
			}
			break;
		}	
	}
}