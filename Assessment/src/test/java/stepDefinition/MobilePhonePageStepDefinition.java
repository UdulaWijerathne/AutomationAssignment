package stepDefinition;

import io.cucumber.java.en.Then;
import pages.MobilePhonePage;

public class MobilePhonePageStepDefinition {

	@Then("user validate that the search results returned matches the search criteria")
	public void userValidateSearchResult() {
		MobilePhonePage mp = new MobilePhonePage();
		mp.validateSearchResult();
	}
}
