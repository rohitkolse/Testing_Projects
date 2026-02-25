import java.sql.*;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// it is a static method of a builtin Class class
			// it it used to load a class dynamically at runtime 
			// it is also given the name of the jdbc driver which helps to establish the connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// in this we are forming the connection with the data base
			// Connection is the interface from java.sql package it also represent the session between java and database
			// con is the object object of connection or it is a variable that store connection object
			// Driver manage ris a class in java.sql package and getconnection is the method
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","7721");
			
			//Statement is a builtin interface in the java.sql package
			//stmt is a variable name 
			//con is the connection object from above
			//createstatement is the method belongs to the statement interface using it we can execute 
			Statement stmt = con.createStatement();
			
			//ResultSet is an interface it used to store the data from the query 
			//rs is just a variable name it will store the returnset object return by database
			//stmt this is the statement object this is responsible to sending query to database
			//executequery it send sql query to database executes it and returns in the rs reseltset object
			ResultSet rs = stmt.executeQuery("select * from employee_details2");
			
			// when the code run and it fetches the data it goes to next line every time using rs.next() 
			// it returns false when there is no data in the table 
			System.out.printf("%-5s %-12s %-12s %-8s %-5s %-20s %-15s %-12s %-10s\n",
			        "ID", "FirstName", "LastName", "Gender",
			        "Age", "Address", "Mobile", "Dept", "Salary");

			System.out.println("-----------------------------------------------------------------------------------------------");

			while (rs.next()) {

			    System.out.printf("%-5d %-12s %-12s %-8s %-5d %-20s %-15d %-12s %-10d\n",
			            rs.getInt("Employee_ID"),
			            rs.getString("First_Name"),
			            rs.getString("Last_Name"),
			            rs.getString("Gender"),
			            rs.getInt("age"),
			            rs.getString("Address"),
			            rs.getLong("Mobile_Number"),
			            rs.getString("Dept"),
			            rs.getInt("Salary")
			    );
			}

			// it used to close the connection
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
