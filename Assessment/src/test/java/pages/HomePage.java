package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Browser;

public class HomePage extends Browser {

	@FindBy(xpath = "//*[@id='term-desktop']")
	public WebElement txtBoxSearch;

	@FindBy(xpath = "//button[@id='search-btn']")
	public WebElement btnSearch;

	@FindBy(xpath = "//div[@class='cN ra ei h3']//li[@tabindex=1]")
	public WebElement btnFashion;

	@FindBy(xpath = "//span[@data-vars-lb='name:Dresses | position:0 | level:2']")
	public WebElement btnDresses;

	public HomePage() {
		PageFactory.initElements(Browser.driver, this);
	}

	public void searchItem(String item) {
		
		Browser.waitFor(5);

		txtBoxSearch.sendKeys(item);
		btnSearch.click();

	}

	public void navigateDresses() {
		btnFashion.click();
		btnDresses.click();
	}

}
