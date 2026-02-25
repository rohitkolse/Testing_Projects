import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","7721");
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee_details4 "
                    + "(Employee_ID, First_Name, Last_Name, Gender, Age, Address, Mobile_Number, Dept, Salary) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			stmt.setInt(1, 102);
			stmt.setString(2, "RK");
			stmt.setString(3, "RRK");
			stmt.setString(4, "Male");
			stmt.setInt(5, 30);
			stmt.setString(6, "Pune");
			stmt.setString(7, "7721919198");   
			stmt.setString(8, "Tester");
			stmt.setInt(9, 80000);
			
			System.out.println(stmt.executeUpdate()+ "records inserted Successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
