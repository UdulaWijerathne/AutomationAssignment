package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Browser;
import junit.framework.Assert;

public class MobilePhonePage {

	@FindBy(xpath = "//h3[@class='u7 vV ow-wb bu ve R e4 fw6 tcc vR']")
	List<WebElement> txtModel;

	public MobilePhonePage() {
		PageFactory.initElements(Browser.driver, this);
	}

	public void validateSearchResult() {

		List<WebElement> searchResultModelList = txtModel;

		for (WebElement p : searchResultModelList) {
			String modelName = p.getText().toLowerCase();
			Assert.assertTrue(modelName.contains("iphone 14"));
		}
	}

}
