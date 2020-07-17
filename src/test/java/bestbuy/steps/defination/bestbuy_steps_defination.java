package bestbuy.steps.defination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import bestbuy.steps.helper.bestbuy_steps_helper;
import bestbuy.steps.pageobjectmodel.Homepage;
import bestbuy.steps.pageobjectmodel.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class bestbuy_steps_defination {

	WebDriver driver;
	bestbuy_steps_helper helper;
	Homepage homepage;
	MyAccountPage myaccountpage;

	@Given("^I open browser as \"(.*?)\"$")
	public void iOpenBrowserAs(String br) throws Exception {
		bestbuy_steps_helper helper = new bestbuy_steps_helper();
		driver = helper.getDriver("Chrome");
	}

	@Given("^I land on bestbuy page$")
	public void iLandOnBestbuyPage() {
		homepage = new Homepage(driver);
		homepage.verifyLandingPage();
	}

	@When("^I complete Login With valid credientials$")
	public void iCompleteLoginWithValidCredientials() {
		homepage = new Homepage(driver);
		homepage.navigateToMyAccountPage();
	}

	@Then("^I want to verify bestbuy logo$")
	public void iWantToVerifyBestbuyLogo() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.verifyBestBuyLogo();

	}

	@Then("^I verify name of the user displayed successfully$")
	public void iVerifyNameOfTheUserDisplayedSuccessfully() {
		myaccountpage = new MyAccountPage(driver);
		String expPName = "Hi, Saifur Rahman";
		String actualPName = myaccountpage.verifyUserName();
		System.out.println(actualPName);
		Assert.assertEquals("Notmatch", expPName, actualPName);	 
	}
	
	@Then("^I want to see all top table link$")
	public void iWantToSeeAllTopTableLink() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.navigateToTopTable("Deal of the Day");
	}

	@And("^I expect top all table link working$")
	public void iExpectTopAllTableLinkWorking() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.topTableLinkWorking();
	}
	
	@Then("^I do search some products for shopping$")
	public void iDoSearchSomeProductsForShopping() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.searchingSomeProducts("computer","aircondition","Remote Control");
	}
	  
	@When("^I want to see my cart for finalizing my shopping$")
	public void iWantToSeeMyCartForFinalizingMyShopping(){
	    myaccountpage = new MyAccountPage(driver);
		myaccountpage.finalizingShopping();
	}
	
	@Then("^I do search for different options$")
	public void iDoSearchForDifferentOptions() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.searchForDifferentOptions("Brands", "Samsung", "Mobile");
	}

	@Then("^I expect to see outer left table link working$")
	public void iExpectToSeeOuterLeftTableLinkWorking() {
		myaccountpage = new MyAccountPage(driver);
		Assert.assertEquals("All Links are Not Good !!", true, myaccountpage.outerleftTableWorking());
//	  //Assert.assertEquals("All Links are Not Good !!", true, homepage.outerRightTableWorking());
	}

	@And("^I expect to see outer right table link working$")
	public void iExpectToSeeOuterRightTableLinkWorking() {
		myaccountpage = new MyAccountPage(driver);
		Assert.assertEquals("All Links are Not Good !!", true, myaccountpage.outerRightTableWorking());
	}

	@And("^I want to see all footer option$")
	public void iWantToSeeAllFooterOption() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.navigateToFooterOption("Support & Services");
	}

	@When("^I want to do scroll up and scroll down$")
	public void iWantToDoScrollUpAndScrollDown() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.scollUpDown();
	}

	@Then("^I want see trending now right arrow untill visible$")
	public void iWantSeeTrendingNowRightArrowUntillVisible() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.rightArrowVisible();
	}

	@When("^I want to switch socail page$")
	public void iWantToSwitchSocailPage() {
		myaccountpage = new MyAccountPage(driver);
		myaccountpage.switchSocailPage("Twitter");

	}

}
