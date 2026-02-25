package ROhit;

		import java.net.MalformedURLException;
import java.net.URL;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExample {

		    public static void main(String[] args) throws MalformedURLException {

		        URL gridurl = new URL("http://localhost:4444");

		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("start-maximized");

		        WebDriver driver = new RemoteWebDriver(gridurl, options);

		        driver.get("https://www.google.com");

		        System.out.println("Page Title: " + driver.getTitle());

		        driver.quit();
		    }
	}
