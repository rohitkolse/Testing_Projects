package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Login {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd&add=1");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("login-username")).sendKeys("rkolse45");
		 Thread.sleep(2000);
		 
		 WebElement checkbox1 =  driver.findElement(By.xpath("//*[@id=\"login-username-form\"]/div[3]/div[1]/span/label"));
	     if(!checkbox1.isSelected()) 
	     {
	    	 checkbox1.click();
	     }
	     Thread.sleep(2000);

		 driver.findElement(By.id("login-signin")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("login-passwd")).sendKeys("tanukolse@2002");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("login-signin")).click();
		 Thread.sleep(1000);
		 
//		 driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]/svg")).click();
//		 Thread.sleep(10000);
		 
	     System.out.println("Yahoo login attempted successfully!");
	        
	     driver.quit();
		 

	}

}
