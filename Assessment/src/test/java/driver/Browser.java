package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ConstantVaribales;

public class Browser {

	public static WebDriver driver;

	public static WebDriver initiize() {
		if (driver == null) {
			if (ConstantVaribales.browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void openURL(String URL) {
		driver.get(URL);
	}

	public static void quit() {
		driver.quit();
	}

	public static void findElement(String element) {
		driver.findElement(By.xpath(element));
	}
	
	public static void waitFor(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

}
