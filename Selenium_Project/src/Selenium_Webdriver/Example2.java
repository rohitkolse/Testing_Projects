package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev/downloads");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev/documentation");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev/projects");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev/support");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev/blog");
			Thread.sleep(2000);
			
			driver.get("https://www.selenium.dev");
			
		}catch(Exception e) {
			System.out.println("Error" + e.getMessage());
		}
		
		finally{
			driver.quit();
		}
	}
}
