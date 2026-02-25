package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException{
		
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.google.com/");
	     Thread.sleep(2000);
	     
	     
//	     driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S958354779%3A1771222401814198&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ASfE1-oWh7BIhKCVYTgKeTRD0ClvloPqTlWKX1TxmTx82HsL1NC6i9h5zKJBiHQYLvYW6AQPysnJqA&osid=1&service=mail");
//	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//*[@id=\"gb\"]/div[3]/a")).click();
	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.id("identifierId")).sendKeys("rohitkolse2000@gmail.com");
	     driver.findElement(By.id("identifierNext")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.name("Passwd")).sendKeys("Rohit@2000");
	     driver.findElement(By.id("passwordNext")).click();
	     Thread.sleep(10000);
	     
	     System.out.println("Login attempted successfully!");

	     driver.quit();
		
	}

}
