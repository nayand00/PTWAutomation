package bestbuy.steps.pageobjectmodel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Homepage extends MasterPage {

	String signButton = "//div[@class='gvpHeadicon account-icon flyBtn']//*[local-name()='svg']";
	String closePopup = "//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[2]/div/div/div/div/button";
	String sighLink = "//*[@id=\"account-menu-app\"]/div/div[2]/div/div/a/button";
	String emailIdLink = "//*[@id=\"fld-e\"]";
	String passLink = "//*[@id=\"fld-p1\"]";
	String SubmitLink = "/html/body/div[1]/div/section/main/div[1]/div/div/div/div/form/div[4]/button";

	public Homepage(WebDriver driver) {
		super(driver);
	}

	public void verifyLandingPage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public void navigateToMyAccountPage() {
		uglyWaitFor(3000);
		clickOnElement(closePopup);
		uglyWaitFor(3000);
		clickOnElement(signButton);
		uglyWaitFor(3000);
		clickOnElement(sighLink);
		uglyWaitFor(3000);
		SendDataOnElement(emailIdLink, "saifrana.chsb93@gmail.com");
		uglyWaitFor(2000);
		SendDataOnElement(passLink, "duibatpar420");
		clickOnElement(SubmitLink);
	}
}
