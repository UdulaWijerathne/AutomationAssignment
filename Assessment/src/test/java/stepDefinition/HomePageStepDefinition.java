package stepDefinition;

import driver.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import util.ConstantVaribales;

public class HomePageStepDefinition extends Browser {

	@Given("user is navigated to Home Page")
	public void webLandingPage() {

		driver = Browser.initiize();
		Browser.openURL(ConstantVaribales.URL);
	}

	@And("user search for {string}")
	public void userSearchItem(String item) {
		HomePage hp = new HomePage();
		hp.searchItem(item);
	}

	@And("user navigate to dresses page")
	public void userNavigateDressespage() {
		HomePage hp = new HomePage();
		hp.navigateDresses();
	}

	@And("Close Browser")
	public void userCloseBrowser() {
		Browser.quit();
	}
}
