package Rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        Thread.sleep(1000);
        
        driver.findElement(By.id("ap_email_login")).sendKeys("rohitkolse34@gmail.com");
//		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();
//		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys("tanukolse");
//		Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
//		Thread.sleep(1000);
        
        driver.findElement(By.id("twotabsearchtextbox"))
        .sendKeys("laptop", Keys.ENTER);
        Thread.sleep(2000);
        
        driver.findElement(By.id("a-autoid-5-announce")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-6-announce")).click();
        Thread.sleep(2000);
        
        // Going in the cart
        driver.findElement(By.id("nav-cart")).click();
        Thread.sleep(2000);
        
        // Delete the item inside the cart
        driver.findElement(By.className("a-icon-small-trash")).click();
        Thread.sleep(2000);
        
        // add quantity of item in the cart
        driver.findElement(By.className("a-icon-small-add")).click();
        Thread.sleep(2000);
       
        // for unchecked the checkbox
        WebElement checkbox1 =  driver.findElement(By.xpath("//*[@id=\"sc-active-4240d117-fd73-4cca-9448-24fc44edffa5\"]/div[4]/div/div[1]/label/i"));
        if(!checkbox1.isSelected()) {
        	checkbox1.click();
        }
        Thread.sleep(2000);
      
        
        //click button for proceed to buy
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
        Thread.sleep(2000);
        
        //click radio button for address selection
        WebElement radio = driver.findElement(By.xpath("//*[@id=\"select-destination-on-sasp-desktop-panel-id-SRNRTB62KZA3Z7PWAHEYG13WG6MG3SIKO3A3OKIS3GM6GWHPXTQ2FQA2OXW7VWN6\"]/div/label/i"));
        if(!radio.isSelected()) {
        	radio.click(); 	
        }
        Thread.sleep(2000);
        
        //click deliver to this address button
        driver.findElement(By.xpath("//*[@id=\"checkout-secondary-continue-button-id\"]/span/input")).click();
        Thread.sleep(2000);
        
        //for selection payment method
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"pp-bokZ6f-129\"]"));
        if(!pay.isSelected()) {
        	pay.click(); 	
        }
        Thread.sleep(2000);
      
        
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}
