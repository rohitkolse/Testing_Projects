package ROhit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Example {
	
	WebDriver driver = new ChromeDriver();
	 @BeforeClass
	    public void beforeClass() {
	        driver.manage().window().maximize();
	        System.out.println("BeforeClass - Browser Launched");
	        
	        
	    }
	 
	 @BeforeMethod
	    public void beforeMethod() throws InterruptedException {
	        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	        driver.findElement(By.id("ap_email_login")).sendKeys("rohitkolse34@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.className("a-button-input")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("ap_password")).sendKeys("tanukolse");
			Thread.sleep(1000);
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(2000);
	        System.out.println("BeforeMethod - Opened Amazon Homepage");
	    }
	 
	 @Test
	 public void amazon() throws InterruptedException {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop", Keys.ENTER);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("a-autoid-5-announce")).click();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("nav-cart-count")).click();
	     Thread.sleep(2000);
	     
	     System.out.println("Test - Product Added To Cart");
	 }
	 
	 @AfterMethod
	 public void afterMethod() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
	     Thread.sleep(2000);
	     System.out.println("After Method : Proceed to Checkout");
	     
	     WebElement radio = driver.findElement(By.xpath("//*[@id=\"select-destination-on-sasp-desktop-panel-id-SRNRTB62KZA3Z7PWAHEYG13WG6MG3SIKO3A3OKIS3GM6GWHPXTQ2FQA2OXW7VWN6\"]/div/label/i"));
	        if(!radio.isSelected()) {
	        	radio.click(); 	
	        }
	        Thread.sleep(2000);
	        System.out.println("After Method : Address Selected");
	        
	        driver.findElement(By.xpath("//*[@id=\"checkout-secondary-continue-button-id\"]/span/input")).click();
	        Thread.sleep(2000);
	 }
	 
	 @AfterClass
	    public void afterClass() throws InterruptedException {
		 
//		 WebElement radio = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[6]/div/div/div/div[1]/span/div/label/input"));
//	        if(!radio.isSelected()) {
//	        	radio.click(); 	
//	        }
//	        Thread.sleep(2000);
//
//	        System.out.println("After Class : Payment Mode Selected");
	        
	        driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]")).click();
	        Thread.sleep(2000);
	        
//	        driver.findElement(By.tagName("a")).click();
//	        Thread.sleep(2000);
	        
	        Actions actions = new Actions(driver);
	        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
	        Thread.sleep(2000);
	        System.out.println("The cursor go to the accounts and lists dropdown");
	        
	        driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]")).click();
	        Thread.sleep(2000);
	        
	        driver.quit();
	        System.out.println("AfterClass - Browser Closed");
	    }

}
