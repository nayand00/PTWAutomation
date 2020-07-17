package bestbuy.steps.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;

public class MyAccountPage extends MasterPage {
	
	String bestBuyLogo="//img[contains(@alt,'BestBuy.com')]";
	String userName = "//*[@class='flyBtn logged_user_name']";
	String topTableLink="//*[@class='top-nav-items']//*[contains(text(),'${xx}')]";
	String topTableLinkWorking="//*[@class='top-nav-items']//li";
	String searchLink="//input[@id='gh-search-input']";
	String submitBuutonLink="//span[@class='header-search-icon']//*[local-name()='svg']";
	String selectItemLink="//*[@class='facet-option-label-text'][contains(text(),'${xx}')]";
	String addCartLink="//*[@id=\"fulfillment-add-to-cart-button-24fd6916-4b42-41fd-8ceb-1a9c3461e777\"]/div/div/button";
	String continueShoppingLink="//*[@id=\"shop-attach-modal-780a247f-7b6e-4701-a74e-6ea4226c372e-modal\"]/div/div[2]/div/div/div/div/div[1]/div/div[2]/button";
	String dropDownLink="//div[@class='cart-item']//div//div[@class='cart-item__quantity-block col-xs-1']";
	//String checkOutLink="//*[@id=\"cartApp\"]/div[2]/div[1]/div/div/span/div/div[2]/div/div[1]/div[1]/div/button";
	String checkOutLink="//div[@class='listing-header__button']//button[@class='btn btn-lg btn-block btn-primary'][contains(text(),'Checkout')]";
	//String checkOutLink="//*[@id=\"cartApp\"]/div[2]/div[1]/div/div/span/div/div[2]/div/div[3]/div[2]/div/div[1]/div[2]/button[1]";
	String checkOutLink1="//div[@class='listing-footer__button']//button[@class='btn btn-lg btn-block btn-primary'][contains(text(),'Checkout')]";
	String cartLink="//div[contains(@class,'cart-icon-container')]";
	String outerLeftTableAll = "//*[@class='navigation-container']//*[@class='global-navigation']//li";
	String outerRightTableAll = "//*[@class='navigation-container']//*[@class='utility-navigation']//li";
	String outerTableLink = "//*[@class='navigation-container']//*[contains(text(),'${xx}')]";
	String insideOuterTablelink = "//*[@class='flyout-content']//*[contains(text(),'${xx}')]";
	String productsOuterTableLink = "//*[@class='row esg-full-width blackgroundnav']//*[contains(text(),'${xx}')]";
	// String productsOuterTableLinkStorage="(//*[@class='esg-reduced esg-font-light']/a/img)[4]";
	String footerTableLink="//*[@class='primary-navigation']//*[contains(text(),'${xx}')]";
	String rightArrowLink = "(//*[@class='widget-fragments-caret-right'])[2]";
	// String rightArrowLink="//*[@id=\"widget-d9d7d91c-c21b-4c95-8c9e-f0e12ee83dd4\"]/div/div[2]/div[3]/button";
	// String rightArrowLink="//*[@id=\"widget-d171e20a-d558-45be-b744-ee60bddfbc2d\"]/div/div[2]/div[3]/button";
	String socialLinkTable="//*[@class='social-device']//*[contains(@title,'${xx}')]";
   
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void verifyBestBuyLogo() {
	   uglyWaitFor(2000);
	   if(driver.findElement(By.xpath(bestBuyLogo)).isDisplayed()) {
		System.out.println("Image Present");
		}
		else {
		System.out.println("Image not Present");	
		}
	}

	public String verifyUserName() {
		uglyWaitFor(3000);
		return getWebElementText(userName);
	}

	public void navigateToTopTable(String fTable) {
		uglyWaitFor(3000);
		replaceData(topTableLink,fTable);
	}

	public boolean topTableLinkWorking() {
		try {
			clickAllElements(topTableLinkWorking);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
    public void searchingSomeProducts(String searchPro,String searchPro2,String searchPro3) {
    	uglyWaitFor(3000);
		SendDataOnElement(searchLink,searchPro);
		uglyWaitFor(5000);
		clickOnElement(submitBuutonLink);
		goBack();
		uglyWaitFor(3000);
		SendDataOnElement(searchLink,searchPro2);
		uglyWaitFor(5000);
		clickOnElement(submitBuutonLink);
		uglyWaitFor(2000);
		replaceData(selectItemLink,searchPro3);
		uglyWaitFor(3000);
		clickOnElement(addCartLink);
		uglyWaitFor(4000);
		clickOnElement(continueShoppingLink);
		//uglyWaitFor(4000);
		//clickOnElement(dropDownLink);
		
	}
    
	public void finalizingShopping() {
		uglyWaitFor(3000);
		clickOnElement(cartLink);
		uglyWaitFor(5000);
		clickOnElement(checkOutLink);
		clickOnElement(checkOutLink1);
	}
	
	public void searchForDifferentOptions(String Serach, String Search1, String pro) {
		uglyWaitFor(5000);
		clickOnElement(outerTableLink.replace("${xx}", Serach));
		uglyWaitFor(2000);
		clickOnElement(insideOuterTablelink.replace("${xx}", Search1));
		uglyWaitFor(2000);
		clickOnElement(productsOuterTableLink.replace("${xx}", pro));
		// clickOnElement(productsOuterTableLinkStorage);
	}

	public boolean outerleftTableWorking() {
		try {
			clickAllElements(outerLeftTableAll);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean outerRightTableWorking() {
		uglyWaitFor(3000);

		try {
			clickAllElements(outerRightTableAll);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void navigateToFooterOption(String fTable) {
		uglyWaitFor(3000);
		clickOnElement(footerTableLink.replace("${xx}", fTable));
	}

	public void scollUpDown() {
		uglyWaitFor(3000);
		// option 1
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		// uglyWaitFor(3000);
		// js.executeScript("window.scrollBy(0,100)");
		// option2
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		uglyWaitFor(3000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		// WebElement
		// Element=driver.findElement(By.xpath("//*[@id=\"carousel-header-d9d7d91c-c21b-4c95-8c9e-f0e12ee83dd4\"]"));
		// js.executeScript("arguments[0].scrollIntoView();",Element);
	}

	public void rightArrowVisible() {
		uglyWaitFor(3000);
		for (int i = 0; i < 3; i++) {
			clickOnElement(rightArrowLink);
			uglyWaitFor(3000);
			// clickOnElement(rightArrowLink);
		}
	}

	public void switchSocailPage(String socPa) {
		uglyWaitFor(3000);
		clickOnElement(socialLinkTable.replace("${xx}", socPa));
		WindowCloseSwitchToFirstPage();
	}


}
	
