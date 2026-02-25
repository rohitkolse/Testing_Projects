import java.sql.*;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","7721");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("CREATE TABLE employee_details4 ("
	                    + "Employee_ID INT PRIMARY KEY, "
	                    + "First_Name VARCHAR(50), "
	                    + "Last_Name VARCHAR(50), "
	                    + "Gender VARCHAR(10), "
	                    + "Age INT, "
	                    + "Address VARCHAR(100), "
	                    + "Mobile_Number VARCHAR(15), "
	                    + "Dept VARCHAR(50), "
	                    + "Salary INT"
	                    + ")");
			 System.out.println("Table created successfully!");
			 
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
