package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resume_Upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");
        
        try {
    		Thread.sleep(2000);
    		 driver.findElement(By.id("file-upload")).sendKeys("C:/Users/rohit/OneDrive/Documents/Rohit/Rohit Kolse Resume.pdf");
             Thread.sleep(2000);	

             driver.findElement(By.id("file-submit")).click();
             Thread.sleep(2000);
             
             String message = driver.findElement(By.tagName("h3")).getText();
             
             if(message.equals("File Uploaded!")) {
                 System.out.println("Resume Uploaded Successfully ✅");
             } else {
                 System.out.println("Upload Failed ❌");
             }

        }catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        finally {
			driver.quit();
			}
	}

}
