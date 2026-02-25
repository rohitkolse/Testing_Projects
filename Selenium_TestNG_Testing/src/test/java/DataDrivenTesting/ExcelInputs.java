package DataDrivenTesting;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelInputs {
	// this is for excelsheet
//	public static Object[][] getEcelData(String path, String sheetName) throws Exception
//	{
//		FileInputStream fis = new FileInputStream(path);
//		
//		Workbook workbook= WorkbookFactory.create(fis);
//		Sheet sheet= workbook.getSheet(sheetName);
//		int rowCount= sheet.getPhysicalNumberOfRows();
//		int colCount= sheet.getRow(0).getPhysicalNumberOfCells();
//		
//		Object[][] data= new Object[rowCount-1][colCount];
//		
//		for(int i=1; i < rowCount; i++)
//		{
//			for(int j=0; j <colCount; j++)
//			{
//				data[i-1][j]= sheet.getRow(i).getCell(j).toString();
//			}
//		}
//		workbook.close();
//		return data;
//		}
	
	//this is for csv file 
//	 public static Object[][] getCSVData(String filePath) throws Exception {
//
//		 BufferedReader br = new BufferedReader(new FileReader(filePath));
//	        String line;
//
//	        List<Object[]> dataList = new ArrayList<>();
//
//	        br.readLine();
//
//	        while ((line = br.readLine()) != null) {
//	            String[] values = line.split(",");
//	            dataList.add(values);
//	        }
//
//	        br.close();
//
//	        Object[][] data = new Object[dataList.size()][];
//	        return dataList.toArray(data);
//	    }
	
	//this id for database
	public static Object[][] getDBData() throws Exception {

	    Connection con = DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/testdb",
	        "root",
	        "password"
	    );

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT username, password FROM login_data");

	    List<Object[]> dataList = new ArrayList<>();

	    while (rs.next()) {
	        dataList.add(new Object[]{
	            rs.getString("username"),
	            rs.getString("password")
	        });
	    }

	    con.close();
	    rs.close();
	    stmt.close();

	    Object[][] data = new Object[dataList.size()][];
	    return dataList.toArray(data);
	}
}
