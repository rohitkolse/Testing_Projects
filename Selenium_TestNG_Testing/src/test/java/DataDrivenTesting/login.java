package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;	
	@BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//	@Test(dataProvider="csvData")
//	public void login(String username, String password) throws InterruptedException {
//		
//		driver.get("https://practicetestautomation.com/practice-test-login");
//		
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		System.out.println("User run : " + username);
//		
//		System.out.println();
//		
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(2000);
//	}
	
	@Test(dataProvider = "dbData")
	public void login(String username, String password) {

	    driver.get("https://practicetestautomation.com/practice-test-login");

	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);

	    System.out.println("User from DB: " + username);

	    driver.findElement(By.id("submit")).click();
	}

	@AfterMethod()
	public void afterMethod() {
		driver.quit();
	}
	
//  for the excelSheet
//	@DataProvider(name="excelData")
//	public Object [][] getExcelData() throws Exception  {
//		return ExcelInputs.getEcelData("C:\\Users\\rohit\\eclipse-workspace\\Selenium_TestNG_Testing\\TestData\\Details.csv", "Detils");
//	}
	
//	for the csv file
//	@DataProvider(name="csvData")
//	public Object [][] getCSVData() throws Exception  {
//	    return ExcelInputs.getCSVData("C:\\Users\\rohit\\eclipse-workspace\\Selenium_TestNG_Testing\\TestData\\Details.csv");
//	}
	
	@DataProvider(name = "dbData")
	public Object[][] getDatabaseData() throws Exception {
	    return ExcelInputs.getDBData();
	}
	
}
