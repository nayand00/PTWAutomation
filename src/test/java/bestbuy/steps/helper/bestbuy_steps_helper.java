package bestbuy.steps.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class bestbuy_steps_helper {

	protected WebDriver driver;

	public WebDriver getDriver(String br) {
		
		if (br == "Chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//return driver;
		} else if (br == "IE") {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			//return driver;
		} else if (br == "Firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//return driver;
		}
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();

		return driver;
	}
	
}