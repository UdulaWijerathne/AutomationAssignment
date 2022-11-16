package stepDefinition;

import io.cucumber.java.en.And;
import pages.DressesPage;

public class DressesPageStepDefinition {

	@And("user click on Price sorting then user validate that the results are sorted in descending order of Price")
	public void userClickPriceSorting_ValidateResult() {
		DressesPage dp = new DressesPage();
		dp.PriceDesc();
	}
}
