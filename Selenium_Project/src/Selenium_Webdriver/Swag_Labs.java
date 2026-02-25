package Selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		try 
		{
			
//		using name
//		driver.findElement(By.name("user-name")).sendKeys("problem_user");
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login-button")).click();
//		Thread.sleep(2000);
		
//		using id	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("first-name")).sendKeys("Rohit");
        driver.findElement(By.id("last-name")).sendKeys("Kolse");
        driver.findElement(By.id("postal-code")).sendKeys("445203");
        Thread.sleep(2000);
        
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
		
        String successMsg = driver.findElement(By.id("complete-header")).getText();

        if(successMsg.equals("Thank you for your order!")) {
            System.out.println("Checkout Successful ✅");
        } else {
            System.out.println("Checkout Failed ❌");
        }
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			driver.quit();
			}
		}
	}
