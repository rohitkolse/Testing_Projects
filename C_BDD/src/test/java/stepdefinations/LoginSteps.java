package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.opencsv.CSVReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginSteps {

    WebDriver driver;

    @Given("I launch the browser")
    public void launch_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("I open login page")
    public void login_page() {
        driver.get("https://www.saucedemo.com/");
    }

//    @When("I enter credentials")
//    public void enter_credentials(DataTable table) {
//
//        List<Map<String, String>> data = table.asMaps(String.class, String.class);
//
//        String username = data.get(0).get("username");
//        String password = data.get(0).get("password");
//
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//    }
    
    // it extracts data from database
    @When("I enter credentials from database")
    public void enter_credentials_from_db() throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "7721");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("Select username, password From login");

        while (rs.next()) {

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("user-name"))
                  .sendKeys(rs.getString("username"));

            driver.findElement(By.id("password")).clear();
            driver.findElement(By.id("password"))
                  .sendKeys(rs.getString("password"));

            driver.findElement(By.id("login-button")).click();
            System.out.println("Logged in with: " + rs.getString("username"));
            Thread.sleep(2000);
        }

        con.close();
        stmt.close();
        rs.close();																					
    }
    
   

    @When("I enter credentials from CSV file")
    public void enter_credentials_from_csv() throws Exception {

        CSVReader reader = new CSVReader(new FileReader("src/test/resources/TestData/Details.csv"));

        List<String[]> users = reader.readAll();
        for (int i = 1; i < users.size(); i++) {

            String[] user = users.get(i);

            driver.findElement(By.id("user-name")).clear();
            driver.findElement(By.id("password")).clear();

            driver.findElement(By.id("user-name")).sendKeys(user[0]);
            driver.findElement(By.id("password")).sendKeys(user[1]);

            driver.findElement(By.id("login-button")).click();

            System.out.println("Logged in with: " + user[0]);
        }
        reader.close();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}