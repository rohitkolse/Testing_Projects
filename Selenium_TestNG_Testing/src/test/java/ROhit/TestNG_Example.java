package ROhit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Example{
	
	WebDriver driver = new ChromeDriver();
	@Test
	public void openGoogle() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox"))
        .sendKeys("laptop", Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Search for laptops ");
	}
	
	 @BeforeMethod
	    public void beforeMethod() throws InterruptedException {
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
	    System.out.println("Before Method - Open the amazon site");
	    }
	 
	 @AfterMethod
	 public void afterMethod() {
		 System.out.println("After Method Runs");
		 
	 }
	 
	 @BeforeClass
	 public void beforeClass() {
	     driver.manage().window().maximize();
	 }
	 
	 @AfterClass
	 public void afterClass() {
		 driver.quit();
		 System.out.println("After Class : Browser is closed");
	 }

}
