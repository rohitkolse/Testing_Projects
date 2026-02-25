import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.*;


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","7721");
			
//			PreparedStatement ps = con.prepareStatement("UPDATE employee_details4 SET Salary = ? WHERE Employee_ID = ?");
//			
//			ps.setInt(1,10000);
//			ps.setInt(2, 101);
//			System.out.println(ps.executeUpdate()+ "records updated Successfully");			
			
//			PreparedStatement ps = con.prepareStatement("Alter Table Employee_Details4 drop column Address");
//			System.out.println(ps.executeUpdate()+ "Column Deleted Successfully");
			
//			PreparedStatement ps = con.prepareStatement("ALTER TABLE employee_details4 ADD COLUMN Address VARCHAR(100)");
//			System.out.println(ps.executeUpdate()+ "Column Added Successfully");
			
//			PreparedStatement ps = con.prepareStatement("DELETE FROM employee_details4 WHERE Employee_ID = ?");
//			ps.setInt(1, 101);
//			System.out.println(ps.executeUpdate()+ "Record Deleted Successfully");
//			ps.close();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb","root","7721");
			
			CallableStatement cs = con.prepareCall("{call getAllEmployees()}");
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("ID")+" "+rs.getString("Name"));
			}
			rs.close();
			cs.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
	}
  }
}
