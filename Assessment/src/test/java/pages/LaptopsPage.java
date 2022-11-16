package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Browser;
import junit.framework.Assert;

public class LaptopsPage {

	@FindBy(xpath = "//div[@class='cN ra ei h3']//li[@tabindex=0]")
	public WebElement btnElectronics;

	@FindBy(xpath = "//span[@data-vars-lb='name:Laptops | position:2 | level:2']")
	public WebElement btnLaptops;

	@FindBy(xpath = "//a[@href='https://iprice.my/dell/computing/laptops/']")
	public WebElement btnDellBrand;

	@FindBy(xpath = "//div[@id='product-list']//h3")
	List<WebElement> txtBrand;

	public LaptopsPage() {
		PageFactory.initElements(Browser.driver, this);
	}

	public void navigateLaptopPage() {
		Browser.waitFor(5);
		this.btnElectronics.click();
		this.btnLaptops.click();

	}

	public void selectBrand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.btnDellBrand.click();

		System.out.println("End Select Brand Method");
	}

	public void validateResult() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		List<WebElement> laptopBrand = txtBrand;

		for (WebElement b : laptopBrand) {
			String txtLapBrand = b.getText().substring(0, 4).toLowerCase();
			Assert.assertEquals("dell", txtLapBrand);
		}
	}

}
