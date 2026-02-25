package Selenium_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit\\OneDrive\\Desktop\\Selenium_Integration\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();
		
		try {
			driver.manage().window().maximize();			
			driver.get("https://www.google.com");
			
			driver1.manage().window().maximize();			
			driver1.get("https://www.google.com");
			
			driver2.manage().window().maximize();
			driver2.get("https://www.google.com");
			
			String title = driver.getTitle();
			System.out.println("Page Title: " + title);
			
			String title1 = driver1.getTitle();
			System.out.println("Page Title: " + title1);
			
			String title2 = driver2.getTitle();
			System.out.println("Page Title: " + title2);
			
			if(title.contains("Google")) {
				System.out.println("Test Pass for Chrome");
			}else {
				System.out.println("Test Fail for chrome");
			}
			
			if(title1.contains("Google")) {
				System.out.println("Test Pass for edge");
			}else {
				System.out.println("Test Fail for edge");
			}
			
			if(title2.contains("Google")) {
				System.out.println("Test Pass for Firefox");
			}else {
				System.out.println("Test Fail for Firefox");
			}
		}catch(Exception e) {
			System.out.println("Exception Occured" + e.getMessage());
		}
		
		finally {
//			driver.quit();
			driver.close();
			driver1.close();
			driver2.close();
		}
		
	}
}
