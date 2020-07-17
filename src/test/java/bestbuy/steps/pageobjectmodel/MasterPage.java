package bestbuy.steps.pageobjectmodel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MasterPage {

	WebDriver driver;
	
	public MasterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void uglyWaitFor(int mls) {
		try {
			Thread.sleep(mls);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnElement(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void SendDataOnElement(String locator, String SendValue) {
		driver.findElement(By.xpath(locator)).sendKeys(SendValue);
	}

	public String SendDataOnElement2(String locator, String SendValue) {
		driver.findElement(By.xpath(locator)).sendKeys(SendValue);
		return SendValue;
	}

	public String getWebElementText(String locator) {
		return  driver.findElement(By.xpath(locator)).getText();	
		} 

	// method returnlist;
	public List<String> getElementText(String locators) {
		// to add and return the element from list one by one we use this below method
		List<String> returnList = new ArrayList<String>();

		// to get all elements from the list we use bellow method
		List<WebElement> allElements = driver.findElements(By.xpath(locators));
		// adding element one by one into ReturnList and get the name for each elements
		for (int i = 0; i < allElements.size(); i++)
			returnList.add(allElements.get(i).getText());
		return returnList;

	}

	public void clickAllElements(String locators) {

		List<WebElement> allElements = driver.findElements(By.xpath(locators));
		for (int i = 0; i < allElements.size(); i++) {
			allElements.get(i).click();
			driver.navigate().back();

			allElements = driver.findElements(By.xpath(locators)); // Re Load the
		}
	}

	public void dropDown(String locator, String value) {

		Select dropdown = new Select(driver.findElement(By.xpath(locator)));
		  dropdown.selectByValue(value);
		 //dropdown.selectByVisibleText(value);

	}

	public void clearData(String locator) {
		driver.findElement(By.xpath(locator)).clear();
	}

	public void clearUpdateData(String locator, String value) {
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(value);

	}

	// option 1
	public void clearDeleteUpdateData(String locators, String Value) {
		WebElement toClear = driver.findElement(By.xpath(locators));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
		toClear.sendKeys(Value);
	}

	// option2
	public void clearDeleteUpdateData2(String locators, String Value) {
		WebElement toClear = driver.findElement(By.xpath(locators));
		toClear.sendKeys(Keys.chord(Keys.CONTROL + "a"), Value);
	}

	public WebElement selectTabOption(String locator) throws InterruptedException {
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath(locator));
		x.click();
		return x;
	}
	
	//if u want to close current page and want to move first page 
	public void WindowCloseSwitchToFirstPage(){
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
	
	}
	
	//If u want to move current page to default page
	public void SwitchToDefaultPage() {
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
	}
	
	public void goBack() {
    	driver.navigate().back();	
    }
	
	public void replaceData(String locator,String option) {
		clickOnElement(locator.replace("${xx}", option));
   }
	
  }










/*
 * // option 1
 * 
 * WebElement abc =
 * driver.findElement(By.xpath("//*[@class='footersep']//*[text()='" + foot
 * +"']")); abc.click(); return abc; }
 */

/*
 * //option 2 public void shipRates(String shpday) throws InterruptedException {
 * 
 * clickOnElement(shippingday1.replace("${xx}", shpday)); }
 */




//driver.switchTo().alert().dismiss();