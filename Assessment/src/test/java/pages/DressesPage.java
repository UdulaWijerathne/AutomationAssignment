package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.Browser;
import junit.framework.Assert;

public class DressesPage extends Browser {

	@FindBy(xpath = "//a[@href='https://iprice.my/clothing/dresses/?sort=price.net_asc']")
	public WebElement btnAsc;

	@FindBy(xpath = "//a[@href='https://iprice.my/clothing/dresses/?sort=price.net_desc']")
	public WebElement btnDesc;

	@FindBy(xpath = "//h3[@class='u7 vV ow-wb bu ve R e4 fw6 tcc uK vF vT']/../../div[3]/div")
	List<WebElement> txtList;

	public DressesPage() {
		PageFactory.initElements(Browser.driver, this);
	}

	public void PriceDesc() {
		
		Browser.waitFor(4);
		
		// Click on Descending order sort button
		btnAsc.click();
		btnDesc.click();

		List<WebElement> afterFilterPrice = txtList;
		List<Double> afterFilterPriceList = new ArrayList<Double>();

		for (WebElement p : afterFilterPrice) {
			afterFilterPriceList.add(Double.valueOf(p.getText().replace("RM", "").replace(",", "")));
		}

		// Clone arrayList
		ArrayList<Double> cloneArrayPriceList = new ArrayList<>(afterFilterPriceList);

		System.out.println("Normal List : ");
		for (Double str : cloneArrayPriceList)
			System.out.println(str);

		// Sort ArrayList to Descending order
		Collections.sort(afterFilterPriceList, Collections.reverseOrder());

		System.out.println("ArrayList in descending order:");
		for (Double str : afterFilterPriceList) {
			System.out.println(str);
		}

		// Verify the Descending Data
		Assert.assertEquals(afterFilterPriceList, cloneArrayPriceList);
		
	}

}
