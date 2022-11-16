package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LaptopsPage;

public class LaptopsPageStepDefinition {

	@And("user navigate to laptops page")
	public void userNavigateLaptopPage() {
		LaptopsPage lp = new LaptopsPage();
		lp.navigateLaptopPage();
	}

	@And("user select brand value to Dell")
	public void userSelectBrand() {
		LaptopsPage lp = new LaptopsPage();
		lp.selectBrand();

	}

	@Then("user validate the results")
	public void userValidateResult() {
		LaptopsPage lp = new LaptopsPage();
		lp.validateResult();
	}
}
