package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_Login {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"_R_32d9lplcldcpbn6b5ipamH1_\"]")).sendKeys("kolse_rohit_");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"_R_33d9lplcldcpbn6b5ipamH1_\"]")).sendKeys("Rohit@2000");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")).click();
        Thread.sleep(20000);
        
        System.out.println("Instagram login attempted!");

        driver.quit();

	}

}
